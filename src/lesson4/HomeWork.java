package lesson4;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Создать массив 6 на 6 с числами, перезаписать во все ячейки нули," +
                " вывести диагональ сверху вниз, вывести в шахматном порядке");
        System.out.println("Массив 6 на 6 с числами");
        int[][] array = new int[6][6];
        for (int index = 0; index < array.length; index++) {
            for (int index1 = 0; index1 < array[index].length; index1++) {
                array[index][index1] = index1 + 1;
            }
        }
        for (int[] array1 : array) {
            for (int array2 : array1) {
                System.out.printf(array2 + " ");
            }
            System.out.println();
        }
        System.out.println("Перезаписываем во все ячейки нули");
        for (int index = 0; index < array.length; index++) {
            for (int index1 = 0; index1 < array[index].length; index1++) {
                array[index][index1] = 0;
            }
        }
        for (int[] array1 : array) {
            for (int array2 : array1) {
                System.out.printf(array2 + " ");
            }
            System.out.println();
        }
        System.out.println("Выводим диагональ сверху вниз");
        for (int index2 = 0; index2 < array.length; index2++) {
            for (int index3 = 0; index3 < array[index2].length; index3++) {
                if (index3 == index2) {
                    System.out.print(array[index2][index3]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Выводим шахматный порядок");
        for (int index = 0; index < array.length; index++) {
            for (int index1 = 0; index1 < array[index].length; index1++) {
                if (index % 2 == 0) {
                    if (index1 % 2 == 0) {
                        System.out.print(array[index][index1]);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (index1 % 2 != 0) {
                        System.out.print(array[index][index1]);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
