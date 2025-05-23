package collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicateElementsFromArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,3,1,4,2,5));

        //  1. Using LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);

        ArrayList<Integer> withoutDuplicate = new ArrayList<Integer>(linkedHashSet);
        System.out.println(withoutDuplicate);

        //  2. Using Stream
        ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,3,1,4,2,5));
        List<Integer> numbers2withoutDuplicate = numbers2.stream().distinct().collect(Collectors.toList());
        System.out.println(numbers2withoutDuplicate);

    }
}
