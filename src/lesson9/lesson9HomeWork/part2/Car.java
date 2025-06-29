package lesson9.lesson9HomeWork.part2;

public class Car {
    private String brend;
    private String color;
    private int speed;

    public Car(String brend, String color, int speed) {
        this.brend = brend;
        this.color = color;
        this.speed = speed;
    }
    public void sayParameter(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Характеристики машины : " + " Скорость " + speed +" Цвет "+ color +" Бренд "+ brend;
    }
}

