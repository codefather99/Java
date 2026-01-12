package NestedClasses;

public class MainClass {
    static void main() {

        OuterClass outer = new OuterClass();
        outer.sayHello();

        // Calling a static nested class
        // if you want to have a nested class, best make it static
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        inner.greetMe();

        // If you don't want to make the inner class static,
        // you have to first instantiate the outer class before instantiating the inner class

    }
}
