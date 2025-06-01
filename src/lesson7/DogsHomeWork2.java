package lesson7;

import java.util.Objects;

public class DogsHomeWork2 {
    private String name;
    private int growth;
    private int weight;
    private String color;
    private int numberOfPaws;
    private String favoriteFood;

   public DogsHomeWork2(String name, int growth, int weight, String color, int numberOfPaws, String favoriteFood) {
        this.name = name;
        this.growth = growth;
        this.weight = weight;
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.favoriteFood = favoriteFood;
    }


    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "DogsHomeWork2{" +
                "name='" + name + '\'' +
                ", growth=" + growth +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", numberOfPaws=" + numberOfPaws +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DogsHomeWork2 that = (DogsHomeWork2) o;
        return growth == that.growth && weight == that.weight && numberOfPaws == that.numberOfPaws && Objects.equals(name, that.name) && Objects.equals(color, that.color) && Objects.equals(favoriteFood, that.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, growth, weight, color, numberOfPaws, favoriteFood);
    }
}
