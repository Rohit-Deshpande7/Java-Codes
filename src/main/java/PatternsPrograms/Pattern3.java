package PatternsPrograms;

//  1
//  22
//  333
//  4444
//  55555

import java.util.Scanner;
public class Pattern3 {
    public static void pattern(int n)
    {
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        pattern(n);
    }
}
