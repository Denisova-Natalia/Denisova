package lesson17;

import java.util.Comparator;

public class SortByYearComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        //Сначала сортируем по году возрастание
        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }
        //Потом сортируем по номиналу возрастания
        if (o1.getNominal() != o2.getNominal()) {
            return o1.getNominal() - o2.getNominal();
        }
        //Потом сортируем по металлу по возрастанию
        if (o1.getMetalName().equals(o2.getMetalName())) {
            return o1.getMetalName().compareTo(o2.getMetalName());
        }
        //Потом сортируем по диаметру по возрастанию
        int result = Double.compare(o1.getDiameter(), o2.getDiameter());
        if (result >= 0) {
            return Double.compare(o1.getDiameter(), o2.getDiameter());
        } else if (result < 0) {
            return Double.compare(o2.getDiameter(), o1.getDiameter());
        }


        return result;
    }
}

