package edu.guilford;

/*
 * Class for "Challenge Use a single attribute for all this information. In doing so, do not add attributes to the Tile class."
 */
public class TileDistribution {
    
    private Tile tile;
    private int count;

    public TileDistribution(Tile tile, int count) {
        this.tile = tile;
        this.count = count;
    }

    public Tile getTile() {
        return tile;
    }
    public int getCount() {
        return count;
    }
    //setters
    public void setTile(Tile tile) {
        this.tile = tile;
    }
    public void setCount(int count) {
        this.count = count;
    }
    @Override
    public String toString() {
        return "Tile: " + tile.getLetter() + " Value: " + tile.getValue() + " Count: " + count;
    }
    
}
