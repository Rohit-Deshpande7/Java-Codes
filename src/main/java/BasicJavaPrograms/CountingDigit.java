package BasicJavaPrograms;

import java.util.Scanner;

public class CountingDigit {

    public static void countDigit(int n)
    {
        int count=0;
        while (n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        countDigit(n);
    }
}
