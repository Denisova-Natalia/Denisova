package lesson12;

import lesson12.interfaces.Flyable;
import lesson12.interfaces.Huntable;

public class Eagle extends Animal implements Flyable, Huntable {
    @Override
    public void fly() {
        System.out.println(super.getName() + " орел лечу!");
    }

    public Eagle(String name, String color, String food, int age) {
        super(name, color, food, age);
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " орел летаю в небе");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " орел ем насекомых");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " орел сплю в гнезде");
    }

    @Override
    public void hunt() {
        System.out.println(super.getName() + " орел падаю с неба за добычей");
    }
}

