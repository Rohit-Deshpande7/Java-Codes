package ArrayPrograms;

public class shiftAllZerosToRight {
    public static void shiftAllZeroToRight(int arr[])
    {
        int n=arr.length;
        int []temp= new int[n];

        int j=0;  // to keep track of the index in temp[]
        for (int i=0;i<n;i++)    // Copy non-zero elements to temp[]
        {
            if (arr[i]!=0)
                temp[j++]=arr[i];
        }
        while (j<n)    // Fill remaining positions in temp[] with zeros
          temp[j++]= 0;

        for (int i=0;i<n;i++)  // Copy all the elements from temp[] to arr[]
            arr[i]=temp[i];
    }
    public static void main(String[] args) {
        int []arr= {1,0,6,0,6,7,0,9,8,5};
        shiftAllZeroToRight(arr);

        for (int num:arr)
            System.out.print(num+" ");
    }
}
