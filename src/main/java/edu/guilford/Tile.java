package edu.guilford;

public class Tile {
    

    private char letter;
    private int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public char getLetter() {
        return letter;
    }
    public int getValue() {
        return value;
    }
    //setters
    public void setLetter(char letter) {
        this.letter = letter;
    }
    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Tile: " + letter + " Value: " + value;
    }
}
