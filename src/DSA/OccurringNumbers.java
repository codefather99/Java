package DSA;

import java.util.Scanner;

public class OccurringNumbers {
    static void main() {
        // Question: find the number of times the given number re-occurred

        Scanner input = new Scanner(System.in);
        String numbers = input.next();

        int count = 0;
        int number = 7;

        for (int i = 0; i < numbers.length(); i++)
        {
            /* Use "character.getNumericValue" if you want to
               convert a string's character to a numeric value
               and perform a mathematical operation on it
             */
            if ( number == Character.getNumericValue(numbers.charAt(i)))
            {
                count++;
            }
        }
        System.out.println("The number repeated " + count + " times");

        /* Code Review:
            The aim of coding is to rely solely on
            your ability to perform algorithmic operations
            without the use of external methods like the
            "character.getNumericValue" you used above because
            in DSA interviews you wouldn't be allowed to search for
            them in-case you forget them.

            Therefore, the best solution to this problem would be to use
            modulo to get the last digit of the given number which you
            would thenm compare to the repeating number
         */

    }
}

class UsingIntegers{
    static void main() {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int number = 7;
        int realNumbers = input.nextInt();
        int lastDigit;
        int i = realNumbers;

        while (i > 0)
        {
            lastDigit = i % 10;
            if ( lastDigit == number)
            {
                count++;
            }
            i = i / 10;
        }

        System.out.println("The number repeated " + count + " times");
    }
}