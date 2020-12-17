package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Given a number in Roman numeral format, convert it to decimal.
 * 
 * The values of Roman numerals are as follows:
 * 
 * { 'M': 1000, 'D': 500, 'C': 100, 'L': 50, 'X': 10, 'V': 5, 'I': 1 } In addition, note that the Roman numeral system
 * uses subtractive notation for numbers such as IV and XL.
 * 
 * For the input XIV, for instance, you should return 14.
 */
public class RomanToDecimal {

    private static int convertToDecimal(String input, Map<Character, Integer> romanCharMap) {
        System.out.println(input);
        int out = 0;

        char[] inputChars = input.toCharArray();

        for (int i = 0; i < inputChars.length - 1; i++) {

            if (romanCharMap.get(inputChars[i]) >= romanCharMap.get(inputChars[i + 1]))
                out += romanCharMap.get(inputChars[i]);
            else
                out -= romanCharMap.get(inputChars[i]);
        }
        out += romanCharMap.get(inputChars[inputChars.length - 1]);
        return out;
    }

    public static void main(String[] args) {
        System.out.println("RomanToDecimal");

        Map<Character, Integer> romanCharMap = new HashMap<>();
        romanCharMap.put('M', 1000);
        romanCharMap.put('D', 500);
        romanCharMap.put('C', 100);
        romanCharMap.put('L', 50);
        romanCharMap.put('X', 10);
        romanCharMap.put('V', 5);
        romanCharMap.put('I', 1);

        // 245
        String input = "CCXLV";
        int decimal = convertToDecimal(input, romanCharMap);
        System.out.println(decimal);

    }
}
