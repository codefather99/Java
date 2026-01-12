package DSA.FunctionsOrMethods;

import java.util.Scanner;

public class PrimeNumbers {
    // Write a program that checks if a number is a prime number

    // First collect the number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        check(number);
    }

    private static void check(int number) {
        if (number <= 1)
        {
            System.out.println("Not a Prime Number");
        } else
        {
            for (int i = 2; i * i <= number; i++)
            {
                if (number % i == 0)
                {
                    System.out.println("Not a Prime Number");
                    return;
                }
            }
            System.out.println("Prime Number");
        }
    }
}

