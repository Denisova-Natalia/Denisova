package lesson4;

public class ClassWork {
    public static void main(String[] args) {
        int[] emptyArray = new int[10];

        System.out.println("Читаем значение пустого массива");
        for (int index = 0; index < emptyArray.length; index++) {
            int number = emptyArray[index];
            System.out.println(number);
        }
        System.out.println("\n Заполняем массив числами от 1 до 10");
        for (int index = 0; index < emptyArray.length; index++) {
            emptyArray[index] = index + 1;
        }
        System.out.println("\nЧитаем значение заполненного массива");
        for (int index = 0; index < emptyArray.length; index++) {
            int number = emptyArray[index];
            System.out.println(number);
        }
        System.out.println("\nЗадача 1. Есть массив цифр: {3,5,8,3,55,4,1,65,36,98}. ");
        System.out.println("\nВывести на консоль массив с обратной стороны");
        System.out.println("\nВывести на консоль те числа, которые содержат символ 5");
        int[] numbersArray = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        System.out.println("\nВывод на консоль с обратной стороны");
        for (int index = numbersArray.length - 1; index >= 0; index--) {
            System.out.println(numbersArray[index]);
        }
        System.out.println("\nВывод на консоль тех чисел, которые содержат символ 5");
        for (int index = 0; index < numbersArray.length; index++) {
            int number = numbersArray[index];
            String stringNumber = String.valueOf(number);
            if (stringNumber.contains("5")) {
                System.out.println(number);
            }
        }
        System.out.println("Создать двумерный массив с числами и вывести их на консоль");
        int[][] numbers = {
                {1, 2, 3},
                {3, 5, 6},
                {5, 3, 2},
                {1, 4, 5}
        };
        // Первым циклом идем по ячейкам основного массива(по этажам, по строкам и тд)
        // nested = вложенный
        for (int verticalIndex = 0; verticalIndex < numbers.length; verticalIndex++) {
            // Получаем содержимое каждой ячейки и записываем в переменную
            int[] nestedArray = numbers[verticalIndex];
            //Теперь идем по всем ячейкам вложенного массива
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                // Достаем элемент и пишем в переменную
                int number = nestedArray[horizontalIndex];
                //Выводим значание на консоль
                System.out.print(number + " ");
            }
            System.out.println();
        }
        System.out.println("\nСоздать массив чисел и вывести его в диагональ");
        int[][] array = {
                {1, 6, 3, 4, 5, 7},
                {12, 54, 3, 12, 4, 3},
                {1, 5, 2, 53, 5, 3},
                {7, 54, 23, 54, 23},
                {25, 4534, 4, 3, 23, 32},
                {234, 5, 3, 1, 6, 3}
        };
        for (int verticalIndex = 0; verticalIndex < array.length; verticalIndex++) {
            int[] nestedArray = array[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if (verticalIndex == horizontalIndex) {
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        System.out.println("Задача. Создать массив символов слова \"Параллелограмм\". " +
                "Сложить из него слово и записать в переменную строки, затем снова разбить на массив" +
                "и вывести кадый второй символ");
        // 1. Создали массив с символами для слова
        char[] symbolsForWord = {'П','А','P'};

    }
}