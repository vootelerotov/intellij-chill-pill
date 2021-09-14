@file:JvmName("ChillPillAgent")

package com.github.vootelerotov.intellij.chill.pill

import com.github.vootelerotov.intellij.chill.pill.transformer.CorruptionMarkerTransformer
import java.lang.instrument.Instrumentation

fun premain(args: String?, inst: Instrumentation) {
  inst.addTransformer(CorruptionMarkerTransformer())
}