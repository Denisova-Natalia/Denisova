package lesson16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаем новый список");
        Set<Integer> set = new TreeSet<>();

        System.out.println("\n add (E e): Добавляет элемент в множество, если он отсутствует. \n");
        set.add(1);
        set.add(8);
        set.add(2);
        set.add(4);
        set.add(99);
        set.add(2);

        System.out.println("\n size(): Возвращает количество элементов в множестве");
        System.out.println("Размер коллекции: " + set.size());

        System.out.println("\n isEmpty(): Проверяет, пусто ли множество\n");
        System.out.println("Коллекция пустая? " + set.isEmpty());

        System.out.println("\n remove(Object o) - Удаляет элемент из множества, если элемент присутствует");
        System.out.println("Удаляем число 8 " + set.remove(8));
        System.out.println("Удаляем число 15 " + set.remove(15));

        System.out.println("\n contains(Object o) - проверяет: содержится ли элемент в множестве");
        System.out.println("Есть ли элемент 8 " + (set.contains(8) ? "присутствует" : "отсутствует"));//используем тернарный оператор(замена if else)
        System.out.println("Есть ли элемент 1 " + (set.contains(1) ? "присутствует" : "отсутствует"));

        System.out.println("Вывод всех элементов множества" + set);

                //Безопасное удаление двойки
                //Итератор
                //hasNext - метод Итератора, который отвечает на вопрос Есть ли следующий элемент? true или false
                //next - метод Итератора, с помощью которого происходит получение следующего элемента
                Iterator<Integer> iterator = set.iterator();
                while (iterator.hasNext()) {
                    Integer element = iterator.next();
                    if (element == 2) {
                        iterator.remove();
                        System.out.println(set);
                    }
                }
                set.clear();
        System.out.println(set);//удаление всех элементов
                //Еще вариант удаление, сокращение того, что выше
        // set.removeIf(num -> num == 2); // лямда выражение <=
        //sout (set)
            }
        }
