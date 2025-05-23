package HashMapPrograms;

import java.util.HashMap;

public class hashMapComparisons {

    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"c");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(3,"c");
        map2.put(1,"A");
        map2.put(2,"B");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(1,"A");
        map3.put(2,"B");
        map3.put(3,"c");
        map3.put(4,"d");

        //  1) on the basis of key-value using equals method
        System.out.println(map1.equals(map3));

        // 2) comparing 2 hashmaps with same key using keySet()
        System.out.println(map1.keySet().equals(map3.keySet()));




    }
}
