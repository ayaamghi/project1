package edu.guilford;

public class ScrabbleProjectDriver {
    public static void main(String[] args) {

        // ArrayList<Tile> tiles = new ArrayList<>();
        // System.out.println(Languages.ENGLISH_DISTRIBUTION[26][0]);

        // for(Object[] o : Languages.ENGLISH_DISTRIBUTION) {
        //     char letter = (char) o[0]; //casting to char makes the blank tile showup incorrectly as 0
        //     int value = (int) ((Object[]) o)[1];
        //     int count = (int) ((Object[]) o)[2];
        //     for(int i = 0; i < count; i++) {
        //         tiles.add(new Tile(letter, value));
        //     }
        // }
        // System.out.println(tiles); 

        ScrabbleSet scrabbleSet = new ScrabbleSet("English");
        System.out.println(scrabbleSet); 
    }
}
