package DSA;

import java.util.Scanner;

public class Loops {
    static void main() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        int searchingNumber = 12;

        for (int number : numbers)
        {
            if (number == searchingNumber) {
                System.out.println("Found");
                return;
            }

        }
        System.out.println("Not Found");
    }
}

class WhileLoop{
     void main() {
        int[] numbers = {1,2,3,45,5};

        int checkingNumber = 7;

        int i = 0;
        while(checkingNumber > numbers[i])
        {
            System.out.println("still in the loop");
            i++;
        }
         System.out.println("Found a number greater than ");
    }
}

class Question1{
    static void main() {
        Scanner input = new Scanner(System.in);

        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int input3 = input.nextInt();

        // Q1, Find the largest of the three numbers

        /*
        * Make a variable called checker = Zero
        * Then change the number if
        * you see one higher than it
        * */
        int checker = 0;

        /*
        * Create an array "inputArray"
        * to input the values of the inputs
        * */
        int[] inputArray = {
                input1,
                input2,
                input3
        };

        /*
        * Use an extended for-loop
        * to check if the value in the array "checkingArray"
        * is greater than Checker*/
        for (int arrayInput : inputArray)
        {
            if (arrayInput > checker)
            {
                checker = arrayInput;
            }
        }
        System.out.println("The greatest number is " + checker);
    }
}