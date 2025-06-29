package lesson19;

public class ThrowExample {
    public static void main(String[] args) {
        Bank bank = new Bank();

        try {
            bank.withdraw(150);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств");
        } catch (DailyLimitCletedException | CardLimitCletedException e) { // | = означает "или"
            System.out.println("Лимит исчерпан");
        } catch (RuntimeException e) {
            System.out.println("Что то пошло не так, не удалось снять деньги");
        }
    }
}
