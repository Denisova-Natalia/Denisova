package lesson19;

public class Bank {
    int totalAmount = 100;//amount = количество
    int dailyLimit = 50;
    int cardLimit = 40;

    public void withdraw(double needAmount) {//withdraw = снятие денег


        if (cardLimit < needAmount) {
            throw new CardLimitCletedException();
        } else if (dailyLimit < needAmount) {
            throw new DailyLimitCletedException();
        } else if (needAmount > totalAmount) {
            throw new NotEnoughMoneyException(); //throw = пробрось
        } else {
            System.out.println("Снятие " + needAmount + "рублей.");
        }
    }
}
