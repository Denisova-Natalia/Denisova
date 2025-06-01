package lesson11;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Задание 1 - Определение типов данных");
        System.out.println();
        System.out.println("int x = 10 - примитивный тип данных.");
        System.out.println("String str = ’Hello’ - ссылочный тип данных");
        System.out.println("boolean isTry = true - примитивный тип данных");
        System.out.println("double d = 3.14 = примитивный тип данных");
        System.out.println("Integer i = new Integer(20) - ссылочный тип данных");
        System.out.println("ArrayList<Integer>list = new ArrayList<>() - ссылочный тип данных");
        System.out.println("char c = ’а’ - примитивный тип данных");
        System.out.println("float f = 2.718f - примитивный тип данных");

        System.out.println();
        System.out.println("Задание 2 - преобразование типов");
        //Преобразуйте целое число int в строку String
        //Преобразуйте строку String содержащую числовое значение в целочисленный тип int
        int a = 5;
        String b = String.valueOf(a);
        b = "5";
        int num = Integer.valueOf(b);
        System.out.println(b);

        //Преобразуйте вещественное число double в целое число int c потерей дробной части
        double doubleNum = 2.5;
        int intNum = (int) doubleNum;
        System.out.println(intNum);

        System.out.println("Задание 3 - Работа с классами-обертками");
        //Создайте обЪект класса Integer с помощью конструктора и методов valueOf()
        //Использовать метод equals() для сравнения двух обЪектов Integer
        int primitiveInt = 3;
        Integer integerObject = Integer.valueOf(primitiveInt);

        int primitiveInt2 = 7;
        Integer integerObject2 = Integer.valueOf(primitiveInt2);
        boolean compare = integerObject.equals(integerObject2);
        System.out.println(compare);

        //Применить метод parseInt() для преобразования строки в число
        String string = "50";
        int number = Integer.parseInt(string);
        System.out.println(number);
    }
}

