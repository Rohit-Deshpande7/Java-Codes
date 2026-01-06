package StringProgram;

import java.util.HashMap;

public class characterOccuranceCounter {
    public static void main(String[] args) {
        String str = "Rohit Deshpande";
        //withHashMap(str.toLowerCase().replace(" ",""));
        withNormalArray(str.toLowerCase().replace(" ",""));
    }
    public static void withHashMap(String str)
    {
        HashMap<Character, Integer> charCount= new HashMap<>();

        for(char ch : str.toCharArray())
        {
            if (charCount.containsKey(ch))
            {
                charCount.put(ch,charCount.get(ch)+1);
            }else {
                charCount.put(ch,1);
            }
        }
        System.out.println(charCount);
    }

    public static void withNormalArray(String str)
    {
        int[] count = new int[256]; // ASCII size

        for (int i = 0; i < str.length(); i++)
        {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++)
        {
            if (count[i] > 0)
                System.out.println((char) i + " = " + count[i]);
            }
    }
}
