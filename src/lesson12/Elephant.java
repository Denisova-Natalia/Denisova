package lesson12;

public class Elephant extends Animal {
    public Elephant(String name, String color, String food, int age) {
        super(name, color, food, age);
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " слон двигаюсь медленно, неторопливо");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " слон ем арбузы");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " слон сплю стоя");
    }
}
