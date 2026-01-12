package DSA.FunctionsOrMethods;

import java.util.Arrays;

public class Methods {
    static void main() {
      greeting();
    }

    static void greeting() {
        System.out.println("Hello World");
    }

     void sayHi() {
        System.out.println("Hi there");
    }

    Methods(){

    }
}


class CallMethod{
    void main() {
        Methods newMethod = new Methods();
        Methods.greeting();
        newMethod.sayHi();
    }

}

class Varargs{
    static void main() {
        fun(1,3,4,6,5);
    }

   static void fun(int...inputs){
        System.out.println(inputs); // This will give the array "hashcode" in memory(not a direct memory location)
       System.out.println(Arrays.toString(inputs)); // This will get the actual values of the array
    }

    static void funt(){
        System.out.println("pop");
    }

    static int fun(){
        return 3 + 4;
    }
}