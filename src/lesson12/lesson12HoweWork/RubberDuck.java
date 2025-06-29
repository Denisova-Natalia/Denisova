package lesson12.lesson12HoweWork;

import lesson12.lesson12HoweWork.InterfaceDuck.BaseDuck;

public class RubberDuck extends Duck implements BaseDuck {
    public RubberDuck(String name, boolean isSwiming) {
        super(name, isSwiming);
    }

    @Override
    public void swimmingDuck() {
        System.out.println("Я резинова утка, я люблю плавать в ванной");
    }

    @Override
    public void sayParamsDuck() {
        System.out.println(super.toString());
        swimmingDuck();
    }

}
