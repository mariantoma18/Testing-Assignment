package org.example;

public enum ConverterToMm {
  mm(1),
  cm(10),
  dm(100),
  m(1000),
  km(1000000);

  private int valueToMm;

  ConverterToMm(int valueToBeConverted) {
    this.valueToMm = valueToBeConverted;
  }

  public int getValueToMm() {
    return valueToMm;
  }
}
