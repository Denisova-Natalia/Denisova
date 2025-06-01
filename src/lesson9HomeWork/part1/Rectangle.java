package lesson9HomeWork.part1;

public class Rectangle extends Shape {

    public Rectangle(int a, int b) {
        super(a, b);
    }
    @Override
    public void calculateArea() {
        int RectangleArea = a * b;
        System.out.println("Площадь прямоугольника равна "+RectangleArea);
    }
}
