package lesson7;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Введите рост питомца");
        Scanner sc = new Scanner(System.in);
        int growth = sc.nextInt();
        System.out.println("Введите имя питомца");

        System.out.println("Введите вес питомца");
        int weight = sc.nextInt();
        System.out.println("Введите любимую еду питомца");
        sc.close();


    }
}

