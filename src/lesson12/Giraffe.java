package lesson12;

public class Giraffe extends Animal {
    public Giraffe(String name, String color, String food, int age) {
        super(name, color, food, age);
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " жираф хожу на длинных ногах");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " жираф жую листья с верхушек деревьев");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " жираф сплю когда ночь");
    }
}
