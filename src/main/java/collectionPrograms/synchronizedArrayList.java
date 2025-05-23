package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class synchronizedArrayList {
    public static void main(String[] args) {

        //1) Collections.synchronizedList method
        List<String> names = Collections.synchronizedList(new ArrayList<String>());
        names.add("Java");
        names.add("Ruby");
        names.add("C");
        names.add("Python");

        Iterator i= names.iterator();
        while (i.hasNext())
            System.out.println(i.hasNext());

        //2)
        CopyOnWriteArrayList<String> list= new CopyOnWriteArrayList<String>();
        names.add("Java");
        names.add("Ruby");
        names.add("C");
        names.add("Python");



    }
}
