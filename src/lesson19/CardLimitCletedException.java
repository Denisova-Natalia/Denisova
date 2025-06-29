package lesson19;
//свое исключение
public class CardLimitCletedException extends RuntimeException {
    public CardLimitCletedException() {
        super("Card limit cleted");
    }
}
