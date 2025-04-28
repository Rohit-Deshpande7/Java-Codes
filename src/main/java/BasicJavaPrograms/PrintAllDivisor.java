package BasicJavaPrograms;

import java.util.Scanner;

public class PrintAllDivisor {
    public static void printAllDivisor(int num)
    {
        for (int i=1;i<=num/2;i++)
        {
            if (num%i==0)
            {
                System.out.println("The number is divisible by "+i);
            }
        }
        System.out.println("The number is divisible by "+num);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printAllDivisor(num);
    }
}
