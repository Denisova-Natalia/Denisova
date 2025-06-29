package lesson19;
//свое исключение
public class DailyLimitCletedException extends RuntimeException {
    public DailyLimitCletedException() {
        super("Limit cleted.");
    }
}
