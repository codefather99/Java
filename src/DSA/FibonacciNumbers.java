package DSA;

import java.util.Scanner;

public class FibonacciNumbers {
    static void main() {
        /* Fibonacci Numbers are numbers that the sum of two previous
            numbers give the next number
            eg: [0, 1, 1, 2, 3, 5, 8, 13...]
         */

        // Question: Check if the numbers are Fibonacci numbers

        int[] numbers = {0, 1, 1, 2, 3, 5, 8, 13};

        for (int i = 2; i < numbers.length; i++)
        {
            if (numbers[i - 1] + numbers[i - 2] != numbers[i])
            {
                System.out.println("Not Fibonacci Numbers");
                return;
            }
        }
        System.out.println("Fibonacci Numbers");


        // Question 2: Find the nth Fibonacci Number
        int a = 0;
        int b = 1;
        int n = 7;

        for (int i = 0; i < n; i++)
        {
           int c = a + b;
           a = b;
           b = c;
        }
        System.out.println("The " + n + "th" + "Fibonacci Number is: " + a);
    }
}
