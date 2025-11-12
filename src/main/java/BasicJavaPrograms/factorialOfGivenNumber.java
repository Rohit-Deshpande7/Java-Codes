package BasicJavaPrograms;

import java.util.Scanner;

public class factorialOfGivenNumber {

    public static void main(String[]args)
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        factorialsOfGivenNumber(num);
    }
    public static void factorialsOfGivenNumber(int num)
    {
        int factorial=1;
        for(int i=1;i<=num;i++)
        {
            factorial=factorial*i;
        }
    System.out.println("The factorial of given number is " + factorial);
    }
}
