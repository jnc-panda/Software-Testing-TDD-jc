package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void reverseStringTest() {
        /**
         *
         */

    }

    @Test
    void isPalindromeTest() {
        String TrueExample = "hannah";
        String FalseExample = "word";

        boolean resultTrue = StringManipulator.isPalindrome(TrueExample);
        boolean resultFalse = StringManipulator.isPalindrome(FalseExample);

        assertTrue(resultTrue);
        assertFalse(resultFalse);

    }


}