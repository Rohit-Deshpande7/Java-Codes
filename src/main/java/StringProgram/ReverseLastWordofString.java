package StringProgram;

public class ReverseLastWordofString {

    public static void reverseLastWord(String inputString)
    {
        String [] strArray= inputString.split(" ");
        String reverse="", revstr="";
        char ch;
        for (int i=0;i<strArray.length;i++)
        {
            String word=strArray[i];
            for(int j=(strArray.length-1);j<=word.length();j++)
            {
                ch=word.charAt(j);
                reverse=ch+reverse;
            }
            revstr=revstr+reverse+" ";
        }
        System.out.println(revstr);
    }

    public static void main(String[] args) {
        String str ="This is java";
        reverseLastWord(str);
    }
}
