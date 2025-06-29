package lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<>();
            list.get(10);
            //           int result = 10 / 0;
            //           System.out.println("Результат" + result);
        } catch (ArithmeticException exception) {
            System.out.println("Ошибка: нельзя делить на ноль");
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Ошибка : выход за пределы массива");
        } catch (RuntimeException exception) {
            System.out.println("Ошибка: не удалось определить тип ошибки" + exception.getMessage());
        }

        //try with resourses - автовызов close после использования

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите текст: ");
            int value = scanner.nextInt();
            System.out.println("Ваш текст: " + value);
        }
        //Альтернатива
 //       Scanner scanner = new Scanner(System.in) {
 //           System.out.println("Введите текст: ");
 //           int value = scanner.nextInt();
 //           System.out.println("Ваш текст: "+value);
 //           scanner.close();
        }
    }

