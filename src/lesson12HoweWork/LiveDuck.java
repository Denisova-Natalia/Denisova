package lesson12HoweWork;

import lesson12HoweWork.InterfaceDuck.BaseDuck;

public class LiveDuck extends Duck implements BaseDuck {
    private boolean isFlying ;
    private boolean isQuacking ;
    private boolean isReproduce;

    public LiveDuck(String name, boolean isSwiming, boolean isFlying, boolean isQuacking, boolean isReproduce) {
        super(name, isSwiming);
        this.isFlying = isFlying;
        this.isQuacking = isQuacking;
        this.isReproduce = isReproduce;
    }

    @Override
    public void swimmingDuck() {
        System.out.println(" Я живая утка, я плыву по озеру");
    }

    @Override
    public void sayParamsDuck() {
        System.out.println(super.toString() + " Я летаю? " + isFlying + " Я крякаю? " + isQuacking + " Я умею размножаться? " + isReproduce);
        swimmingDuck();
    }
}

