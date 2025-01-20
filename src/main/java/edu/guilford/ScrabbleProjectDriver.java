package edu.guilford;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScrabbleProjectDriver {

    public static void main(String[] args) {
        String[] words = {
                "HELLO",
                "WORLD",
                "QUIZ",
                "JAZZ",
                "XYZ",
                "ABRACADABRA",
                "SYZYGY",
                "COMPUTER",
                "PROGRAM",
                "SERENDIPITY",
                "PALINDROME",
                "QUEUE",
                "JAVA",
                "SCRABBLE",
                "RHYTHM",
                "MYTH",
                "POLYNYA",
                "ZYMURGY",
                "BENCH",
                "KWANZAA",
                "XYLOPHONE",
                "BAGPIPES",
                "PUZZLE",
                "SQUEEZY",
                "EXAMPLES"
        };
        ScrabbleSet scrabbleSet = new ScrabbleSet("English");
        ScrabbleSet scrabbleSet2 = new ScrabbleSet();
        System.out.println(scrabbleSet);
        System.out.println(scrabbleSet2);
        for (String word : words) {
            int score = scrabbleSet.calculatePoints(word, false);
            System.out.printf("%s -> %d%n", word, score);
        }
        List<String> frankensteinWords = readWordsFromFile(
                "src/main/java/edu/guilford/frankenstein.txt"); //relative import wouldnt work 
        System.out.println(findMaxScore(frankensteinWords, scrabbleSet, false)); //can caclulate with blank or no blank from method, rather then creating a new scrabbleset just for blank vs no blank
        System.out.println(findShortestInvalid(frankensteinWords, scrabbleSet, false)); //there are no invalid words if you use blanks

        for (int i = 0; i < 10; i++) {
            ScrabbleSet randomSet = new ScrabbleSet();
            System.out.println(findMaxScore(frankensteinWords, randomSet, false));
            System.out.print(findShortestInvalid(frankensteinWords, randomSet, false) + '\n');
        }

  // Implement a loop that asks the user for words to evaluate against both scrabbleSet and scrabbleSet2
    Scanner scanner = new Scanner(System.in);
    boolean sentinel = false;

    System.out.print("Enter a word to evaluate (or type 'exit' to quit): ");
    String input = scanner.nextLine();
    sentinel = input.equalsIgnoreCase("exit");

    if (!sentinel) {
        int score1 = scrabbleSet.calculatePoints(input, false);
        int score2 = scrabbleSet2.calculatePoints(input, false);

        System.out.println("ScrabbleSet 1 - Word: " + input + ", Score: " + score1);
        System.out.println("ScrabbleSet 2 - Word: " + input + ", Score: " + score2);
    }
    scanner.close();
}


    private static boolean isValidWord(String word) {
        return word.matches("[A-Za-z]+");
    }

    private static String findMaxScore(List<String> words, ScrabbleSet scrabbleSet, boolean blanksOn) {
        int maxScore = 0;
        String maxWord = null;
        for (String word : words) {
            int score = scrabbleSet.calculatePoints(word, blanksOn);
            if (score > maxScore) {
                maxScore = score;
                maxWord = word;
            }
        }
        return maxWord + " " + maxScore;
    }

    private static String findShortestInvalid(List<String> words, ScrabbleSet scrabbleSet, boolean blanksOn) {
        String minWord = null;
        for (String word : words) {
            int score = scrabbleSet.calculatePoints(word, blanksOn);
            if (score == -1) {
                if (minWord == null || word.length() < minWord.length()) {
                    minWord = word;
                }
            }
        }
        return minWord;
    }

    private static List<String> readWordsFromFile(String filename) {
        List<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                words.addAll(Arrays.asList(lineWords));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // remove any words that contain anything but alphabet characters-- without
        // this, the minimum word is always 1 even when going character by character
        for (Iterator<String> iterator = words.iterator(); iterator.hasNext();) {
            String word = iterator.next();
            if (!isValidWord(word)) {
                iterator.remove();
            }
        }
        return words;

    }
}
