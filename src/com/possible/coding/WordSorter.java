package com.possible.coding;

import java.util.Arrays;
import java.util.Comparator;

public class WordSorter {

    /*
    * Question
        Given a sentence text (A sentence is a string of space-separated words) in the following format:
         - The first letter is in upper case.
         - Each word in the text is separated by a single space.
        Rearrange the words in the text such that all words are rearranged in increasing order of their lengths. If two words have the same length, arrange them in their original order.

        Return the new text following the format shown above.

        Example Input: text = "Coding is supa cool"
        Output: "Is cool supa coding"

     */

    public static String rearrangeWords(String input) {
        String text = input.toLowerCase();
        // Split the text into an array of words
        String[] words = text.split(" ");

        // Create a custom comparator to sort words based on their lengths and original order
        Comparator<String> wordComparator = (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            } else {
                // If lengths are the same, compare their original order
                int indexA = Arrays.asList(words).indexOf(a);
                int indexB = Arrays.asList(words).indexOf(b);
                return Integer.compare(indexA, indexB);
            }
        };

        // Sort the array of words using the custom comparator
        Arrays.sort(words, wordComparator);
        words[0]  = words[0].substring(0, 1).toUpperCase() + words[0].substring(1);

        // Join the sorted words back into a string
        return String.join(" ", words);
    }

}
