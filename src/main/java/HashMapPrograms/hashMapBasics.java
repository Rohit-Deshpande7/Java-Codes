package HashMapPrograms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class hashMapBasics {

    public static void main(String[] args) {

        HashMap<String, String> studentDetails = new HashMap<String, String>();
        studentDetails.put("AB","1");
        studentDetails.put("CD","2");
        studentDetails.put("EF","3");
        studentDetails.put("GH","4");
        studentDetails.put("IJ","5");

        System.out.println("The value of Hashmap is "+ studentDetails.get("GH"));      // will give the value of AB key

        // Iterating hashmap 1) over the keys by using Keyset()

        Iterator<String> it= studentDetails.keySet().iterator();
        while(it.hasNext())
        {
            String str= it.next();
           String value= studentDetails.get(str);
           System.out.println("The key is "+str+ " And value is "+value);
        }

        // Iterating hashmap 2) over the set(both values) by using EntrySet()

         // Integer<Map.Entry<String, String>> it2=studentDetails.entrySet().iterator();

        System.out.println("-------");

        // 3) Iterating hashmap using ForEach and lamda expression

        studentDetails.forEach((k,v) -> System.out.println("Key is " + k+ " and value is "+ v));



    }
}
