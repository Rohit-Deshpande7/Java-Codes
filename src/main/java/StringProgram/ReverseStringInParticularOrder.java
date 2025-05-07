package StringProgram;

public class ReverseStringInParticularOrder {
    public static void main(String[] args) {

        String input = "I am Ram,Currently working on,Automation project,and giving inverview.";

        // Step 1: Split by commas
        String[] groups = input.split(",");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < groups.length; i++)
        {
            String group = groups[i].trim();

            // Step 2: Split words and reverse
            String[] words = group.split("\\s+");
            StringBuilder reversedGroup = new StringBuilder();

            for (int j = words.length - 1; j >= 0; j--) {
                reversedGroup.append(words[j]);
                if (j != 0) {
                    reversedGroup.append(" ");
                }
            }

            result.append(reversedGroup);

            // Add comma except after the last group
            if (i != groups.length - 1) {
                result.append(", ");
            }
        }

        System.out.println("Output: " + result.toString());
    }
}

