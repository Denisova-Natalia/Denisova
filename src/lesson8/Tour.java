package lesson8;

import java.util.Objects;

public class Tour {
     private String country;
     private String city;
     private String transport;
     private int days;
     private int price;
     private int stars;
     private String food;

    public Tour(String country, String city, String transport, int days, int price, int stars, String food) {
        this.country = country;
        this.city = city;
        this.transport = transport;
        this.days = days;
        this.price = price;
        this.stars = stars;
        this.food = food;
    }
//Геттеры мы делаем на все значения в полях, а сеттеры не на все значения. Не будем менять страну и город.
    //А другие значения будем менять. Поэтому сеттер делаем на все значения кроме страны и города.
    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getTransport() {
        return transport;
    }

    public int getDays() {
        return days;
    }

    public int getPrice() {
        return price;
    }

    public int getStars() {
        return stars;
    }

    public String getFood() {
        return food;
    }



    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setFood(String food) {
        this.food = food;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return days == tour.days && price == tour.price && stars == tour.stars   && Objects.equals(country, tour.country) && Objects.equals(city, tour.city) && Objects.equals(transport, tour.transport) && Objects.equals(food, tour.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, transport, days, price, stars, food);
    }

    @Override
    public String toString() {
        return "Тур в " + country + '/' + city + ", транспорт: " + transport + " на " + days + " дней, отель " + stars
                + " звезд, питание - " + food + " стоимомть тура - " + price + "рублей.";
    }
}


