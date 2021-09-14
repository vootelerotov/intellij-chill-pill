package com.github.vootelerotov.intellij.chill.pill.transformer

import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import java.lang.instrument.ClassFileTransformer
import java.security.ProtectionDomain

class CorruptionMarkerTransformer : ClassFileTransformer {

  override fun transform(
    loader: ClassLoader?,
    className: String?,
    classBeingRedefined: Class<*>?,
    protectionDomain: ProtectionDomain?,
    classfileBuffer: ByteArray?
  ): ByteArray? {
    if (className == null) {
      return null;
    }

    if (className != "com/intellij/util/indexing/CorruptionMarker") {
      return null;
    }

    println("This is for debugging")
    println("Another line for debugging")
    return patchMarkAsDirty(classfileBuffer!!)
  }

  private fun patchMarkAsDirty(classfileBuffer: ByteArray): ByteArray? {
    val classReader = ClassReader(classfileBuffer)
    val classWriter = ClassWriter(classReader, ClassWriter.COMPUTE_FRAMES)
    classReader.accept(CorruptionMarkerVisitor(classWriter), ClassReader.SKIP_FRAMES);

    return classWriter.toByteArray()
  }
}