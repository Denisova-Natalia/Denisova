package lesson2;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Вы хотите разместить вклад в банке на сумму 1 миллион 200 тысяч рублей" +
                " Срок вклада 1 год. Вам предложено 2 варианта" +
                " Вариант 1 - ежемесячной капитализацией по ставке 22%" +
                " Вариант 2 - с начислением процентов в конце срока по ставке 22,5%" +
                " Определить какая сумма у вас накопиться к концу срока вклада по обоим вариантам" +
                " Выбрать наиболее выгодный вариант");

        double percent1 = 0.22;
        double percent2 = 0.225;
        double money = 1_200_000;
        for (int month = 1; month <= 12; month = month + 1) {
            money = (int) (money + (money * percent1));
        }
        {
            System.out.println(" Вариант 1 " + money);
            double money1 = 1_200_000;

            money1 = money1 + (money1 * percent2);

            System.out.println(" Вариант 2 " + money1);

            if (money1 > money) {
                System.out.println(" Не выгодный вариант ");
            } else if (money1 < money) {
                System.out.println(" Выгодный вариант");
            } else {
                System.out.println("Доход одинаковый");
            }
        }
        System.out.println("Пробую округлять числа");
        double number = 12.132;
        double number2 = 14.364;

        number = Math.round(number);
        number2 = Math.round(number2);
        System.out.println(number2);
    }
}
