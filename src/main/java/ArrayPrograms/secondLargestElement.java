package ArrayPrograms;

import java.util.Scanner;

public class secondLargestElement {
    public static void secondLargest(int arr[]) {
        int largest = 0, seclargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                seclargest = largest;
                largest = arr[i];
            } else if (arr[i]<largest && arr[i]>seclargest) {
                seclargest=arr[i];
            }
        }
        System.out.println("The largest element of array is " + largest + " and Second largest element is " + seclargest);
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
        secondLargest(arr);
    }
}
