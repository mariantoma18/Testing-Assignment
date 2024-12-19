package org.example;

import junit.framework.TestCase;

public class ConverterTest extends TestCase {

  public void calculateExpressionTest() {
    String expression = "10 cm + 1 m - 10 mm";
    int result = Converter.calculateExpression(expression);
    assertEquals(1090,result);
  }


}
