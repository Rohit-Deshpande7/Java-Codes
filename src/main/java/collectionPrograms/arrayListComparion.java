package collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayListComparion {
    public static void main(String[] args) {

        // 1. Sort and then Equal
        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 6, 7));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Collections.sort(l1);
        Collections.sort(l2);
        System.out.println(l1.equals(l2));

        // 2. compare two lists and find out additional element
        //l1.removeAll(l2);
        System.out.println(l1);

        // 3. finding Missing Element
        // l2.removeAll(l1);
        System.out.println(l2);

        // 4. Common elements in Arraylist
        l1.retainAll(l2);
        System.out.println(l1);

    }
}
