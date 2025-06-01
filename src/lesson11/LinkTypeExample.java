package lesson11;

public class LinkTypeExample {
    //link-ссылка
    //type-тип
    public void showLinkTypeExample() {
        Integer linkValue = 0;
        incrementValue(linkValue);
        System.out.println("Переменная в методе main = " + linkValue);
    }
    //incrementValue = увеличение значения
    public void incrementValue(Integer value) {
        value++;
        System.out.println("Эта же переменная в методе = " + value);
    }
}
