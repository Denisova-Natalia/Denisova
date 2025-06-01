package lesson7;

public class Main {
    private static String name;

    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 15, 14);
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());
        dog.sayName();
        System.out.println("Меняем возраст и вес");
        dog.setAge(12);
        dog.setWeight(13);
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());
        dog.sayName();
        System.out.println("Создадим вторую собаку");
        Dog dog2 = new Dog("Умка");
        System.out.println(dog2.getAge());
        System.out.println(dog2.getWeight());
        dog2.sayName();
        System.out.println();

        Object object = new Object();
        Dog dog3 = new Dog();
        System.out.println(dog3.toString());

        System.out.println("\n Создадим приёмер с equals. Две собаки одинаковые, одна отличается");
        Dog dogMaria = new Dog("Мария", 12, 12);
        Dog twinDogMaria = new Dog("Мария", 12, 12);
        Dog dogOleg = new Dog("Олег", 10, 12);
        System.out.println("dogMaria и twinDogMaria одинаковые? " + dogMaria.equals(twinDogMaria));
        System.out.println("dogMaria и dogOleg одинаковые? " + dogMaria.equals(dogOleg));
    }
}
