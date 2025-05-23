package collectionPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasics {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<String>();

        names.add("Java");
        names.add("C");
        names.add("Python");
        names.add("Ruby");
        System.out.println(names);

        names.add(2,"C++");    // can add values in between
        System.out.println(names);

        Iterator<String> it= names.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        names.remove(2);   // can remove values
         System.out.println(names);

        // names.clear();   // will clear all the values of list

        //reversing the linkedlist by using reverseItrator

        Iterator<String> itr= names.descendingIterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        System.out.println("-----");
        //travrersing the linkedlist by using for each loop
        for (String s:names)
            System.out.println(s);

    }
}
