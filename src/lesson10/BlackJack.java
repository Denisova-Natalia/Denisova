package lesson10;

import java.util.ArrayList;
import java.util.Scanner;

//Сама игра - тут реализуется логика игры и взаимодействие объектов в игре
public class BlackJack {
    private ArrayList<Player> players = new ArrayList<>();
    private Dealer dealer= new Dealer();

public void start(int playersQuantity) {
    //Проверки на валидность количество игроков
    if (playersQuantity < 1) {
        System.out.println("Нельзя создать игру на " + playersQuantity + "Укажите количество более 1");
        return;
    }
    if (playersQuantity > 5) {
        System.out.println("Нельзя создать игру на " + playersQuantity + "Укажите количество игроков менее 6 человек");
        return;
    }
    // 1 - создание игроков
    createPlayers(playersQuantity);
    // 2 - раздали всем карты
    // 3 - раздали остальные карты, пока игроки берут
    // 4 - напечатали у кого сколько очков
    // 5 - определили и напечатали победителя
}
    //Cоздаем игрока
    private void createPlayers(int playersQuantity) {
    players.add(dealer);
        for (int playerNumber = 1; playerNumber >= playersQuantity; playerNumber++) {
            System.out.println("Введите желаемое имя игрока " + playerNumber + ":");

            Scanner scanner = new Scanner(System.in);
            String playerName = scanner.nextLine();

            Player player = new Player(playerName);
            players.add(player);

            System.out.println("Игрок " + playerName + " успешно создан!\n");
        }
    }
}
