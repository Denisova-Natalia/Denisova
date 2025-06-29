package lesson9.lesson9HomeWork.part1;

public class Circle extends Shape {

    public Circle(int a) {
        super(a);
    }
    @Override
    public void calculateArea() {
        double CircleArea = Math.PI *  Math.pow(a,2);
        System.out.println("Площадь круга равна = "+CircleArea);
    }
}
