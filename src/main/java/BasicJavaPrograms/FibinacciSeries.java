package BasicJavaPrograms;

import java.util.Scanner;

public class FibinacciSeries {
    public static void main(String[]args)
    {
        System.out.println("Enter any number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        fibonacciSeriesFunction(num);
    }
    public static void fibonacciSeriesFunction(int num)
    {
        int first = 0, second = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
