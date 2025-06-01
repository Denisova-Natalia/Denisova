package lesson8;

public class ChipTripDB {
    private Tour[] tours = new Tour[100];

    public ChipTripDB() {
        addTour("Турция", "Стамбул", "Самолет", 5, 100_000, 3, "завтрак");
        addTour("Турция", "Анталья", "Самолет", 7, 150_000, 5, "завтрак");
        addTour("Италия", "Рим", "Автобус", 10, 150_000, 4, "все включено");
        addTour("Турция", "Самсун", "Паром", 5, 70_000, 2, "завтрак + обед");
        addTour("Германия", "Берлин", "Автобус", 9, 135_000, 4, "все включено");
        addTour("Россия", "Алтай", "Поезд", 4, 78_000, 5, "завтрак");
        addTour("Иран", "Шираз", "Самолет", 5, 80_000, 4, "завтрак");
        addTour("Шри-Ланка", "Коломбо", "Самолет", 10, 200_000, 5, "Все включено");

    }

    /**
     * Поиск туров по стране
     *
     * @param country
     */

    public void searchByCountry(String country) {
        for (Tour tour : tours) {
            if (tour == null) {
                return;
            }

            if (tour.getCountry().equalsIgnoreCase(country)) {
                System.out.println(tour);
            }
        }
    }

    public void searchByCity(String city) {
        for (Tour tour : tours) {
            if (tour == null) {
                return;
            }
            if (tour.getCity().equalsIgnoreCase(city)) {
                System.out.println(tour);
            }
        }
    }

    /**
     * Поtиск туров по цене
     */

    public void searchByPrice(int price) {
        for (Tour tour : tours) {
            if (tour == null) {
                return;
            }

            if (tour.getPrice() <= price) {
                System.out.println(tour);
            }
        }
    }
    public void getAllTours() {
        for (Tour tour : tours) {
            if(tour != null) {
                System.out.println(tour);
            }
        }
    }
    public void searchByPriceAndStars(int price, int stars) {
        for (Tour tour : tours) {
            if (tour == null) {
                return;
            }
            if (tour.getPrice() <= price && tour.getStars() == stars) {
                System.out.println(tour);
            }
        }
    }
            /**
             * Добавление тура в базу данных
             *
             * @param country
             * @param city
             * @param transport
             * @param days
             * @param price
             * @param stars
             * @param food
             */

            private void addTour (String country, String city, String transport,int days, int price, int stars, String
            food){
                for (int index = 0; index < tours.length; index++) {
                    if (tours[index] == null) {
                        Tour tour = new Tour(country, city, transport, days, price, stars, food);
                        tours[index] = tour;
                        return;
                    }
                }
            }
        }