package lesson12.lesson12HoweWork;

public class Main {
    public static void main(String[] args) {
        RubberDuck rubberDuck= new RubberDuck("Алекс",true);
        rubberDuck.sayParamsDuck();
        LiveDuck liveDuck = new LiveDuck("Мартин", true, true, true, true);
        liveDuck.sayParamsDuck();
        VelveteenDuck velveteenDuck = new VelveteenDuck("Глория",true,true);
        velveteenDuck.sayParamsDuck();
    }


}
