package StringProgram;

import java.util.Scanner;

public class NameAbbreviation {

    public  static void main(String [] args)
    {
        //String str="Netaji Subhash Chandra Bose";
        System.out.println("Enter the name");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        namemodification(str);
    }
    public static void namemodification(String str)
    {
        String [] name=str.split(" ");
        String revisedName="";

        for (int i=0;i< name.length-1;i++)
        {
            revisedName= revisedName+name[i].charAt(0)+".";
        }
        revisedName=revisedName+" "+name[name.length-1];
        System.out.println(revisedName);
    }

}
