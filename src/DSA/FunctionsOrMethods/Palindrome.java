package DSA.FunctionsOrMethods;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner input = new Scanner(System.in);
        int askingNumber = input.nextInt();
        int number = askingNumber;
        int palindromeNumber = 0;


        while(number > 0)
        {
            int backNumber = number % 10;
            palindromeNumber = (palindromeNumber * 10) + backNumber;
            number /= 10;
        }

        if (askingNumber == palindromeNumber)
        {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number ");
        }

    }
}
