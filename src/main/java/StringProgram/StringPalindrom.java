package StringProgram;

public class StringPalindrom {

    public static void main(String[] args) {
        String str="Madam";
        String originalStr=str;
        char ch;
        String rev="";
        for (int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            rev=ch+rev;
        }
        if (originalStr.equalsIgnoreCase(rev))
        {
            System.out.println("Its palindrom");
        }
        else
            System.out.println("Its Not palindrom");
    }
}
