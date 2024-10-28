package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void reverseStringTest() {
        String TrueExample = "hannah";
        String FalseExample = "word";

        String resultTrue = StringManipulator.reverseString(TrueExample);
        String resulFalse = StringManipulator.reverseString(FalseExample);


        assertEquals("hannah", resultTrue);
        assertEquals("drow", resulFalse);

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
