package lesson9.lesson9HomeWork.part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добрый день! Выберите фигуру, у какой вы хотите посчитать площадь");
        System.out.println("1 - круг");
        System.out.println("2 - прямоугольник");
        System.out.println("3 - треугольник");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {

            System.out.println("Введите радиус круга: ");
            int radius = scanner.nextInt();
            Circle circle = new Circle(radius);
            circle.calculateArea();
        }
        else if (choice == 2) {
            System.out.println("Введите длину стороны а");
            int a = scanner.nextInt();
            System.out.println("Ведите длину стороны b");
            int b = scanner.nextInt();
            Rectangle rectangle = new Rectangle(a, b);
            rectangle.calculateArea();
        }
        else if (choice == 3) {
            System.out.println("Введите длину основания а");
            int a = scanner.nextInt();
            System.out.println("Введите длину высоты b");
            int b = scanner.nextInt();
            Triangle triangle = new Triangle(a, b);
            triangle.calculateArea();
        }
    }
}
