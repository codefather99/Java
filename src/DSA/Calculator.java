package DSA;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner input = new Scanner(System.in);
        double result = 0;

        while(true) {
            System.out.print("Enter Your Operator: ");
            int operator = input.next().trim().charAt(0);

            if (operator == '+' || operator == '*' || operator == '-' || operator == '/') {
                System.out.print("Enter two numbers: ");
                int a = input.nextInt();
                int b = input.nextInt();


            if (operator == '+') {
                result = a + b;
            } else if (operator == '-') {
                result = a - b;
            } else if (operator == '*') {
                result = a * b;
            } else {
                if (b == 0) {
                    break;
                }
                result = (double) a / b;
            }
                System.out.println(result);
        }
            if (operator == 'x')
            {
                break;
            }
        }
    }
}
