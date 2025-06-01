package lesson12;

import lesson12.interfaces.Flyable;

public class Swan extends Animal implements Flyable {
    public Swan(String name, String color, String food, int age) {
        super(name, color, food, age);
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " лебедь летаю высоко и красиво");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " лебедь ем рыбу");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " лебедь сплю под кустом");
    }

    @Override
    public void fly() {
        System.out.println(super.getName() + " лебедь лечу!!");
    }
}
