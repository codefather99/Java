package DSA;

import java.util.Scanner;

public class AlphabetCase {
    static void main() {
        Scanner input = new Scanner(System.in);
        char alphabet = input.next().charAt(0);

        if (alphabet - 'a' >= 0 && alphabet - 'a' <= 25)
        {
            System.out.println("Lowercase");
        } else if (alphabet - 'A' >= 0 && alphabet - 'A' <= 25) {
            System.out.println("Uppercase");
        }
        else
        {
            System.out.println("Not An Alphabet");
        }
    }
}

/*
    CODE REVIEW
    The code is generally correct but,
    the logic if (alphabet - 'a' >= 0 ...) is the same thing as
    if (alphabet >= 'a');

    This is better because it eliminates the use of magic numbers
    like '0' and '25'.
 */
