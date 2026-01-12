package DSA.FunctionsOrMethods;


import java.util.Arrays;
import java.util.Scanner;

// Find the prime numbers between the interval of two numbers
public class PrimeIntervals {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter Value of b: ");
        int b = input.nextInt();

        findPrime(a,b);
    }

    static void findPrime(int a, int b){
        for (int i = a; i < b; i++)
        {
            boolean isPrime = checkPrime(i);
            if (isPrime)
            {
                System.out.format("The prime number is %d \n", i);
            }
        }
    }

    static boolean checkPrime(int number)
    {
        if (number <= 1)
        {
            return false;
        } else
        {
            for (int i = 2; i * i <= number; i++)
            {
                if (number % i == 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
