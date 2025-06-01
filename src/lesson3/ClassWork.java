package lesson3;

public class ClassWork {
    public static void main(String[] args) {
        System.out.println("Вывести на консоль все числа от 0 до 10, кроме 2 и 5");
        for (int number = 0; number < 10; number++) {
            if (number == 2) {
                continue;
            }
            if (number == 5) {
                continue;
            }
            System.out.println(number);
        }


        System.out.println("\n Пример break и return");
        for (int index = 0; index < 10; index++) {
            if (index == 6) {
                break;
            }
            System.out.println("Вывод в первом цикле");
            System.out.println(index);
        }
        for (int index = 0; index < 10; index++) {
            if (index == 6) {
                break;
            }
            System.out.println("Вывод в втором цикле");
            System.out.println(index);
        }

        System.out.println("Пример работы с массивами");
        long[] arrayWithNumbers = {1, 6, 4, 87, 54, 3};
        double[] emptyArray = new double[8];
        emptyArray[0] = 1.55;
        emptyArray[4] = 2.45;
        emptyArray[7] = 3.67;
        System.out.println("Вывод числа из ячейки 0 " + emptyArray[0]);
        double element4 = emptyArray[4];
        System.out.println(element4);
        System.out.println("Выведем все элементы массива emptyArray");
        for (int index = 0; index < emptyArray.length; index++) {
            System.out.println(emptyArray[index]);

        }
        System.out.println("Вывести на консоль каждую ячейку");
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numbers);
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
        System.out.println("Задача 3. Есть массив чисел, нужно вывести на консоль только четные числа в обратном порядке");
        int[] intnumbers = {1,4,2,5,78,8,4,1,5,6,98};
        for (int index = intnumbers.length - 1; index >= 0; index--) {
            int number = intnumbers[index];
            if (number % 2 == 0)
            System.out.println(number);
        }
    }
}
