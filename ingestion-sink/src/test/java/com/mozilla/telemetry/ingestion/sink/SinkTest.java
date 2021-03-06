package com.mozilla.telemetry.ingestion.sink;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

public class SinkTest {

  @Rule
  public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

  @Test(expected = IllegalArgumentException.class)
  public void failsOnMissingInput() {
    environmentVariables.set("OUTPUT_TABLE", "dataset.table");
    Sink.main(null);
  }
}
