package ArrayPrograms;

public class shiftAllZerosToLeft {

    public static void shiftAllZerosToLeft(int arr[])
    {
        int n=arr.length;
        int []temp= new int[n];
        int []temp1={};

        int j=0,count=0;
        for (int i=0;i<n;i++)
        {
            if(arr[i]!=0)
                temp[j++]=arr[i];
            else
                count++;
        }
        for (int i=0;i<count;i++)
        {
          temp1[i]=0;
        }
        System.out.println(temp1);
    }
    public static void main(String[] args) {
        int arr[]= {1,0,6,0,6,7,0,9,8,5};
        shiftAllZerosToLeft(arr);
    }
}
