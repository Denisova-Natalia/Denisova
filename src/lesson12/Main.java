package lesson12;

import lesson12.interfaces.Flyable;
import lesson12.interfaces.Huntable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Генри", "Коричневый","Насекомые", 2);
        Swan swan = new Swan("Мартин", "Белый", "Рыба", 4);
        Giraffe giraffe = new Giraffe("Виктор", "Оранжевый", "Листья", 13);
        Tiger tiger = new Tiger("Моти", "Полосато-полосатый", "Мясо", 7);
        Elephant elephant = new Elephant("Жора", "Серый", "Арбузы", 5);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(eagle);
        animals.add(swan);
        animals.add(giraffe);
        animals.add(tiger);
        animals.add(elephant);

        for (Animal animal : animals) {
            animal.sleep();
            animal.eat();
            animal.move();

            if (animal instanceof Flyable) {
                Flyable flyable = (Flyable) animal; //применение абстракции
                flyable.fly();
            }
            if (animal instanceof Huntable) {
                Huntable huntable = (Huntable) animal;
                huntable.hunt();
            }
            System.out.println();
        }
    }
}
