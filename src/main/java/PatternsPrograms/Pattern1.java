package PatternsPrograms;

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

import java.io.InputStream;
import java.util.Scanner;

public class Pattern1 {
    public static void pattern(int n)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        pattern(i);
    }
}
