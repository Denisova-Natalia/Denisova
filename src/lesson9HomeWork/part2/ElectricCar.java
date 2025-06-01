package lesson9HomeWork.part2;


public class ElectricCar extends Car {
    private int power;
    public ElectricCar(String brend, String color, int speed, int power) {
        super(brend, color, speed);
        this.power=power;
    }
    @Override
    public void sayParameter() {
        super.sayParameter();
        System.out.println("Осталось процентов "+power);
    }
}

