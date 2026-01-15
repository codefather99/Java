package DSA.Strings;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner input = new Scanner(System.in);
        String entry = input.next();
        String[] entryArray = new String[entry.length()];
        String[] palindromeArray = new String[entry.length()];

        for (int i = 0, j = entry.length(); i < j; i++)
        {
            entryArray[i] = String.valueOf((entry.charAt(i)));
        }

        for (int i = 0, j = entry.length(); i * i < j; i++)
        {
            palindromeArray[i] = entryArray[j - 1 - i];
        }

        checkPalindrome(entry.length(), entryArray, palindromeArray);
    }

    public static void checkPalindrome(int length, String[] array1, String[] array2){
        for(int i = 0; i * i < length; i++)
        {
            if (!(array1[i].equals(array2[i])) )
            {
                System.out.println("This is Not a Palindrome");
                return;
            }
        }
        System.out.println("This is a Palindrome");
    }
}
