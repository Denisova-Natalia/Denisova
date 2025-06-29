package lesson12.lesson12HoweWork;

import lesson12.lesson12HoweWork.InterfaceDuck.BaseDuck;

public class VelveteenDuck extends Duck implements BaseDuck {

    private boolean isQuacking;

    public VelveteenDuck(String name, boolean isSwiming, boolean isFlying) {
        super(name, isSwiming);
    }


    @Override
    public void swimmingDuck() {
        System.out.println("Я плюшевая утка, лежу на кровати");
    }

    @Override
    public void sayParamsDuck() {
        System.out.println(super.toString());
        swimmingDuck();
    }
}
