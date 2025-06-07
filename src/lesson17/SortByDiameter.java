package lesson17;

public abstract class SortByDiameter implements Comparable<Coin>{

    public int compareTo(Coin o1, Coin o2) {
        if (o1.getDiameter() > o2.getDiameter()) {
            return Double.compare(o1.getDiameter(), o2.getDiameter());
        }
        if (o1.getDiameter() < o2.getDiameter()) {
            return Double.compare(o2.getDiameter(), o1.getDiameter());
        }


        return 0;
    }
}
