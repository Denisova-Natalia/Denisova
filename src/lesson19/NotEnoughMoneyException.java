package lesson19;
//создаем здесь свои исключения
public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException() {
        super("Not enough money.");
    }
}
