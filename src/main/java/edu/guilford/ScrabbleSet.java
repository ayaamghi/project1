package edu.guilford;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ScrabbleSet {
    Random random = new Random();

    private ArrayList<TileDistribution> tileDistributions = new ArrayList<>(); // holds the tile and the
                                                                                               // count in the same
                                                                                               // object

    public ScrabbleSet(String language) {
        switch (language) {
            case "English" -> {
                for (int[] symbol : Languages.ENGLISH_DISTRIBUTION) {
                    tileDistributions.add(new TileDistribution(new Tile((char) symbol[0], symbol[1]), symbol[2]));
                }
            }
        }
    }

    public ScrabbleSet() {
        // 1) Assign each symbol exactly 1 tile so we have at least one of each.
        for (int[] symbol : Languages.ENGLISH_DISTRIBUTION) {
            tileDistributions.add(
                    new TileDistribution(
                            new Tile((char) symbol[0], symbol[1]),
                            1 // at least one
                    )
            );
        }
        // Define which letters are “uncommon” and how many of each are allowed
        Map<Character, Integer> uncommonLimits = new HashMap<>();
        uncommonLimits.put('Q', 2); // at most 2 Q tiles
        uncommonLimits.put('Z', 2);
        uncommonLimits.put('X', 2);
        uncommonLimits.put('J', 2);

        // 2) Calculate how many tiles remain to reach 100
        int leftover = 100 - tileDistributions.size();

        // 3) Randomly distribute those leftover tiles
        while (leftover > 0) {
            int index = random.nextInt(tileDistributions.size());
            TileDistribution currentDist = tileDistributions.get(index);

            // If the tile is uncommon, check if we’ve hit the limit
            char letter = currentDist.getTile().getLetter();
            if (uncommonLimits.containsKey(letter)) {
                int maxAllowed = uncommonLimits.get(letter);
                if (currentDist.getCount() >= maxAllowed) {
                    // Skip this letter and pick again
                    continue;
                }
            }

            // If we get here, it’s either not uncommon or under its limit
            currentDist.setCount(currentDist.getCount() + 1);
            leftover--;
        }
    }
    @Override
    public String toString() {
        return "ScrabbleSet{" +
                "tileDistributions=" + tileDistributions + // toString of TileDistribution is toString of Tile + a count
                '}';
    }

    public int calculatePoints(String word) {
        int points = 0;
        //turn word uppercase
        word = word.toUpperCase();
        //first, check if any letters in the word appear more often than they are in the set
        //O(n^2) solution for now 
        for (char letter : word.toCharArray()) {
            int countInWord = 0;
            for (char letter2 : word.toCharArray()) {
                if (letter == letter2) {
                    countInWord++;
                }
            }
            //O(n) solution for TileDistributions
            int countInSet = 0;
            for (TileDistribution tileDistribution : tileDistributions) {
                if (tileDistribution.getTile().getLetter() == letter) {
                    countInSet = tileDistribution.getCount();
                    break;
                }
            }
            if (countInWord > countInSet) {
                return -1;
            }
            }
        //if we get here, we can calculate the points
        for (char c : word.toCharArray()) {
            for (TileDistribution dist : tileDistributions) {
                if (dist.getTile().getLetter() == c) {
                    points += dist.getTile().getValue();
                    break;}}
 }


 return points;
    } 

}

