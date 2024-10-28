package org.example;

public class StringManipulator {
    public static String reverseString(String input) {
        // TODO: Implement the logic to reverse the input string

        char[] unreversedOutput = input.toCharArray();
        String reversedOutput = "";
        for (int i = unreversedOutput.length - 1 ; i >= 0 ; i--){

            reversedOutput += unreversedOutput[i];
        }
        return reversedOutput;
    }

    public static boolean isPalindrome(String input) {
        // TODO: Implement the logic to check if the input string is a palindrome
        // (A palindrome = same forwards as backwards)

        return input.equals(reverseString(input));
//
    }
}
