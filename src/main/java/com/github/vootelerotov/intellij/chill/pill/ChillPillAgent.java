
package com.github.vootelerotov.intellij.chill.pill;

import com.github.vootelerotov.intellij.chill.pill.transformer.CorruptionMarkerTransformer;
import java.lang.instrument.Instrumentation;

public class ChillPillAgent {

  public static void premain(String args, Instrumentation inst) {
    inst.addTransformer(new CorruptionMarkerTransformer());
  }
}