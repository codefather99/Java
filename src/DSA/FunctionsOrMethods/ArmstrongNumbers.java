package DSA.FunctionsOrMethods;

public class ArmstrongNumbers {
    static void main() {
        int i = 100;
        int nth = 3;

        while(i < 999)
        {
            int hundredth = (i / 100);
            int tenth = (i / 10) % 10;
            int unit = i % 10;

            if (Math.pow(hundredth, nth) + Math.pow(tenth, nth) + Math.pow(unit, nth) == i)
            {
                System.out.println(i);
            }

            i++;
        }
    }
}
