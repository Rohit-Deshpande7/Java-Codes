package PatternsPrograms;

import java.util.Scanner;

// ******
// *****
// ****
// ***
// **
// *
public class Pattern4 {
    public static void pattern(int n)
    {
        for (int i=1;i<=n;i++)
        {
            for (int j=0;j<n-i+1;j++)
            {
                System.out.print("*");
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
