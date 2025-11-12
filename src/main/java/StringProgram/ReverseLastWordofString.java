package StringProgram;

public class ReverseLastWordofString {

    public static void reverseLastWord(String str)
    {
        String[] words = str.split(" ");

        // Reverse the last word manually without using StringBuilder
        String lastWord = words[words.length - 1];
        String reversedLastWord = "";

        for (int i = lastWord.length() - 1; i >= 0; i--) {
            reversedLastWord = reversedLastWord+ lastWord.charAt(i);
        }

        // Replace the last word with the reversed one
        words[words.length - 1] = reversedLastWord;

        // Reconstruct the sentence manually
        String output = "";
        for (int i = 0; i < words.length; i++) {
            output = output+words[i];
            if (i < words.length - 1) {
                output += " ";
            }
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        String str ="This is java online compiler";
           reverseLastWord(str);
    }
}
