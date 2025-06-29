package lesson9.lesson9HomeWork.part1;

public class Triangle extends Shape {
    public Triangle(int a, int b) {
        super(a, b);
    }

    @Override
    public void calculateArea() {
        double TriangleArea = a *b*0.5;
        System.out.println("Площадь треугольника равна "+TriangleArea);
    }
}
