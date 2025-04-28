package StringProgram;

public class ReverseWholeString {
    public static void reverseWholeString(String inputString)
    {
        String []strarg= inputString.split(" ");
        String revstr="";
        for (int i=0;i<strarg.length;i++) {
            String word = strarg[i];
            String reverse = "";
            char ch;
            for (int j = 0; j < word.length(); j++) {
                ch = word.charAt(j);
                reverse = ch + reverse;
            }
         revstr=revstr+reverse+" ";
        }
        System.out.println(revstr);

    }
    public static void main(String[] args) {
        String str= "This is Java Program";
        reverseWholeString(str);
    }
}
