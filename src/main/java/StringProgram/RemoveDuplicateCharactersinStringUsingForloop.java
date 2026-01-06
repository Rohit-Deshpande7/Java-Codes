package StringProgram;

public class RemoveDuplicateCharactersinStringUsingForloop {

    public static void main( String []args)
    {
        String str="rohitRohHithi";
        removeDuplicates(str.toLowerCase());
    }
    public static void removeDuplicates(String str)
    {
     String result="";
     for(int i=0;i<str.length();i++)
     {
         int count=0;
         if(str.charAt(i)!=' ')
         {
             for(int j=i+1;j<str.length();j++)
             {
                 if (str.charAt(i)==str.charAt(j) && i!=j)
                   count++;
               }
             if(count==0)
                 result =result+str.charAt(i);
         }
      }
     System.out.println("String without repeated characters is "+ result);
    }
}
