package ArrayPrograms;

import java.util.Scanner;

public class largestElementInArray {
    public static void largestElement(int a[]) {
        int largest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println("The largest element is " + largest);
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
        largestElement(arr);
    }
}
