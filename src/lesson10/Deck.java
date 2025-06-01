package lesson10;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        cards.add(new Card(2,"Двойка бубна"));
        cards.add(new Card(2,"Двойка крести"));
        cards.add(new Card(2,"Двойка пика"));
        cards.add(new Card(2,"Двойка черви"));

        cards.add(new Card(3,"Тройка бубна"));
        cards.add(new Card(3,"Тройка крести"));
        cards.add(new Card(3,"Тройка пика"));
        cards.add(new Card(3,"Тройка черви"));

        cards.add(new Card(4,"Четверка бубна"));
        cards.add(new Card(4,"Четверка крести"));
        cards.add(new Card(4,"Четверка пика"));
        cards.add(new Card(4,"Четверка черви"));

        cards.add(new Card(5,"Пятерка бубна"));
        cards.add(new Card(5,"Пятерка крести"));
        cards.add(new Card(5,"Пятерка пика"));
        cards.add(new Card(5,"Пятерка черви"));

        cards.add(new Card(6,"Шестерка бубна"));
        cards.add(new Card(6,"Шестерка крести"));
        cards.add(new Card(6,"Шестерка пика"));
        cards.add(new Card(6,"Шестерка черви"));

        cards.add(new Card(7,"Семерка бубна"));
        cards.add(new Card(7,"Семерка крести"));
        cards.add(new Card(7,"Семерка пика"));
        cards.add(new Card(7,"Семерка черви"));

        cards.add(new Card(8,"Восьмерка бубна"));
        cards.add(new Card(8,"Восьмерка крести"));
        cards.add(new Card(8,"Восьмерка пика"));
        cards.add(new Card(8,"Восьмерка черви"));

        cards.add(new Card(9,"Девятка бубна"));
        cards.add(new Card(9,"Девятка крести"));
        cards.add(new Card(9,"Девятка пика"));
        cards.add(new Card(9,"Девятка черви"));

        cards.add(new Card(10,"Десятка бубна"));
        cards.add(new Card(10,"Десятка крести"));
        cards.add(new Card(10,"Десятка пика"));
        cards.add(new Card(10,"Десятка черви"));

        cards.add(new Card(11,"Валет бубна"));
        cards.add(new Card(11,"Валет крести"));
        cards.add(new Card(11,"Валет пика"));
        cards.add(new Card(11,"Валет черви"));

        cards.add(new Card(12,"Дама бубна"));
        cards.add(new Card(12,"Дама крести"));
        cards.add(new Card(12,"Дама пика"));
        cards.add(new Card(12,"Дама черви"));

        cards.add(new Card(13,"Король бубна"));
        cards.add(new Card(13,"Король крести"));
        cards.add(new Card(13,"Король пика"));
        cards.add(new Card(13,"Король черви"));

        cards.add(new Card(14,"Туз бубна"));
        cards.add(new Card(14,"Туз крести"));
        cards.add(new Card(14,"Туз пика"));
        cards.add(new Card(14,"Туз черви"));

    }

    public Card getRandomCard() {

        Random random = new Random();
        return cards.get(random.nextInt(0, cards.size()));
    }
}

