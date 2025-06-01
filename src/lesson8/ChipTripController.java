package lesson8;

import java.util.Scanner;
/*
* Класс контролеер
 */
public class ChipTripController {
    private ChipTripDB chipTripDB = new ChipTripDB();
    /**
     * Запуск общения с пользавателем
     */
    public void start() {
        System.out.println("Добрый день! Я ваш персональный гид.");
        System.out.println("Выберете фильтр, по которому вы хотите искать туры.");
        System.out.println("1 - поиск туров по стране.");
        System.out.println("2 - поиск туров по цене.");
        System.out.println("3 - просмотр всех туров");
        System.out.println("4 - поиск туров по городу");
        System.out.println("5 - поиск по цене и по звездам одновременно");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите страну куда вы хотите поехать:");
                scanner.nextLine();
                String country = scanner.nextLine();
                chipTripDB.searchByCountry(country);
                break;
            case 2:
                System.out.println("Введите ваш бюджет:");
                int price = scanner.nextInt();
                chipTripDB.searchByPrice(price);
                break;
            case 3:
                chipTripDB.getAllTours();
                break;
            case 4:
                System.out.println("Введите город куда вы хотите поехать:");
                scanner.nextLine();
                String city = scanner.nextLine();
                chipTripDB.searchByCity(city);
                break;
            case 5:
                System.out.println("Введите ваш бюджет:");
                int price1 = scanner.nextInt();
                System.out.println("Введите количество звёзд:");
                int stars = scanner.nextInt();
                chipTripDB.searchByPriceAndStars(price1, stars);
                break;
            default:
                System.out.println("Такой функции нет, выберете функцию из списка");
        }
    }
}
