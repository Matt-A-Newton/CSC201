package ch05lab1;
import java.util.Scanner;
/**
 * description: Randomly rolls a die
 * date: 2020-18-03
 * @author Matt N.
 * @author David C.
 */
public class MyMathMain {
    private static Scanner scnr = new Scanner(System.in);
    /**
     * description: takes in user input, rolls a die, and outputs information about the rolls
     * @param args ignored
     */
    public static void main(String[] args){
        int maxSides; // the minimum number of sides the die can have
        int minSides; // the maximum number of sides the die can have
        System.out.print("Enter # of sides of the die to throw: ");
        maxSides = scnr.nextInt();
        scnr.nextLine();
        System.out.print("Enter another int: ");
        minSides = scnr.nextInt();
        scnr.nextLine();
        printTable("Different", maxSides, MyMath.rollDie(maxSides), MyMath.rollDie(maxSides));
        printTable("Same", maxSides, minSides, maxSides);
        System.out.printf
        (
                "A random number between %d and %d is: %d%n",
                 maxSides, minSides, MyMath.randomBetween(maxSides, minSides)
        );
    }
    /**
     * description: outputs a table with information about each roll
     * @param label the label used when outputting the table
     * @param sides the number of sides the die used has
     * @param num1  a random number
     * @param num2  a random number
     */
    private static void printTable(String label, int sides, int num1, int num2){
        MyMath.setSeed(sides);
        System.out.printf
        (
            "%s every time:%n"+
            " # Sides   Roll 1   Roll 2%n"+
            "-------- -------- --------%n"+
            "      %d        %d       %d%n",
            label, sides, num1, num2
        );
    }
}
