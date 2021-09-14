package com.github.vootelerotov.intellij.chill.pill.transformer;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

public class CorruptionMarkerTransformer implements ClassFileTransformer {

  @Override
  public byte[] transform(
      ClassLoader loader,
      String className,
      Class<?> classBeingRedefined,
      ProtectionDomain protectionDomain,
      byte[] classfileBuffer
  ) {
    if (className == null) {
      return null;
    }

    if (!className.equals("com/intellij/util/indexing/CorruptionMarker")) {
      return null;
    }

    return patchMarkAsDirty(classfileBuffer);
  }

  private byte[] patchMarkAsDirty(byte[] classfileBuffer) {
    ClassReader classReader = new ClassReader(classfileBuffer);
    ClassWriter classWriter = new ClassWriter(classReader, ClassWriter.COMPUTE_FRAMES);
    classReader.accept(new CorruptionMarkerVisitor(classWriter), ClassReader.SKIP_FRAMES);

    return classWriter.toByteArray();
  }
}