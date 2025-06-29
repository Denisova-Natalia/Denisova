package lesson12.lesson12HoweWork;

import java.util.Objects;

public abstract class Duck {
    private String name;
    private boolean isSwiming;


    public Duck(String name, boolean isSwiming) {
        this.name = name;
        this.isSwiming = isSwiming;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSwiming() {
        return isSwiming;
    }

    public void setSwiming(boolean swiming) {
        isSwiming = swiming;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return isSwiming == duck.isSwiming && Objects.equals(name, duck.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isSwiming);
    }

    @Override
    public String toString() {
        return "Утка по имени "+ name  +
                ", плаваю ли я? =" + isSwiming;
    }
}
