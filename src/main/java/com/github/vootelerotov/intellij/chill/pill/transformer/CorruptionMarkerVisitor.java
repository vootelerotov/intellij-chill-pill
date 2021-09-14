package com.github.vootelerotov.intellij.chill.pill.transformer;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

class CorruptionMarkerVisitor extends ClassVisitorAdapter {

  public CorruptionMarkerVisitor(ClassVisitor delegate) {
    super(delegate);
  }

  @Override
  public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
    MethodVisitor methodVisitor = super.visitMethod(access, name, descriptor, signature, exceptions);

    if (name.equals("markIndexesAsDirty")) {
      return new MarkIndexesAsDirtyVisitor(methodVisitor);
    }

    return methodVisitor;
  }

  private static class MarkIndexesAsDirtyVisitor extends MethodVisitorAdapter {

    public MarkIndexesAsDirtyVisitor(MethodVisitor delegate) {
      super(delegate);
    }

    @Override
    public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
      if (name.equals("createCorruptionMarker")) {
        System.out.println("Feed IntelliJ a chill-pill, no corruption marker will be created!");
      } else {
        super.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
      }
    }
  }

}




