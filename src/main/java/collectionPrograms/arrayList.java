package collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<String>();

        list.add("Java");
        list.add("Ruby");
        list.add("C");
        list.add("Python");
        ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        //numbers.removeIf(num -> num%2==0);        // lamda expression for removing even numbers
        System.out.println(numbers);

        numbers.removeIf(num -> num%2==1);   // lamda expression for removing odd numbers
        System.out.println(numbers);

        ArrayList<Integer> sublist = new ArrayList<Integer>(numbers.subList(2,6));   // it will create sublist from given arraylist
         System.out.println(sublist);

         Object normalArray []=list.toArray();           //It will convert Arraylist to normal Array
         for(Object o: normalArray)
             System.out.println((String) o);


    }
}
