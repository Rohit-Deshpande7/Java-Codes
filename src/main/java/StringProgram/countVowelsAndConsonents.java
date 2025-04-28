package StringProgram;

public class countVowelsAndConsonents {

    public static void main(String[] args) {
        String str= "This is Java Program";
        str.toLowerCase();
        int vowels=0, consonents=0;
        for (char c:str.toCharArray())
        {
            if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
                vowels++;
            }
            else {
                consonents++;
            }
        }
        System.out.println("Vowels are "+ vowels);
        System.out.println("Consonents are "+ consonents);
    }
}
