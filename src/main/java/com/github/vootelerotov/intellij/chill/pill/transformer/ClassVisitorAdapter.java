package com.github.vootelerotov.intellij.chill.pill.transformer;

import org.objectweb.asm.*;

class ClassVisitorAdapter extends ClassVisitor {

  private final ClassVisitor delegate;

  public ClassVisitorAdapter(ClassVisitor delegate) {
    super(Opcodes.ASM9);
    this.delegate = delegate;
  }

  @Override
  public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
    delegate.visit(version, access, name, signature, superName, interfaces);
  }

  @Override
  public void visitSource(String source, String debug) {
    delegate.visitSource(source, debug);
  }

  @Override
  public ModuleVisitor visitModule(String name, int access, String version) {
    return delegate.visitModule(name, access, version);
  }

  @Override
  public void visitNestHost(String nestHost) {
    delegate.visitNestHost(nestHost);
  }

  @Override
  public void visitOuterClass(String owner, String name, String descriptor) {
    delegate.visitOuterClass(owner, name, descriptor);
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
  public void visitAttribute(Attribute attribute) {
    delegate.visitAttribute(attribute);
  }

  @Override
  public void visitNestMember(String nestMember) {
    delegate.visitNestMember(nestMember);
  }

  @Override
  public void visitPermittedSubclass(String permittedSubclass) {
    delegate.visitPermittedSubclass(permittedSubclass);
  }

  @Override
  public void visitInnerClass(String name, String outerName, String innerName, int access) {
    delegate.visitInnerClass(name, outerName, innerName, access);
  }

  @Override
  public RecordComponentVisitor visitRecordComponent(String name, String descriptor, String signature) {
    return delegate.visitRecordComponent(name, descriptor, signature);
  }

  @Override
  public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
    return delegate.visitField(access, name, descriptor, signature, value);
  }

  @Override
  public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
    return delegate.visitMethod(access, name, descriptor, signature, exceptions);
  }

  @Override
  public void visitEnd() {
    delegate.visitEnd();
  }
}