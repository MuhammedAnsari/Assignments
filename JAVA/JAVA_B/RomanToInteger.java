//Enter Roman Number as input and convert it to integer. 

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); // To uppercase

        int result = romanToInt(romanNumeral);

        if (result != -1) {
            System.out.println("The integer value is: " + result);
        } else {
            System.out.println("Invalid Roman numeral entered.");
        }

        scanner.close();
    }

    public static int romanToInt(String s) {
        // HashMap ( Store roman numbers )
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the roman numbers
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.getOrDefault(currentChar, 0);

            if (currentValue == 0) {
                // Invalid roman number
                return -1;
            }

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}
