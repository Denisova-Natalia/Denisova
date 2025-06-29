package lesson19.recursion;

public class Matreshka {
    private String name;
    private Matreshka innerMatreshka;

    public Matreshka(String name, Matreshka innerMatreshka) {
        this.name = name;
        this.innerMatreshka = innerMatreshka;
    }

    public String getName() {
        return name;
    }

    public Matreshka getInnerMatreshka() {
        return innerMatreshka;
    }
    //делаем распаковку, делаем рекурсию - это поведение функции, при котором она вызывает сама себя
    public void unpack() {
        System.out.println("Распаковываем матрешку : " + name);

        if (innerMatreshka == null) {
            System.out.println("Больше матрешек нет");
        } else
            innerMatreshka.unpack();
    }
}
