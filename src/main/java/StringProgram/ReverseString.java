package StringProgram;

public class ReverseString {

    public static void main(String[] args) {
        String str= "Automation";

        // Approach 1: By using StringBuilder
     //    StringBuilder sb= new StringBuilder(str);
   //    System.out.println("The reverse of string is " +sb.reverse());

        //Approcah 2:- By using CharAt() method
        char ch;
        String rev="";
        for (int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            rev= ch+rev;
        }
      System.out.println("The reverse of string is " +rev);
    }
}