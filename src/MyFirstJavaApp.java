import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

class Demo {
    public static void main(String[] args)
    {
       int quarter = 1;

       switch(quarter)
       {
           case 1:
               System.out.println("Summer");
               break;

           case 2:
               IO.println("Spring");
               break;

           case 3:
               IO.println("Winter");
               break;

           default:IO.println("Wierd");

       }
    }
}

class Demo2 {
    static void main() {
        System.out.println("new World");

        Scanner input = new Scanner(System.in);


        byte num1 = 10;

        long num2 = 27657;

        double num3 = 12.9;

        double sum = num1 * num2 / num3;

        System.out.println("The answer is " + sum);
    }
}

