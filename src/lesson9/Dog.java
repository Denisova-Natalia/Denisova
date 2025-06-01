package lesson9;

public class Dog extends Animal {

    public Dog(String name,int age, int weight) {
        super(name, age, weight);
    }
    public void runTheBall() {
        System.out.println("Бегу за мячиком в припрыжку");
    }
    public void beAGoodBoy() {
        System.out.println("Я хороший пес");
    }

    @Override
    public void move() {
        System.out.println("Бегаю и радостно виляю хвостом");
    }

    @Override
    public void eat() {
        System.out.println("Громко грызу кость");
    }
}
