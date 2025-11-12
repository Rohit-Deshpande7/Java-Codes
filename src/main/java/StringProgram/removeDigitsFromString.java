package StringProgram;

import java.util.Scanner;

public class removeDigitsFromString {

    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        removeDigits(str);
    }
    public static void removeDigits(String str)
    {
        String result=str.replaceAll("[0-9]","");
        System.out.println(result);
    }
}
