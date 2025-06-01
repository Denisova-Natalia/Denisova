package lesson9HomeWork.part1;

public abstract class Shape {


    public int a;
    public int b;

    public Shape(int b, int a) {
        this.b = b;
        this.a = a;
    }
    public Shape(int a) {
        this.a = a;
    }
    public abstract void calculateArea();
}
