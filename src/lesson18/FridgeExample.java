package lesson18;

public class FridgeExample {
    public static void main(String[] args) {

        Fridge fridge = new Fridge();
        fridge.addProduct("Банан", 200);
        fridge.addProduct("Масло", 500);
        fridge.addProduct("Банан", 400);
        fridge.addProduct("Йогурт", 150);
        fridge.addProduct("Колбаса", 1000);

        System.out.println("\nВывести все продукты (название + вес) от Я до А");
        fridge.printAllProductsFromZToA();


        System.out.println("\nПоложим продукт(молоко) в холодильник");
        fridge.putProduct();

        System.out.println("\nВзять продукт(молоко) из холодильника");
        fridge.getProduct();

        System.out.println("\nВывести вес всех продуктов в холодильнике(сумма)");
        fridge.amountProducts();

        System.out.println("\nВывести вес конкретного продукта в холодильнике");
        fridge.weightSingleProduct();

        System.out.println("\n Вывести наименования продукта, который закончиться первым");
        fridge.findMiniWeight();

        System.out.println("\nВывести наименования продукта, которого больше всего");
        fridge.largestProduct();

        System.out.println("\nВывести продукты (название + вес) по весу от большего к меньшему");
        fridge.printAllProductsFromByWeightDesc();
    }
}
