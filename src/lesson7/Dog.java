package lesson7;

import java.util.Objects;

/**
 * Сначала список полей класса
 * Потом конструкторы(если нужны)
 * Потом публичныен методы (не геттеры и сеттеры тоесть свои методы)
 * Потом публичные методы (геттеры и сеттеры)
 * Потом приватные методы
*/
public class Dog {
    private String name;
    private int age;
    private int weight;

//Создали конструктор
    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
        //Создаем второй констркутор, если мы хотим что поле имени было обязательным
        // а возраст и вес необязательными
         public Dog(String name) {
            this.name = name;
    }
    //Создаем пустой конструктор(в нем нет смысла, конструктор создается по умолчанию если мы не создали свой)
    public Dog() {

    }
// но после мы еще можем изменить параметры, но поле name никогда не измениться, потому что мы не создали параметры
 public void toVoice() {
     System.out.println("Гав-гав");
 }
 public void sayName(){
     System.out.println("Меня зовут " + name);
 }

 public void setWeight(int weight) {
     this.weight = weight;
 }
 public int getWeight() {
     return weight;
 }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Делаем переопределение toString, правой кнопкой мыши нажимаем Genetare
    //Выбираем методщ toString

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
    //Делаем переопределение equals(метод сравнения) и hashCode


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && weight == dog.weight && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }
}
