package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordAnalyser {
    public static String[] findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text
        String[] output = text.split(" ");
        String[] currentLongestWordsArray = {output[0]}; ;
        int currentLongestWordLength = currentLongestWordsArray[0].length();
        for (int i = 0  ;  i < output.length ; i++){
            if ( output[i].length() == currentLongestWordLength ){
                currentLongestWordsArray[currentLongestWordsArray.length - 1] = output[i];
            }
            if (output[i].length() > currentLongestWordLength){
                currentLongestWordsArray = new String[]{""};
                currentLongestWordsArray[0] = output[i];

            }
            currentLongestWordLength = currentLongestWordsArray[0].length();
        }
        return currentLongestWordsArray;
    }

    public static Map<Character, Integer> calculateLetterFrequency(String text) {
        // TODO: Implement the logic to calculate the frequency of each letter in the given text
        String lowerCaseText = text.toLowerCase();
        String noSpacesText = lowerCaseText.replaceAll("[-+.?@$!%^:,\\s]","");
        char[] lettersArray = noSpacesText.toCharArray();
        HashMap<Character, Integer> letterFrequency = new HashMap<>();

        letterFrequency.put(lettersArray[0], 1);

        for (int i = 1 ; i < noSpacesText.length() ; i++){
            if (letterFrequency.containsKey(lettersArray[i])){
                letterFrequency.put(lettersArray[i], letterFrequency.get(lettersArray[i]) + 1) ;

            }else {
                letterFrequency.put(lettersArray[i], 1) ;
            }
        }

        return letterFrequency;
    }
}
