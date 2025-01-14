package edu.guilford;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ScrabbleProjectDriver {
    private static boolean isValidWord(String word) {
        return word.matches("[A-Za-z]+");
    }
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
            int score = scrabbleSet.calculatePoints(word);
            System.out.printf("%s -> %d%n", word, score);
        }

   List<String> frankensteinWords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/ayaam/Programming/School/project1/src/main/java/edu/guilford/frankenstein.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    frankensteinWords.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }        

        for (Iterator<String> iterator = frankensteinWords.iterator(); iterator.hasNext(); ) {
            String word = iterator.next();
            if (!isValidWord(word)) {
                iterator.remove();
            }
        }        //find the word with highest num of scrabble points
        int maxScore = 0;
        String maxWord = null;
        for (String word : frankensteinWords) {
            int score = scrabbleSet.calculatePoints(word);
            if (score > maxScore) {
                maxScore = score;
                maxWord = word;
            }
        }
        System.out.printf("Max score: %d, Word: %s%n", maxScore, maxWord);
        //find shortest word that is invalid that is a word and not a number
        String minWord = null;
        int counter = 0; 

        //go through and find the shortest word that scores -1
        for (String word : frankensteinWords) {
            int score = scrabbleSet.calculatePoints(word);
            if (score == -1) {
                if ( minWord == null || word.length() < minWord.length()) {
                    minWord = word;
                }
            }
        }
        System.out.println("Shortest invalid word: " + minWord); 
}
}
