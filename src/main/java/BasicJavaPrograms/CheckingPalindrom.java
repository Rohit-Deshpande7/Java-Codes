package BasicJavaPrograms;

import java.util.Scanner;

public class CheckingPalindrom {
    public static void checkPalindrom(int n)
    {
        int originalNum= n;
        int reverse=0, num;
        while (n>0)
        {
            num=n%10;
            reverse=reverse*10+num;
            n=n/10;
        }
        System.out.println(reverse);
        if (reverse==originalNum)
        {
            System.out.println("The given number " + originalNum +" is palindorm");
        }
        else
            System.out.println("The given number " + originalNum + " is Not palindorm");
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();
        checkPalindrom(n);
    }
}
