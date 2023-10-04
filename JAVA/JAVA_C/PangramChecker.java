//  

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(String input) {
        // set to store unique lowercase alphabets
        Set<Character> alphabetSet = new HashSet<>();

        // Iterate through the input
        for (char c : input.toCharArray()) {
            // Check character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                alphabetSet.add(c);
            }
        }

        // Check it contains all lowercase alphabets
        return alphabetSet.size() == 26;
    }
}
