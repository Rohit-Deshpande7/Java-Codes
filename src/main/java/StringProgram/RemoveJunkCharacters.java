package StringProgram;

public class RemoveJunkCharacters {

    public static void removeJunk( String str)
    {
        str=str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str= "@#$ Testing A%&utomation!@";
        removeJunk(str);
    }
}
