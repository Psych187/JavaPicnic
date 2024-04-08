import java.io.File;
import java.util.*;

import java.io.File;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\input.txt");

        WordCounter wordCounter = new WordCounter();
        int wordCount = wordCounter.countWords(file);
        System.out.println("Number of words in file: " + wordCount);

        LongestWordFinder longestWordFinder = new LongestWordFinder();
        Set<String> longestWords = longestWordFinder.findLongestWords(file);
        System.out.println("The longest words:");
        for (String word : longestWords) {
            System.out.println(word);
        }

        FrequencyCounter frequencyCounter = new FrequencyCounter();
        Map<String, Integer> wordFrequency = frequencyCounter.countWordFrequency(file);

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordFrequency.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Words frequency:");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}