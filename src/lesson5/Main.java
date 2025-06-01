package lesson5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Есть 3 стороны треугольника, напечатать на консоль его периметр");
        int a = 5;
        int b = 7;
        int c = 9;

        System.out.println("Вариант 1. С методом void");
        MathUtilsPerimetr.calculateTrianglePerimeter(a, b, c);

        System.out.println("Вариант 2. С методом возвращающим значение");
        int perimeter = MathUtilsPerimetr.calculateTrianglePerimeterAndReturn(a, b, c);
        System.out.println("Периметр треугольника равен: " + perimeter);
    }
}
