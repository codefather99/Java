package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays {
    static void main() {

        Scanner input = new Scanner(System.in);


//        int[][] arr = {
//                {1, 2, 3},
//                {2,3},
//                {1,2,3,4,5}
//
//        };

        int[][] arr = new int[3][2];

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                 arr[i][j] = input.nextInt();
            }
        }

        System.out.println((Arrays.deepToString(arr))); // Used to print multidimensional arrays and does not work on primitives
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(arr[1][1]);
    }

}
