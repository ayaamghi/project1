package edu.guilford;

import java.util.ArrayList;
import java.util.Random;

public class ScrabbleSet {
    Random random = new Random();

    private ArrayList<TileDistribution> tileDistributions = new ArrayList<TileDistribution>(); //holds the tile and the count in the same object
    
    public ScrabbleSet(String language) { 
        switch (language) {
            case "English" -> {
                for(int[] symbol : Languages.ENGLISH_DISTRIBUTION) {
                    tileDistributions.add(new TileDistribution(new Tile((char) symbol[0], symbol[1]), symbol[2]));                }
}}}

public ScrabbleSet() {
    // 1) Assign each symbol exactly 1 tile
    //    so we have at least one of each.
    for (int[] symbol : Languages.ENGLISH_DISTRIBUTION) {
        tileDistributions.add(new TileDistribution(
            new Tile((char) symbol[0], symbol[1]),
            1  // at least one
        ));
    }
    // 2) Calculate how many tiles remain to reach 100
    int leftover = 100 - tileDistributions.size();
    // 3) Randomly distribute those leftover tiles
    //    among all tile types.
    while (leftover > 0) {
        int index = random.nextInt(tileDistributions.size());
        // increment the count of a random tile by 1
        TileDistribution currentDist = tileDistributions.get(index); //get a tile and change it
        currentDist.setCount(currentDist.getCount() + 1); 
        leftover--;
    }
}

@Override
 public String toString() {
    return "ScrabbleSet{" +
            "tileDistributions=" + tileDistributions + //toString of TileDistribution is toString of Tile + a count
            '}';
 }

}
