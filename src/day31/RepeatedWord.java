package day31;

import java.util.Arrays;
import java.util.HashMap;

public class RepeatedWord {
    public static String repeatedWord(String string) {
        String firstRepeat = "";
        int wordCounter = 0;

        HashMap<String, Integer> storyHash = new HashMap<>();

        // Convert string to lowercase to account for capitalized words
        // Split the string at all non-word characters and digits
        // Add greedy quantifier to remove extra spaces
        String[] eachWord = string.toLowerCase().split("[\\W\\d]+");
        System.out.println("eachWord array: " + Arrays.toString(eachWord));

        // If the word array is empty
        // Return and empty string
        if (eachWord.length == 0) {
            return "";
        }

        // Iterate through the word array
        // Put the word in the HashMap if it's not in it
        // If the word is in the HashMap, assign it to firstRepeat and return
        for (int i = 0; i < eachWord.length; i++ ) {
            if (!storyHash.containsKey(eachWord[i])) {
                storyHash.put(eachWord[i], wordCounter++);
            } else {
                firstRepeat = eachWord[i];
                return firstRepeat;
            }
        }
        return firstRepeat;
    }
}
