package edu.guilford;
/**
 * Holds language distributions
 */
public class Languages {
/*
 *  English_Distribution[0][0] would be the letter (as ASCII), [0][1] would be the value, and [0][2] would be the count. [1][0] would be the next symbol's symbol
 */
static final int[][] ENGLISH_DISTRIBUTION = { //integer array to make life easier vs Object array
    {32, 0, 2},   // Blank tile
    {65, 1, 9},
    {66, 3, 2},
    {67, 3, 2},
    {68, 2, 4},
    {69, 1, 12},
    {70, 4, 2},
    {71, 2, 3},
    {72, 4, 2},
    {73, 1, 9},
    {74, 8, 1},
    {75, 5, 1},
    {76, 1, 4},
    {77, 3, 2},
    {78, 1, 6},
    {79, 1, 8},
    {80, 3, 2},
    {81, 10, 1},
    {82, 1, 6},
    {83, 1, 4},
    {84, 1, 6},
    {85, 1, 4},
    {86, 4, 2},
    {87, 4, 2},
    {88, 8, 1},
    {89, 4, 2},
    {90, 10, 1}
};

}
