package BasicJavaPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void primeNum(int n) {
        int count = 0;
        for (int i = 1; i <=n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2) {
            System.out.println("The given number " + n + " is prime number");
            }
        else
            System.out.println("The given number " + n + " is not prime number");
    }
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        primeNum(n);
    }
}
