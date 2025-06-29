package lesson18;

import java.util.*;

public class Fridge {
    private Map<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) { // проверяем по ключу есть ли такой продукт
            int currentWeight = products.get(product);
            products.put(product, currentWeight + weight); // складываем вес с существующим весом
        } else {
            products.put(product, weight); // если такого продукта нет, то просто кладем в холодильник
        }
    }

    public void printAllProductsFromZToA() {
        Set<String> productNames = new TreeSet<>(Comparator.reverseOrder()); // реверс ордер для того, чтобы изменить порядок
        productNames.addAll(products.keySet());
        for (String productName : productNames) {
            System.out.println(productName + ": " + products.get(productName));
        }
    }

    public void putProduct() {
        products.put("Молоко", 200);
        System.out.println(products.size());
        //  System.out.println(products + ": " + products.get(products));
        System.out.println(products.keySet());
    }

    public void getProduct() {
        Integer value = products.get("Молоко");
        products.remove("Молоко");
        System.out.println(products.size());
        System.out.println(products.keySet());
        // еще можно так:(метод, чтобы можно было брать продукты не целиком, а конкретный вес
        //делаем перегрузку метода
    }

    //   public void getProduct(String productName, int weight);
//
    //    {
    //   if (!products.containsKey(productName)) { //смотрим, есть ли такой продукт
    //           System.out.println("Продукта" + productName + "нет в холодильнике");
    //           return;
    //
    //       }
    //       int currentWeight = products.get(productName);
    //       if (currentWeight > needWeight) {
    //           int newWeight = currentWeight - needWeight;
    //           products.put(productName, newWeight); //сделали перезапись продукта в мапе
    //           System.out.println("Берем" + productName + "весом" + needWeight);
    //       } else if (currentWeight == needWeight) ;
    //       products.remove(productName);
    //       System.out.println("Берем" + productName + "весом" + needWeight);
    //   } else {
    //       System.out.println("невозможно взять %d %s, так как в холодильнике всего %d");
//}

    public void amountProducts() {
        int totalWeight = 0;
        for (int weight : products.values()) {
            totalWeight += weight;
        }
        System.out.println("Суммарный вес продуктов " + totalWeight);
    }

    public void weightSingleProduct() {
        Map<String, Integer> products = new HashMap<>();
        products.get("Йогурт");
        System.out.println(products.getOrDefault("Йогурт", 150));
    }

    public int findMiniWeight() {
        int minWeight = Integer.MAX_VALUE;
        for (Integer weight : products.values()) {
            if (weight < minWeight) {
                minWeight = weight;
                System.out.println(minWeight);
            }
        }// продолжение правильного варианта:
        //   for (Map.Entry<String, Integer> entry : products.entrySet()) {//метод entrySet = возвращает все ячейки
        //      if (entry.getValue() == minWeight) ;
        //      System.out.println(entry.getKey() + " - название продукта, который закончится первым");

        return minWeight;
}
// по аналогии тоже что искали минимальный вес
public void largestProduct() {
    int maxWeight = Integer.MIN_VALUE;
    for (String product : products.keySet()) {
        if (products.get(product) > maxWeight) {
            maxWeight = products.get(product);
            System.out.println(product);
        }
    }
}

public void printAllProductsFromByWeightDesc() {
    Set<Map.Entry<String, Integer>> productEntries = new TreeSet<>(Map.Entry.comparingByValue(Comparator.reverseOrder())); //компаратор по значению
    productEntries.addAll(products.entrySet());
    productEntries.forEach(entry ->
            System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}












