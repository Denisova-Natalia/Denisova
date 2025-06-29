package lesson9.lesson9HomeWork.part2;

public class Main {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar(" Тесла" ," Зеленый ", 250,100);

        bugagaCar(electricCar);
        
        GasCar gasCar = new GasCar("Газель", "Белый", 150);

        bugagaCar(gasCar);

    }
    public static void bugagaCar(Car car){
        car.sayParameter();
        System.out.println();
    }


}
