package BasicJavaPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void ReverseNum(int n)
    {
        int reverse=0,num;
        while (n>0)
        {
            num= n%10;
            reverse=reverse*10+num;
            n=n/10;
        }
        System.out.println("The Reverse numeber is " +reverse);
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("The original numeber is " +n);
        ReverseNum(n);
    }
}
