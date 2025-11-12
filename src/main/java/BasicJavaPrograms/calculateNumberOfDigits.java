package BasicJavaPrograms;

import java.util.Scanner;

public class calculateNumberOfDigits {
    public static void main(String[]args)
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int digit=0;

        if(num<0)
           num=num*-1;
        else if(num==0)
           digit=1;

        while(num>0)
        {
            num=num/10;
            digit++;
        }
        System.out.println("Digits are " +digit);
    }
}
