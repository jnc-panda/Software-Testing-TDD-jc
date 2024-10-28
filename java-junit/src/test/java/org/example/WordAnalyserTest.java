package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {

    @Test
    void testFindLongestWords() {
        String testSentence1 = "This is a cool test sentence with a really long word.";

        String[] result1 = WordAnalyser.findLongestWords(testSentence1);

        String[] expectedResult1 = {"sentence"};

        assertTrue(Arrays.equals(expectedResult1,result1));
    }

    @Test
    void testCalculateLetterFrequency() {

        Map<Character, Integer> expectedResult1 = Map.of('a',3, 'b', 2);
        Map<Character, Integer> expectedResult2 = Map.of('a',3, 'b', 2, 'c', 1, 'd', 1);
        Map<Character, Integer> expectedResult3 = Map.of('a',3, 'b', 1, 'c', 5);


        Map<Character, Integer> result1 = WordAnalyser.calculateLetterFrequency("aaa bb");
        Map<Character, Integer> result2 = WordAnalyser.calculateLetterFrequency("A bad cab!");
        Map<Character, Integer> result3 = WordAnalyser.calculateLetterFrequency("AAA@$B  CCCCC");


        assertEquals(expectedResult1, result1);
        assertEquals(expectedResult2, result2);
        assertEquals(expectedResult3, result3);


    }
}
