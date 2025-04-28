package StringProgram;

import java.util.HashSet;
import java.util.Set;

public class PrintingRepeatingWord {
    public static void repeatingWord(String []str)
    {
        for(int i=0;i< str.length;i++)
        {
            for (int j=i+1;j< str.length;j++)
            {
                if (str[i].equals(str[j]))
                    System.out.println("Repeated element is " +str[i]);
            }
        }
    }
    public static void repeatedWordHashSet(String []str) {
        Set<String> hashString = new HashSet<String>();
        for (String name : str) {
            if (hashString.add(name) == false)
                System.out.println("Repeated element is " + name);
        }
    }
    public static void main(String[] args) {

        String []str={"Java","C","Java","Python","Ruby","C"};
        //repeatingWord(str);
        repeatedWordHashSet(str);
    }
}
