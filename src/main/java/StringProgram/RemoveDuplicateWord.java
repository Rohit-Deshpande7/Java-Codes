package StringProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateWord {
    public static void main(String []args)
    {
        String str = ("four,five,six,four,seven,five,six,four");
        //removeDuplicateWordWithForLoop(str.toLowerCase());
       // removeDuplicateWordWithHashSet(str);
        removeDuplicateWordWithHashMap(str);
    }
    public static void removeDuplicateWordWithForLoop(String str)
    {
        String strArr[] = str.split(",");
        for (int i=0;i<strArr.length;i++)
            for (int j=i+1;j<strArr.length;j++)
              if (strArr[i].equals(strArr[j]))
                  System.out.println(strArr[i]+" is repeated");
    }
    public static void removeDuplicateWordWithHashSet(String str)
    {
        Set<String> findDuplicate = new HashSet<String>();
        String strArr[] = str.split(",");
        for (String duplicate : strArr)
        {
            if (findDuplicate.add(duplicate)==false)
                System.out.println(duplicate+" is duplicate");
        }
    }
    public static void removeDuplicateWordWithHashMap(String str)
    {
        String strArr[] = str.split(",");
        Map<String, Integer> duplicateMap = new HashMap<String, Integer>();
        for (String duplicate :strArr)
        {
            Integer count= duplicateMap.get(duplicate);
            if (count==null)
                duplicateMap.put(duplicate,1);
            else
                duplicateMap.put(duplicate,++count);
        }
        //getting values from the Hashnap
        Set<Map.Entry<String,Integer>> entrySet= duplicateMap.entrySet();
        for (Map.Entry<String,Integer> entry: entrySet)
         if (entry.getValue()>1)
             System.out.println(entry.getKey() + " is duplicate");
    }
}
