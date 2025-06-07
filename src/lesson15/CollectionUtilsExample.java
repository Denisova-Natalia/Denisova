package lesson15;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionUtilsExample {
    public static void main(String[] args) {
        CollectionUtils utils = new CollectionUtilsImpl();
        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(11);
        arraylist.add(22);
        arraylist.add(33);
        arraylist.add(44);
        arraylist.add(55);
        arraylist.add(66);

        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(12);
        linkedlist.add(13);
        linkedlist.add(14);
        linkedlist.add(33);
        linkedlist.add(16);
        linkedlist.add(17);

        System.out.println("Объединение двух коллекций с дубликатами");
        System.out.println(utils.union(arraylist, linkedlist));
        System.out.println("Пересечение 2 коллекций с дубликатами");//есть ли повторяющиеся числа
        System.out.println(utils.intersection(arraylist, linkedlist));
        System.out.println("Разность 2 коллекций");//числа, которые есть либо в первом листе либо во втором
        System.out.println(utils.difference(arraylist, linkedlist));
        System.out.println("");
    }
}
