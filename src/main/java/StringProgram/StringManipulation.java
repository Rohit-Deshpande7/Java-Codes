package StringProgram;

public class StringManipulation {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        String str= "The rains have started here selenium";
        String str1= "The rains have started here selenium";


        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf('s'));    // 1st occurrence of any char
        //System.out.println(str.indexOf('s',9));  //2nd occurrence of any char
        System.out.println(str.indexOf('s', str.indexOf('s')+1));
        int i = str.indexOf('s')+str.indexOf('s')+1;
        System.out.println(str.indexOf('s', i+1));   //3rd occurrence of any char

        //String comparisons
        System.out.println(str.equals(str1));

        //Substring
        System.out.println(str.substring(4,10));

        //Trim
        System.out.println(str.trim());

        System.out.println(str.replace(" ","@"));

        //Split

        String splitArray[]= str.split("@");
        for (int j=0;j< splitArray.length;j++)
            System.out.println(splitArray[i]);


    }
}
