package lesson3;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, кроме 6,10,14." +
                "Как только цикл дойдет до 23, остановить вывод и написать в консоль \"Достигнуто целевое число\"");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        for (int index = 0; index < numbers.length; index++) {
            int number = numbers[index];
            if (number % 2 == 0 && number<=23) {
                if (number == 6 | number == 10 | number == 14) {
                    continue;
                }

                System.out.println(number);
            }
        }
        System.out.println("Достигнуто целевое число");
    }
}
