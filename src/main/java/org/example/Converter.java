package org.example;

public class Converter {

  /*
   * This method is used to perform addition and subtraction calculations between different metric units;
   * The expression is divided into several parts, using the split method, and then each part is analyzed;
   * If the analyzed part is the sign '+' or '-', then change the sign if necessary and move to the next part;
   * if it's not a sign, then it has the form '10 cm', meaning a value + unit of measurement.
   * The specific part of this string is stored in the variables 'value' and 'unit' using replaceAll,
   * so when storing in an int variable, all characters are replaced, leaving only the digits,
   * and for measurement units, all non-characters are replaced;
   * Next, a conversion of the unit of measurement is performed using the enum from the ConverterToMm class,
   * so any unit of measurement is converted to mm according to the established rules.
   * Finally, the result is updated by adding the value converted to mm multiplied by the sign determined in the first phase.
   * The method returns an integer.
   */
  public static int calculateExpression(String expression) {

    if (expression.isEmpty()) {
      return 0;
    }

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
