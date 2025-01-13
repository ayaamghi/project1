package edu.guilford;

import java.util.ArrayList;

public class ScrabbleSet {


    private ArrayList<Tile> tiles = new ArrayList<>();
    private int[] tileCounts; //holds the counts of the tiles
    //private TileDistribution[] tileDistributions; //holds the tile and the number in the same object
    public ScrabbleSet(String language) { 
        switch (language) {
            case "English" -> {
                tileCounts = new int[26];
                for(Object o : Languages.ENGLISH_DISTRIBUTION) {
                    char letter = (char) ((Object[]) o)[0]; //casting to char makes the blank tile showup incorrectly as 0
                  //  System.out.println(letter); 
                    int value = (int) ((Object[]) o)[1];
                    int count = (int) ((Object[]) o)[2];
                    for(int i = 0; i < count; i++) {
                        tiles.add(new Tile(letter, value));
                        tileCounts[i] = count;
                    }
                }
}
                    }

    }
@Override
public String toString() {
    
return tiles.toString() + "\n" + tileCounts[1];
}
}
