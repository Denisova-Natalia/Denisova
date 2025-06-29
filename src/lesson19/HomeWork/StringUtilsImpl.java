package lesson19.HomeWork;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Arguments cannot be null");
        }

        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);

        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }

        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("Text of word is null");
        }
        ArrayList<Integer> indixes = new ArrayList<>();
        int index = 0;

        while ((index = text.indexOf(word, index)) != -1) {
            indixes.add(index);
            index = text.indexOf(word, index);
        }
        int[] result = new int[indixes.size()];
         for (int i = 0; i < indixes.size(); i++) {
             result[i] = indixes.get(i);
         }
        return result;
    }

    @Override
    public void findNumbers(String text) throws CustomException {
        Pattern pattern = Pattern.compile("-?\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(text);

        ArrayList<Double> numbers = new ArrayList<>();
        while (matcher.find()) {
            numbers.add(Double.parseDouble(matcher.group()));
        }
        if(numbers.isEmpty()) {
            throw new CustomException("Not found");
        }

      //  return numbers.stream().mapToDouble(d ->).toArray();
    }
}

