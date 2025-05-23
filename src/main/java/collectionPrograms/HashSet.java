package collectionPrograms;

import java.util.Arrays;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {

        Set<String> hashset= new java.util.HashSet<String>();
        hashset.add("Test");
        hashset.add("Java");
        hashset.add("selenium");
        hashset.add("TestNG");
        hashset.add("Java");    // duplicate value will not be added
        System.out.println(hashset);

        Set<Integer> s1= new java.util.HashSet<>();
        s1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9} ));

        Set<Integer> s2= new java.util.HashSet<>();
        s2.addAll(Arrays.asList(new Integer[] {1,3,5,7,9} ));

        // Union opration
        Set<Integer> union = new java.util.HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);

       // Intersection opration
        Set<Integer> intersection = new java.util.HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println(intersection);

        // difference between 2 sets
        Set<Integer> difference = new java.util.HashSet<>(s1);
        difference.removeAll(s2);
        System.out.println(difference);


    }
}
