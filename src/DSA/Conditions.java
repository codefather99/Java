package DSA;

import java.util.Scanner;

public class Conditions{
    static void main() {
        int bonus;

        // get salary;
        System.out.print("Enter Worker's salary: ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();

        // conditionals
        if (salary > 10000)
        {
            bonus = 2000;
            salary += bonus;
            System.out.println("The salary increased to " + salary + " after adding a bonus of " + bonus);
        }
        else {
            bonus = 1000;
            salary += bonus;
            System.out.println("The salary increased to " + salary + " after adding a bonus of " + bonus );
        }
    }

}