package ArrayPrograms;

public class smallestAndLargestNumber {

    public static void main(String[] args) {

        int numbers[]= {5,2,12,4,31,52,2,1,0,-41};
        findSmallestAndLargest(numbers);
    }
    public static void findSmallestAndLargest(int numbers[]){
        int largest=numbers[0];
        int smallest=numbers[0];
        for (int i=1;i<numbers.length;i++){
            if (numbers[i]>largest)
                largest=numbers[i];
            else if (numbers[i]<smallest)
                smallest=numbers[i];
        }
        System.out.println("largest number is "+largest);
        System.out.println("smallest number is "+smallest);
    }
}
