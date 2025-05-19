package StringProgram;

import java.util.Arrays;

public class ReapetedChatacterInStringCount {
    public static void main(String[] args) {
        String str= "Rohit Deshpande";
        countChars(str.toLowerCase());
    }
    public static void countChars(String str)
    {
        char [] ch= str.toCharArray();
        Arrays.sort(ch);
        String sortedarr = new String(ch);
        for (int i=0;i<str.length();i++)
        {
            int count=1;
            while(i<str.length()-1 && sortedarr.charAt(i)==sortedarr.charAt(i+1))
            {
                count ++;
                i++;
            }
            if(count >1)
            {
                System.out.println(sortedarr.charAt(i)+ " is repeated "+ count);
            }
        }

    }
}
