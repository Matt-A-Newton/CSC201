package ch05lab1;
import java.util.Random;
/**
 * A class to provide some useful random methods
 * https://docs.google.com/document/d/1ah2MCGvrmBPNLGfSxHSMiij_QRuaA9E3k5D-way2UQY/
 edit?usp=sharing
 * 2020-03-25
 * @author Matt N.
 * @author David C.
 */
public class MyMath {
    private static       Random random     = new Random();   // random # generator
    private static final int    NORMAL_DIE = 6;              // normal dice have sides
    private static final int    MIN_SIDES  = 4;              // dice must have at least 4 sides
    /**
     * set the seed for the random number generator (to allow repeatable sequences)
     * @param seed the random seed
     */
    public static void setSeed(long seed) {
        random.setSeed(seed);
    }
    /**
     * return a random number between min (inclusive) and max (inclusive)
     * checks that min, max >= 0 and min <= max
     * @param min one limit for the range
     * @param max the other limit for the range
     * @return a random number in the range
     */
    public static int randomBetween(int min, int max) {
        if (min < 0) {
            min = min * -1;
        }
        if (max < 0) {
            max = max * -1;
        }
        if (max < min) { // if max is less than min
            int a = max;
            int b = min;
            min = a; // a = max which, is less than the current min so we set min to a.
            max = b; // b = min which, is greater than the current max so we set max to b.
        }
        return random.nextInt(max - min + 1) + min;
    }
    /**
     * roll a normal die
     * @return a value between 1 and NORMAL_DIE
     */
    public static int rollDie() {
        return rollDie(NORMAL_DIE);
    }
    /**
     * roll a die of at least MIN_SIDES sides
     * @param sides the # of sides on the die
     * @return a value between 1 (inclusive) and sides (inclusive)
     */
    public static int rollDie(int sides) {
        if (sides < 0) {
            sides = sides * -1;
        }
        if (sides < MIN_SIDES) {
            sides = MIN_SIDES;
        }
        return randomBetween(1, sides);
    }
}