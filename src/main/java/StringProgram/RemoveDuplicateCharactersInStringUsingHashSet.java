package StringProgram;

import java.util.HashSet;

public class RemoveDuplicateCharactersInString {
    public static void RemoveDuplicateCharacters(String str)
    {
        HashSet<Character> originalString=  new HashSet<Character>();
        StringBuilder sb=new StringBuilder();
        for (char c: str.toCharArray())
        {
            if (!originalString.contains(c))
            {
                sb.append(c);
                originalString.add(c);
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String str="Rohithitroro";
        RemoveDuplicateCharacters(str.toLowerCase());
    }
}
