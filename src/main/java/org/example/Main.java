package org.example;

public class Main {

  public static void main(String[] args) {

    String expression = "10 cm + 1 m - 10 mm";

    int result = Converter.calculateExpression(expression);
    System.out.println(result);
  }
}
