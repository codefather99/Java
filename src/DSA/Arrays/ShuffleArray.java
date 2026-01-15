package DSA.Arrays;

public class ShuffleArray {
    static void main() {
        String name = "nhery";
        int[] arr = {2,0,1,3,4};
        System.out.println(optimumShuffle(name, arr));
        System.out.println(shuffleString(name, arr));
        System.out.println(restoreString(name, arr));

    }

    // The Optimum Solution Time Complexity - O(n) & Space Complexity - O(n)
    public static String optimumShuffle(String s, int[] indices)
    {
        char[] newArray = new char[s.length()];

        StringBuilder shuffledName = new StringBuilder();

        for (int i = 0, j = s.length(); i < j; i++)
        {
            newArray[indices[i]] = s.charAt(i);
        }

        shuffledName.append(newArray);
        return shuffledName.toString();
    }

    public static String shuffleString(String s, int[] indices) {
        int i = 0;
        StringBuilder newString = new StringBuilder();

        while (i < s.length())
        {
            for (int j = 0; j < s.length(); j++)
            {
                if (i == indices[j])
                {
                    newString.append(s.charAt(j));
                    i++;
                }
            }

        }

        return newString.toString();
    }

            public static String restoreString(String s, int[] indices) {

                StringBuilder newString = new StringBuilder();


                // create a new array
                for (int i = 0, j = s.length(); i < j; i++)
                {
                    for (int x = 0; x < s.length(); x++)
                    {
                        if(i == indices[x])
                        {
                            newString.append((s.charAt(x)));

                        }
                    }

                }
                return newString.toString();
            }


}
