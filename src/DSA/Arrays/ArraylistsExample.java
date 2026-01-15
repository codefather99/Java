package DSA.Arrays;

import java.util.ArrayList;

public class ArraylistsExample {
    static void main() {
     ArrayList<Integer> list = new ArrayList<Integer>(12);
//       list.set(1, 10);
       list.add(11);
       list.add(12);

        System.out.println(list.get(1));

        list.set(1,13);
        System.out.println(list);
    }
}
