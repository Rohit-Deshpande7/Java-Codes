package ArrayPrograms;

import java.util.Arrays;

public class RemoveAllOccurrencesofanElementinanArray {
    public static int[] removeAllOccurrences(int []arr, int n)
    {
        int len= arr.length;
        int ind=0;
        for (int i=0;i<len;i++)
        {
            if (arr[i]!=n)
            {
                arr[ind++]=arr[i];
            }
        }
        return Arrays.copyOf(arr, ind);
    }
    public static void main(String[] args) {
        int arr[]={12,21,12,31,42,12,4,56};
        int n=12;
        arr=removeAllOccurrences(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
