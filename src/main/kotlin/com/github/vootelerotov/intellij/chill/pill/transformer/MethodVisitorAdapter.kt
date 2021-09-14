package com.github.vootelerotov.intellij.chill.pill.transformer

import org.objectweb.asm.*

open class MethodVisitorAdapter(val delegate: MethodVisitor) : MethodVisitor(Opcodes.ASM9) {

  override fun visitParameter(name: String?, access: Int) {
    delegate.visitParameter(name, access)
  }

  override fun visitAnnotationDefault(): AnnotationVisitor {
    return delegate.visitAnnotationDefault()
  }

  override fun visitAnnotation(descriptor: String?, visible: Boolean): AnnotationVisitor {
    return delegate.visitAnnotation(descriptor, visible)
  }

  override fun visitTypeAnnotation(
    typeRef: Int,
    typePath: TypePath?,
    descriptor: String?,
    visible: Boolean
  ): AnnotationVisitor {
    return delegate.visitTypeAnnotation(typeRef, typePath, descriptor, visible)
  }

  override fun visitAnnotableParameterCount(parameterCount: Int, visible: Boolean) {
    delegate.visitAnnotableParameterCount(parameterCount, visible)
  }

  override fun visitParameterAnnotation(parameter: Int, descriptor: String?, visible: Boolean): AnnotationVisitor {
    return delegate.visitParameterAnnotation(parameter, descriptor, visible)
  }

  override fun visitAttribute(attribute: Attribute?) {
    delegate.visitAttribute(attribute)
  }

  override fun visitCode() {
    delegate.visitCode()
  }

  override fun visitFrame(type: Int, numLocal: Int, local: Array<out Any>?, numStack: Int, stack: Array<out Any>?) {
    delegate.visitFrame(type, numLocal, local, numStack, stack)
  }

  override fun visitInsn(opcode: Int) {
    delegate.visitInsn(opcode)
  }

  override fun visitIntInsn(opcode: Int, operand: Int) {
    delegate.visitIntInsn(opcode, operand)
  }

  override fun visitVarInsn(opcode: Int, `var`: Int) {
    delegate.visitVarInsn(opcode, `var`)
  }

  override fun visitTypeInsn(opcode: Int, type: String?) {
    delegate.visitTypeInsn(opcode, type)
  }

  override fun visitFieldInsn(opcode: Int, owner: String?, name: String?, descriptor: String?) {
    delegate.visitFieldInsn(opcode, owner, name, descriptor)
  }

  override fun visitMethodInsn(opcode: Int, owner: String?, name: String?, descriptor: String?) {
    delegate.visitMethodInsn(opcode, owner, name, descriptor)
  }

  override fun visitMethodInsn(opcode: Int, owner: String?, name: String?, descriptor: String?, isInterface: Boolean) {
    delegate.visitMethodInsn(opcode, owner, name, descriptor, isInterface)
  }

  override fun visitInvokeDynamicInsn(
    name: String?,
    descriptor: String?,
    bootstrapMethodHandle: Handle?,
    vararg bootstrapMethodArguments: Any?
  ) {
    delegate.visitInvokeDynamicInsn(name, descriptor, bootstrapMethodHandle, *bootstrapMethodArguments)
  }

  override fun visitJumpInsn(opcode: Int, label: Label?) {
    delegate.visitJumpInsn(opcode, label)
  }

  override fun visitLabel(label: Label?) {
    delegate.visitLabel(label)
  }

  override fun visitLdcInsn(value: Any?) {
    delegate.visitLdcInsn(value)
  }

  override fun visitIincInsn(`var`: Int, increment: Int) {
    delegate.visitIincInsn(`var`, increment)
  }

  override fun visitTableSwitchInsn(min: Int, max: Int, dflt: Label?, vararg labels: Label?) {
    delegate.visitTableSwitchInsn(min, max, dflt, *labels)
  }

  override fun visitLookupSwitchInsn(dflt: Label?, keys: IntArray?, labels: Array<out Label>?) {
    delegate.visitLookupSwitchInsn(dflt, keys, labels)
  }

  override fun visitMultiANewArrayInsn(descriptor: String?, numDimensions: Int) {
    delegate.visitMultiANewArrayInsn(descriptor, numDimensions)
  }

  override fun visitInsnAnnotation(
    typeRef: Int,
    typePath: TypePath?,
    descriptor: String?,
    visible: Boolean
  ): AnnotationVisitor {
    return delegate.visitInsnAnnotation(typeRef, typePath, descriptor, visible)
  }

  override fun visitTryCatchBlock(start: Label?, end: Label?, handler: Label?, type: String?) {
    delegate.visitTryCatchBlock(start, end, handler, type)
  }

  override fun visitTryCatchAnnotation(
    typeRef: Int,
    typePath: TypePath?,
    descriptor: String?,
    visible: Boolean
  ): AnnotationVisitor {
    return delegate.visitTryCatchAnnotation(typeRef, typePath, descriptor, visible)
  }

  override fun visitLocalVariable(
    name: String?,
    descriptor: String?,
    signature: String?,
    start: Label?,
    end: Label?,
    index: Int
  ) {
    delegate.visitLocalVariable(name, descriptor, signature, start, end, index)
  }

  override fun visitLocalVariableAnnotation(
    typeRef: Int,
    typePath: TypePath?,
    start: Array<out Label>?,
    end: Array<out Label>?,
    index: IntArray?,
    descriptor: String?,
    visible: Boolean
  ): AnnotationVisitor {
    return delegate.visitLocalVariableAnnotation(typeRef, typePath, start, end, index, descriptor, visible)
  }

  override fun visitLineNumber(line: Int, start: Label?) {
    delegate.visitLineNumber(line, start)
  }

  override fun visitMaxs(maxStack: Int, maxLocals: Int) {
    delegate.visitMaxs(maxStack, maxLocals)
  }

  override fun visitEnd() {
    delegate.visitEnd()
  }
}