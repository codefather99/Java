package DSA;

public class ReverseNumber {
    static void main() {
        int number = 7501;
        int checkingNumber = number;
        int reverseNumber = 0;

        while(number > 0)
        {
            int lastNumber = number % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;

            number = number / 10;
        }

        System.out.println("The reverse of " + checkingNumber + " is " + reverseNumber);
    }
}
