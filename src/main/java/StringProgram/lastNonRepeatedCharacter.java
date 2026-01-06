package StringProgram;

public class lastNonRepeatedCharacter {

    public static void main(String []args)
    {
        String str= "Software Services";
        lastNonRepeatedChar(str.toLowerCase());
    }
    public static void lastNonRepeatedChar( String str)
    {
        String result ="";

        for (int i=str.length()-1;i>0;i--)
        {
            int count=0;
            if(str.charAt(i)!=' ')
            {
                for (int j=0;j<str.length();j++)
                {
                    if (str.charAt(i)==str.charAt(j) && i!=j)
                    {
                        count++;
                        break;
                    }
                }
                if (count==0)
                {
                    result=result+str.charAt(i);
                    break;
                }
            }
        }
        System.out.println("last reapeted char is "+ result);
    }
}
