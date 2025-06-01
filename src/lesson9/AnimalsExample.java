package lesson9;

public class AnimalsExample {
    public static void main(String[] args) {
        Animal animalCat = new Cat("Оксана", 20, 5);
        Cat cat = new Cat("Мурзик", 13, 4);
        Dog dog = new Dog("Черри", 9, 10);
        Bird bird = new Bird("Кеша", 13, 1);

        System.out.println("Сравнение экземпляра класса Cat записанного в переменную типа Cat и Animal");
        System.out.println("Коту Мурзику " + cat.getAge() + " лет, его вес " + cat.getWeight() + "кг ");
        cat.move();
        cat.eat();
        cat.lookAtOwnerWithContempt();
        System.out.println();
        System.out.println("Кошке Оксане " + animalCat.getAge() + " лет, его вес " + animalCat.getWeight() + "кг ");
        animalCat.move();
        animalCat.eat();
        //    animalCat.lookAtOwnerWithContempt();

        System.out.println("\nПакетная работа с экземплярами разных классов, которые являются родственниками");
        Animal[] animals = {animalCat, cat, dog, bird}; // <= пример абстракции
        for (Animal animal : animals) {
            System.out.println();
            System.out.println("Этому животному " + animal.getAge() + " лет, вес животного " + animal.getWeight() + "кг ");
            animal.move(); //<= пример полиморфизма
            animal.eat();
            // Распаковываем обратно, чтобы достать индивидуальные функции каждого экземпляра
            //Опрелеяем к какому типу относится данное животное
            if (animal instanceof Dog) {
                //Делаем распакову из массива
                //Используем приведение типов, указываем компилятору(если выходит try, что в собакку его и преврати)
                Dog dogFromArray = (Dog) animal;
                //и теперь мы можем обращаться к собственным методом класса Dog
                dogFromArray.beAGoodBoy();
                dogFromArray.runTheBall();
            } else if (animal instanceof Cat) {
                Cat catFromArray = (Cat) animal;
                catFromArray.lookAtOwnerWithContempt();
            } else if (animal instanceof Bird) {
                Bird birdFromArray = (Bird) animal;
                birdFromArray.fly();
            } else {
                System.out.println("Такого типа не предусмотрено");
            }
        }
    }
}
