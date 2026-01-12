package DSA;

import java.util.Scanner;

public class Switch {
    static void main() {

    Scanner input = new Scanner(System.in);

    String fruit = input.next();
    String typeofFruit = input.next();

    switch (fruit) {
        case "Mango":
            System.out.println("King of fruits");
            break;

        case "Apple":
            System.out.println("Sweet Red of fruit");
            break;
    }

    switch (fruit) {
        case "Mango" -> System.out.println("King of fruit");
        case "Apple" -> System.out.println("Red fruit");
        case "Orange" -> {
            switch(typeofFruit){
                case "Tangerine" -> System.out.println("I love tangerine");
                case "Normal" -> System.out.println("Pretty basic");
                default -> System.out.println("Enter a valid type of orange");
            }
        }
        default -> System.out.println("Please enter a valid fruit");
    }


    }
}


