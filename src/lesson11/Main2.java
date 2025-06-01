package lesson11;

public class Main2 {
    public static void main(String[] args) {


        //1 - создать переменную примитивного типа для не целых чисел
        //2 - записать ее значение в переменную ссылочного типа не целого числа
        //3 - создать еще одну переменную ссылочного типа с другим значением
        //4- сравнить и вывести в консоль больше ли переменная 1, чем переменная 2
        double num = 2.5;
        Double primitiveNum = num;
        Double primitiveNum2 = 3.5;

        {
            int resultPrimitiveNum = Double.compare(primitiveNum, primitiveNum2);
            if ( resultPrimitiveNum == 0) {
                System.out.println("Они равны");
            } else if ( resultPrimitiveNum == 1 ) {
                System.out.println("Первое число больше второго");
            } else {
                System.out.println("Второе число больше первого");
            }
            String s = "2.2";
            Double doubleNum = Double.valueOf(s);
            double d = doubleNum;
            System.out.println(d);
        }
    }
}
// Double.compare() - статичный метод класса Double, который требует передать в него 2 обьекта для сравнения
//возвращает 1-если первое число больше второго, 0-если они равны, -1-есть первое число меньше второго

//compareTo() - вызывается только у переменной типа Double(или Integer  и так далее)
//сравнивает значение ЭТОЙ переменной с той, которую в метод передали
//пример - primitiveNum.compareTo(primitiveNem2)

