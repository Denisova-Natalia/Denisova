package testtest;

public class Test2 {


    public static void main(String[] args) {
        int x = 3;
        do {

            if (x > 2)
            {
                System.out.print("a");
            }
            x=x-1;
            System.out.print("-");
            if(x==2)
            {
                System.out.print("b c");
            }
            if(x==1)
            {
                System.out.print("d");
                x=x-1;
            }
        }while (x > 0);
    }
}
