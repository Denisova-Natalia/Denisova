package lesson9;

public class Cat extends Animal {

    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }
    // Смотреть на хозяина с презрением

    public void lookAtOwnerWithContempt() {
        System.out.println("Смотрю на хозяина с презрением");
    }

    @Override
    public void move() {
        System.out.println("Бегаю тихо как ниньзя");
    }

    @Override
    public void eat() {
        System.out.println("Ем сухой корм и хрумкаю");
    }
}
