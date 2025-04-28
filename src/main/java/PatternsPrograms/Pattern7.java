package PatternsPrograms;

//  ***********
//   *********
//    *******
//     *****
//      ***
//       *
import java.util.Scanner;

public class Pattern7 {
    public static void pattern(int n) {
        for (int i = n; i >= 0; i--)
        {
            for (int j = 0; j < n - i + 1; j++)                 //for spaces
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++)                 // for *
            {
                System.out.print("*");
            }
            for (int j = 0; j < n - i + 1; j++)                 //for spaces
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern(n);
    }
}