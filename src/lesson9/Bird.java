package lesson9;

public class Bird extends Animal {

    public Bird(String name, int age, int weight) {
        super(name, age, weight);
    }

    public void fly() {
        System.out.println("Лечу на юг");
    }

    @Override
    public void move() {
        System.out.println("Летаю высоко в небе");
    }

    @Override
    public void eat() {
        System.out.println("Кладу червяка в клюв и проглатываю его");
    }
}
