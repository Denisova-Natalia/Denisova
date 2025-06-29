package lesson9.lesson9HomeWork.part2;

public class GasCar extends Car{

    public GasCar(String brend, String color, int speed) {
        super(brend, color, speed);
    }
    @Override
    public void sayParameter() {
        System.out.println("Эта машина использует газ");
        super.sayParameter();

    }
}
