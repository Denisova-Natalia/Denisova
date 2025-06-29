package lesson18;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создадим мапу для хранения гейтов (выход на посадку) и соответствующих рейсов");
        Map<Integer,String> gates = new TreeMap<>();

        System.out.println("\nДобавим туда несколько записей");
        gates.put(7,"Москва - Калининград");
        gates.put(4, "Челябинск - Астана");
        gates.put(2, "Москва - Иркутск");
        gates.put(3, "Питер - Хельсинки");

        System.out.println("\nВыведем в консоль все гейты и значения с использованием Map.Entry()");
        for (Map.Entry<Integer, String> entry : gates.entrySet()) {
            Integer gateNumber = entry.getKey();
            String flightName = entry.getValue();
            System.out.printf("Посадка на рейс %s осуществляется на выходе %d, %n", flightName, gateNumber);
        }
        System.out.println("\nЗаменим рейс для выхода номер 3");
        gates.put(3, "Бишкек - Питер");

        System.out.println("\nПроверяем, какой рейс теперь записан в выходе номер 3");
        System.out.println(gates.get(3));

        System.out.println("\nПроверим, есть ли в Аэропорте выход 5");
        if (gates.containsKey(5)) {
            System.out.println("Выход номер 5 есть");
        } else {
            System.out.println("Такого выхода нет");
        }

        System.out.println("\nПроверим, есть ли рейс Москва - Калининград");
        if (gates.containsValue("Москва - Калининград")) {
            System.out.println("Есть такой рейс");
        } else {
            System.out.println("Нет такого рейса");
        }

        System.out.println("\nВыведем в консоль все гейты и значения с помощью keySet");
        for (Integer gateNumber : gates.keySet()) {
            System.out.printf("Из гейта номер %d вылетает рейс %s %n", gateNumber, gates.get(gateNumber));
        }

        gates.remove(2);

        System.out.println("\nРазмер мапы " + gates.size());
        gates.clear();
        System.out.println("\nПустая ли мапа после вызова clear():" + (gates.isEmpty() ? "да" : "нет")); //тернарный оператор
    }
}
