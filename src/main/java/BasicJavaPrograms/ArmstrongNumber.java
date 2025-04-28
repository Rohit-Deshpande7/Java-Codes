package BasicJavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void ArmstrongNum(int n)
    {
        int sum=0;
        int originalNum=n;
        while (n>0) {
            int lastdigit = n % 10;
            sum = sum + (lastdigit * lastdigit * lastdigit);
            n = n / 10;
        }
        if (sum==originalNum)
        {
            System.out.println("The given number is Armstrong");
        }
        else {
            System.out.println("not armstrong");
        }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        ArmstrongNum(n);
    }
}
