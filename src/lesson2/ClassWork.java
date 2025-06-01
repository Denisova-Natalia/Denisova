package lesson2;

public class ClassWork {

    public static void main(String[] args) {
        System.out.println("Задача 1. Есть 3 стороны треугольника, и нужно вывести, разносторонний, равносторонний " +
                "или равнобедренный. Сторона a 5см, сторона b 7см, сторона c 9см");

        int a = 7;
        int b = 7;
        int c = 7;

        if (a == b && b == c && a == c) {
            System.out.println("Треугольник равносторонний");
        }

        if (a != b && b != c && a != c) {
            System.out.println("Треугольник разносторонний");
        }

        if (a == b || a == c || a == c) {
            System.out.println("Треугольник равнобедренный");
        }

        System.out.println("Задача 2. Вывести в консоль 10 раз фразу \"Привет Мир!\"");

        for (int index = 0; index <= 10 ; index = index + 1) {
            System.out.println(index);
            System.out.println("Привет Мир!");

        }

        System.out.println("Задача 3. Напечатать на консоль все четные числа от 30 до 50");
        System.out.println("Решение 1 - for + if - проверка на четность");
        for (int index = 30 ; index < 50 ; index = index + 1) {
            if (index % 2 == 0) {
                System.out.println(index);
            }

            System.out.println("Задача 4. Сколько денег мы вынесем из банка, если у нас уже есть 10 млн и мы" +
                    "будем печатать деньги еще 15 дней, таких образом, что сумма будет увеличиваться ежедневно на 13 %");
            double cash = 10_000_000;
            for (int day = 1 ; day <= 15 ; day = day + 1) {
                cash = (int) (cash + cash * 0.13);
                System.out.println(cash);
            }
            System.out.println(" Итоговая сумма: " + cash);
        }
    }
}