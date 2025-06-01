package lesson5;

import java.util.Scanner;

import static lesson5.MathUtilsArea.*;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Добрый день! Что вы хотите вычислить? \nПериметр - нажмите 1 \nПлощадь - нажмите 2");
        Scanner scanner1 = new Scanner(System.in);
        int userChoice1 = scanner1.nextInt();

        if (userChoice1 == 1)
        {
            System.out.println(" Я кальтулятор периметров фигур");
            System.out.println("Выберете фигуру, по которой выхотите посчитать периметр");
            System.out.println("1 - треугольник");
            System.out.println("2 - квадрат");
            System.out.println("3 - круг");
            System.out.println("4 - трапеция");
            System.out.println("5 - элипс");

            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            if (userChoice == 1)
            {
                System.out.println("Введите длину стороны а");
                int a = scanner.nextInt();
                System.out.println("Введите длину стороны b");
                int b = scanner.nextInt();
                System.out.println("Введите длину стороны c");
                int c = scanner.nextInt();

                int perimeter = MathUtilsPerimetr.calculateTrianglePerimeterAndReturn(a, b, c);
                System.out.println("Периметр треугольника равен : " + perimeter);
            }
            else if (userChoice == 2)
            {
                System.out.println("Введите длину стороны а");
                int a = scanner.nextInt();
                int perimeter = MathUtilsPerimetr.calculateSquarePerimeter(a);
                System.out.println("Периметр равен: " + perimeter);
            }
            else if (userChoice == 3)
            {
                System.out.println("Введите радиус окружности ");
                int a = scanner.nextInt();
                double perimeter = MathUtilsPerimetr.calculateCirclePerimeter(a);
                System.out.println("Длина окружности : " + perimeter);
            }
            else if (userChoice == 4) {
                System.out.println("Введите длину стороны а");
                int a = scanner.nextInt();
                System.out.println("Введите длину стороны b");
                int b = scanner.nextInt();
                System.out.println("Введите длину стороны c");
                int c = scanner.nextInt();
                System.out.println("Введите длину сторону d");
                int d = scanner.nextInt();
                int perimeter = MathUtilsPerimetr.calculateTrapeziumPerimeter(a, b, c, d);
                System.out.println("Периметр трапеции равен : " + perimeter);
            }
            else if (userChoice == 5)
            {
                System.out.println("Введите длину оси а");
                int a = scanner.nextInt();
                System.out.println("Введите длину оси b");
                int b = scanner.nextInt();
                double perimeter = MathUtilsPerimetr.calculateOvalPerimeter(a, b);
                System.out.println("Периметр элипсa : " + perimeter);
            }
            else {
                System.out.println("Такой функции нет, выберите фигуру из списка.");
            }
        }
        else if (userChoice1==2)
        {
            System.out.println(" Я кальтулятор площадей фигур");
            System.out.println("Выберете фигуру, по которой выхотите посчитать площадь");
            System.out.println("1 - треугольник");
            System.out.println("2 - квадрат");
            System.out.println("3 - круг");
            System.out.println("4 - трапеция");
            System.out.println("5 - элипс");

            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            if (userChoice == 1)
            {
                System.out.println("Введите основание");
                int a = scanner.nextInt();
                System.out.println("Введите высоту");
                int h = scanner.nextInt();
            }
            else if (userChoice == 2)
            {

            }
            else if (userChoice == 3)
            {

            }
            else if (userChoice == 4) {

            }
            else if (userChoice == 5)
            {

            }
            else {
                System.out.println("Такой функции нет, выберите фигуру из списка.");
            }



        }
        else {
            System.out.println("Thank you");
        }
    }

}
