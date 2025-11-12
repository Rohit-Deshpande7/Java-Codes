package StringProgram;

import java.util.Scanner;

public class longestWordinString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();
        longestWordFinder(input);
    }

    public static void longestWordFinder(String str)
    {
        String [] words= str.split(" ");
        String logestword=words[0];

        for (int i=1;i< words.length;i++)
        {
            if(words[i].length()>logestword.length())
                logestword=words[i];
        }
        System.out.println(logestword);
    }
}
