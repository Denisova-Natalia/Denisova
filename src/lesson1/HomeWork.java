package lesson1;

public class HomeWork {

    private static double tomatoPrice;

    public static void main(String[] args) {
        System.out.println("Задача 1. У нас есть 1000р. Мы идем в магазин." +
                "Нам нужно купить по макcимуму сникерсов, и на сдачу купить конфет." +
                "Сникерс стоит 35 руб. Конфета 3,5 руб." +
                "Вывести в консоль сколько мы купим сникерсов? Сколько конфет? И сколько останется сдача ");
        int totalMoney = 1000;
        int snickersPrice = 35;
        double candyPrice = 3.5;

        int countOfsnickers = totalMoney / snickersPrice;
        int remainingAfterSnickers = totalMoney % countOfsnickers;
        int countOfCandies = (int) (remainingAfterSnickers / candyPrice);
        double remains = remainingAfterSnickers - (candyPrice * countOfCandies);



        System.out.println("Мы купим сникерсов: " + countOfsnickers);
        System.out.println("Мы купим конфет: " + countOfCandies);
        System.out.println("Сдачa : " + remains);


        System.out.println("Задача 2. Есть 1000 руб. Надо купить максисум огурцов и на сдачу помидор." +
                "Огурцы стоят 7 руб. Помидоры 2,5. Вывести в консоль сколько мы купим огурцов. Сколько помидор. И сколькоо останется сдача.");

        int  totalMoney1 = 1000;
        int cucumberOfPrice = 7;
        double tomatoOfPrice =  2.5;

        int countOfcucumbers = totalMoney / cucumberOfPrice;
        int remainingAfterCucumbers =  totalMoney1 % countOfcucumbers;
        double countOftomatoes = (int) (remainingAfterCucumbers / tomatoOfPrice);
        double remainingAftertomatoes = (remainingAfterCucumbers % countOftomatoes);


        System.out.println("Мы купим : " + countOfcucumbers +  " огурца. ");
        System.out.println("Сдача будет: " + remainingAfterCucumbers + " рублей. ");
        System.out.println("Мы купим: " + countOftomatoes + " помидоры. ");
        System.out.println("Сдача будет: " + remainingAftertomatoes);


    }
}
