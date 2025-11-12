package StringProgram;

public class occuranceOfEachCharacter {
    public static void main(String[] args) {
        String str = "Rohit Deshpande";
        occuranceOfEachCharacter(str);
    }
    public static void occuranceOfEachCharacter(String str)
    {
        int []freq= new int[str.length()];
        char str1[]= str.toCharArray();

        for (int i=0;i<str.length();i++)
        {
            freq[i]=1;
            for (int j=0;j<str.length();j++)
            {
                if (str1[i]==str1[j])
                {
                    freq[i]++;

                    str1[j]='0';
                }
            }
        }
    }
}
