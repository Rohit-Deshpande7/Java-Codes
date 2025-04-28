package ArrayPrograms;

public class sumOfArray {
    public static void arraySum(int []arr)
    {
        int sum =0;
        for (int i=0;i< arr.length;i++)
        {
            sum= sum+arr[i];
        }
        System.out.println("Array sum is "+ sum);
    }
    public static void main(String[] args) {
        int arr[]={15,7,3,2,5,8,2,32,31,53,0};
        arraySum(arr);
    }
}
