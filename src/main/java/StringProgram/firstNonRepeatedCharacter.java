package StringProgram;

public class firstNonRepeatedCharacter {

    public static void main(String []args)
    {
        String str= "Software Services";
        firstNonReapetedChar(str.toLowerCase());
    }
    public static void firstNonReapetedChar( String str)
    {
        String result= "";

        for (int i=0;i<str.length();i++)
        {
            int count=0;
            if(str.charAt(i)!= ' ') {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j) && i!=j) {
                        count++;
                        break;
                    }
                }
                if(count==0)
                {
                    result=result+str.charAt(i);
                    break;
                }
            }
        }
        System.out.println("First repeated char is "+result);
    }
}
