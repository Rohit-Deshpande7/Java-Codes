package ArrayPrograms;

import java.util.HashSet;

public class removeDuplicates {
    public static int removeDuplicate(int arr[]) {
        HashSet<Integer> hashArray = new HashSet<>();
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!hashArray.contains(arr[i])) {
                hashArray.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {13, 21, 42, 13, 12, 43, 21, 12};
        removeDuplicate(arr);
        int newSize = removeDuplicate(arr);

        for (int i = 0; i < newSize; i++)
            System.out.print(arr[i] + " ");

    }

}