package com.github.vootelerotov.intellij.chill.pill.transformer

import org.objectweb.asm.ClassWriter
import org.objectweb.asm.MethodVisitor

class CorruptionMarkerVisitor(private val delegate : ClassWriter) : ClassVisitorAdapter(delegate)  {

  override fun visitMethod(
    access: Int,
    name: String?,
    descriptor: String?,
    signature: String?,
    exceptions: Array<out String>?
  ): MethodVisitor {
    val methodVisitor = super.visitMethod(access, name, descriptor, signature, exceptions)
    if (name != null && name == "markIndexesAsDirty" ) {
      return MarkIndexesAsDirtyVisitor(methodVisitor)
    }

    return methodVisitor
  }

  class MarkIndexesAsDirtyVisitor(delegate: MethodVisitor) : MethodVisitorAdapter(delegate) {

    override fun visitMethodInsn(
      opcode: Int,
      owner: String?,
      name: String?,
      descriptor: String?,
      isInterface: Boolean
    ) {
      if (name == "createCorruptionMarker") {
        println("Feed IntelliJ a chill-pill, no corruption marker will be created!")
      }
      else {
        super.visitMethodInsn(opcode, owner, name, descriptor, isInterface)
      }
    }
  }
}
