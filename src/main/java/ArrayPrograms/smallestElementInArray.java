package ArrayPrograms;

import java.util.Scanner;

public class smallestElementInArray {

    public static void smallestElement(int a[])
    {
        int smallest=a[0];
        for (int i=0;i<a.length;i++)
        {
         if (a[i]<smallest)
         {
             smallest=a[i];
         }
        }
        System.out.println("The smallest element is "+smallest);
    }
    public static void main(String[] args) {
        System.out.println("Enter size of array ");
        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();
        System.out.println("Enter the elements of array ");
        int arr[]= new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]= scanner.nextInt();
        }
        smallestElement(arr);
    }
}
