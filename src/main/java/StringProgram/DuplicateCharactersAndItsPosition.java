package StringProgram;

import java.util.Arrays;

public class DuplicateCharactersAndItsPosition {

    public static void DuplicateCharAndPos(String str)
    {
        char [] ch= str.toCharArray();
        Arrays.sort(ch);
        String sortedStr= new String(ch);
        for (int i=0;i<str.length();i++)
        {
           int count=1;
            while (i<str.length()-1 && sortedStr.charAt(i) ==sortedStr.charAt(i+1))
            {
                count++;
                i++;
            }
            if (count>1)
            {
                System.out.println(sortedStr.charAt(i)+" Count is "+ count+" at position "+i);
            }
        }
    }
    public static void main(String[] args) {
        String str="Rohithitr";
        DuplicateCharAndPos(str.toLowerCase());
    }
}
