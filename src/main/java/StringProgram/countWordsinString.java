package StringProgram;

import java.util.Scanner;

public class countWordsinString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();
        countWords(input.trim());
    }
    public static void countWords(String str)
    {
        String [] words=str.split( " ");
        int i= words.length;

        System.out.println(i);
    }
    }


