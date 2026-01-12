package NestedClasses;

public class OuterClass {
    int number = 6;


    // Outer class method
    public void sayHello() {
        System.out.println("Hello there, from Outer class, the number is currently: " + number);
        System.out.println("Changed number from 6 to 7");

        // This is a class inside a method
        class InnerMethodClass{
            int age = 3;

             void changeAge(int x) {
                age = x++;

                 System.out.println("The age increased to: " + age);
            }
        }

        // The class within a method exists only inside that method and should be called inside the method
        InnerMethodClass callInnermethodClass = new InnerMethodClass();
        callInnermethodClass.changeAge(4);
    }

    // Outer Class constructor
    public OuterClass (){

    }

    // Inner Class
     static class InnerClass {
        String name = "Henry";

        // Inner class Method
        public void greetMe() {
            System.out.println("Hello" + name);
        }
    }
}
