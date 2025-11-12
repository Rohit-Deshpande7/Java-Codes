package BasicJavaPrograms;

import java.util.Scanner;

public class oddOrEven {

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();

        if(i%2==0)

            System.out.println("The number is even");
        else
            System.out.println("The number is odd");

    }
}
