package edu.guilford;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Tests exact Scrabble scoring for 25 words using a standard
 * English Scrabble letter-value distribution.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ScrabbleSetExactScoresTest {

    private ScrabbleSet scrabbleSet;

    @BeforeEach
    void setUp() {
        // Use a constructor or factory that sets up a
        // standard (NON-random) English Scrabble distribution
        scrabbleSet = new ScrabbleSet("English");
    }

    /**
     * Parameterized test for 25 words. Each line in @CsvSource
     * includes the word and the known correct point total under
     * standard Scrabble scoring.
     */
    @ParameterizedTest
    @CsvSource({
        "HELLO, 8",
        "WORLD, 9",
        "QUIZ, 22",
        "JAZZ, -1",
        "XYZ, 22",
        "ABRACADABRA, 18",
        "SYZYGY, -1",
        "COMPUTER, 14",
        "PROGRAM, 12",
        "SERENDIPITY, 17",
        "PALINDROME, 15",
        "QUEUE, 14",
        "JAVA, 14",
        "SCRABBLE, 14",
        "RHYTHM, 17",
        "MYTH, 12",
        "POLYNYA, 15",
        "ZYMURGY, 25",
        "BENCH, 12",
        "KWANZAA, 23",
        "XYLOPHONE, 24",
        "BAGPIPES, 15",
        "PUZZLE, -1",
        "SQUEEZY, 28",
            "EXAMPLES, 19"
        })
        void testExactWordScore(String word, int expectedScore) {
            int actualScore = scrabbleSet.calculatePoints(word);
            System.out.printf("%s -> Expected: %d, Actual: %d%n", word, expectedScore, actualScore);
            Assertions.assertEquals(expectedScore, actualScore,
                         "Score mismatch for word: " + word);
        }

}