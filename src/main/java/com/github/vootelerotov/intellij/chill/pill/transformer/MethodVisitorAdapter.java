package com.github.vootelerotov.intellij.chill.pill.transformer;

import org.objectweb.asm.*;

class MethodVisitorAdapter extends MethodVisitor  {

  private final MethodVisitor delegate;

  public MethodVisitorAdapter(MethodVisitor delegate) {
    super(Opcodes.ASM9);

    this.delegate = delegate;
  }

  @Override
  public void visitParameter(String name, int access) {
    delegate.visitParameter(name, access);
  }

  @Override
  public AnnotationVisitor visitAnnotationDefault() {
    return delegate.visitAnnotationDefault();
  }

  @Override
  public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
    return delegate.visitAnnotation(descriptor, visible);
  }

  @Override
  public AnnotationVisitor visitTypeAnnotation(int typeRef, TypePath typePath, String descriptor, boolean visible) {
    return delegate.visitTypeAnnotation(typeRef, typePath, descriptor, visible);
  }

  @Override
  public void visitAnnotableParameterCount(int parameterCount, boolean visible) {
    delegate.visitAnnotableParameterCount(parameterCount, visible);
  }

  @Override
  public AnnotationVisitor visitParameterAnnotation(int parameter, String descriptor, boolean visible) {
    return delegate.visitParameterAnnotation(parameter, descriptor, visible);
  }

  @Override
  public void visitAttribute(Attribute attribute) {
    delegate.visitAttribute(attribute);
  }

  @Override
  public void visitCode() {
    delegate.visitCode();
  }

  @Override
  public void visitFrame(int type, int numLocal, Object[] local, int numStack, Object[] stack) {
    delegate.visitFrame(type, numLocal, local, numStack, stack);
  }

  @Override
  public void visitInsn(int opcode) {
    delegate.visitInsn(opcode);
  }

  @Override
  public void visitIntInsn(int opcode, int operand) {
    delegate.visitIntInsn(opcode, operand);
  }

  @Override
  public void visitVarInsn(int opcode, int var) {
    delegate.visitVarInsn(opcode, var);
  }

  @Override
  public void visitTypeInsn(int opcode, String type) {
    delegate.visitTypeInsn(opcode, type);
  }

  @Override
  public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
    delegate.visitFieldInsn(opcode, owner, name, descriptor);
  }

  @Override
  public void visitMethodInsn(int opcode, String owner, String name, String descriptor) {
    delegate.visitMethodInsn(opcode, owner, name, descriptor);
  }

  @Override
  public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
    delegate.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
  }

  @Override
  public void visitInvokeDynamicInsn(String name, String descriptor, Handle bootstrapMethodHandle, Object... bootstrapMethodArguments) {
    delegate.visitInvokeDynamicInsn(name, descriptor, bootstrapMethodHandle, bootstrapMethodArguments);
  }

  @Override
  public void visitJumpInsn(int opcode, Label label) {
    delegate.visitJumpInsn(opcode, label);
  }

  @Override
  public void visitLabel(Label label) {
    delegate.visitLabel(label);
  }

  @Override
  public void visitLdcInsn(Object value) {
    delegate.visitLdcInsn(value);
  }

  @Override
  public void visitIincInsn(int var, int increment) {
    delegate.visitIincInsn(var, increment);
  }

  @Override
  public void visitTableSwitchInsn(int min, int max, Label dflt, Label... labels) {
    delegate.visitTableSwitchInsn(min, max, dflt, labels);
  }

  @Override
  public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) {
    delegate.visitLookupSwitchInsn(dflt, keys, labels);
  }

  @Override
  public void visitMultiANewArrayInsn(String descriptor, int numDimensions) {
    delegate.visitMultiANewArrayInsn(descriptor, numDimensions);
  }

  @Override
  public AnnotationVisitor visitInsnAnnotation(int typeRef, TypePath typePath, String descriptor, boolean visible) {
    return delegate.visitInsnAnnotation(typeRef, typePath, descriptor, visible);
  }

  @Override
  public void visitTryCatchBlock(Label start, Label end, Label handler, String type) {
    delegate.visitTryCatchBlock(start, end, handler, type);
  }

  @Override
  public AnnotationVisitor visitTryCatchAnnotation(int typeRef, TypePath typePath, String descriptor, boolean visible) {
    return delegate.visitTryCatchAnnotation(typeRef, typePath, descriptor, visible);
  }

  @Override
  public void visitLocalVariable(String name, String descriptor, String signature, Label start, Label end, int index) {
    delegate.visitLocalVariable(name, descriptor, signature, start, end, index);
  }

  @Override
  public AnnotationVisitor visitLocalVariableAnnotation(int typeRef, TypePath typePath, Label[] start, Label[] end, int[] index, String descriptor, boolean visible) {
    return delegate.visitLocalVariableAnnotation(typeRef, typePath, start, end, index, descriptor, visible);
  }

  @Override
  public void visitLineNumber(int line, Label start) {
    delegate.visitLineNumber(line, start);
  }

  @Override
  public void visitMaxs(int maxStack, int maxLocals) {
    delegate.visitMaxs(maxStack, maxLocals);
  }

  @Override
  public void visitEnd() {
    delegate.visitEnd();
  }
}