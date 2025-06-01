package lesson12;

import lesson12.interfaces.Huntable;

public class Tiger extends Animal implements Huntable {
    public Tiger(String name, String color, String food, int age) {
        super(name, color, food, age);
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " тигр двигаюсь быстро");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " тигр ем свежее мясо");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " тигр сплю сладко");
    }

    @Override
    public void hunt() {
        System.out.println(super.getName() + " тигр люблю охотиться");
    }
}
