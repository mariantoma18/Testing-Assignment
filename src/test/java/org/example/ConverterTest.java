package org.example;

import junit.framework.TestCase;

public class ConverterTest extends TestCase {

  public void testCalculateExpressionWithNoMetricUnits() {
    String expression = "";
    int result = Converter.calculateExpression(expression);
    assertEquals(0, result);
  }

  public void testCalculateExpressionWithOneMetricUnits() {
    String expression = "10 cm";
    int result = Converter.calculateExpression(expression);
    assertEquals(100, result);
  }

  public void testCalculateExpressionWithTwoMetricUnits() {
    String expression = "10 cm + 1 m";
    int result = Converter.calculateExpression(expression);
    assertEquals(1100, result);
  }

  public void testCalculateExpressionWithThreeMetricUnits() {
    String expression = "10 cm + 1 m - 10 mm";
    int result = Converter.calculateExpression(expression);
    assertEquals(1090, result);
  }
}
