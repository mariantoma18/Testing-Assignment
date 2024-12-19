package org.example;

public class Converter {

  public static int calculateExpression(String expression) {

    int sign = 1;
    int result = 0;
    String[] parts = expression.split(" (?=[+-])|(?<=[+-]) ");

    for (String part : parts) {

      if (part.equals("+")) {
        sign = 1;
        continue;
      } else if (part.equals("-")) {
        sign = -1;
        continue;
      }

      int value = Integer.parseInt(part.replaceAll("[a-zA-Z]+", "").trim());
      String unit = part.replaceAll("[^a-zA-Z]+", "").trim();

      ConverterToMm unitConvertedToMm = ConverterToMm.valueOf(unit);

      int valueConvertedToMm = value * unitConvertedToMm.getValueToMm();

      result += sign * valueConvertedToMm;
    }
    return result;
  }
}
