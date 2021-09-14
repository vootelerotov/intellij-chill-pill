package com.github.vootelerotov.intellij.chill.pill.transformer

import org.objectweb.asm.*

open class ClassVisitorAdapter(private val delegate: ClassVisitor) : ClassVisitor(Opcodes.ASM9) {

  override fun visit(
    version: Int,
    access: Int,
    name: String?,
    signature: String?,
    superName: String?,
    interfaces: Array<out String>?
  ) {
    delegate.visit(version, access, name, signature, superName, interfaces)
  }

  override fun visitSource(source: String?, debug: String?) {
    delegate.visitSource(source, debug)
  }

  override fun visitModule(name: String?, access: Int, version: String?): ModuleVisitor {
    return delegate.visitModule(name, access, version)
  }

  override fun visitNestHost(nestHost: String?) {
    delegate.visitNestHost(nestHost)
  }

  override fun visitOuterClass(owner: String?, name: String?, descriptor: String?) {
    delegate.visitOuterClass(owner, name, descriptor)
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

  override fun visitAttribute(attribute: Attribute?) {
    delegate.visitAttribute(attribute)
  }

  override fun visitNestMember(nestMember: String?) {
    delegate.visitNestMember(nestMember)
  }

  override fun visitPermittedSubclass(permittedSubclass: String?) {
    delegate.visitPermittedSubclass(permittedSubclass)
  }

  override fun visitInnerClass(name: String?, outerName: String?, innerName: String?, access: Int) {
    delegate.visitInnerClass(name, outerName, innerName, access)
  }

  override fun visitRecordComponent(name: String?, descriptor: String?, signature: String?): RecordComponentVisitor {
    return delegate.visitRecordComponent(name, descriptor, signature)
  }

  override fun visitField(
    access: Int,
    name: String?,
    descriptor: String?,
    signature: String?,
    value: Any?
  ): FieldVisitor {
    return delegate.visitField(access, name, descriptor, signature, value)
  }

  override fun visitMethod(
    access: Int,
    name: String?,
    descriptor: String?,
    signature: String?,
    exceptions: Array<out String>?
  ): MethodVisitor {
    return delegate.visitMethod(access, name, descriptor, signature, exceptions)
  }

  override fun visitEnd() {
    delegate.visitEnd()
  }
}