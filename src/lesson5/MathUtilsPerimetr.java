package lesson5;

public class MathUtilsPerimetr {
    // Сделаем метод, который посчитает периметр по трем сторонам
    public static void calculateTrianglePerimeter (int a, int b, int c) {
        int perimeter = (a + b + c);
        System.out.println("Периметр треугольника равен: " + perimeter);
    }

    public static int calculateTrianglePerimeterAndReturn (int a, int b, int c) {
        int perimeter = (a + b + c);
        return perimeter;
    }
    public static int calculateSquarePerimeter (int a) {
        int perimeter = (a * 4);
        return perimeter;
    }
    public static double calculateCirclePerimeter (int a) {
        double perimeter = (Math.PI * a*2);
        return perimeter;
    }
    public static int calculateTrapeziumPerimeter (int a, int b, int c, int d) {
        int perimeter = (a + b + c + d);
        return perimeter;
    }
    public static double calculateOvalPerimeter (int a, int d) {
        double perimeter = 2*Math.PI*Math.sqrt((Math.pow(a,2)+Math.pow(d,2))/8);
        return perimeter;
        }
}

