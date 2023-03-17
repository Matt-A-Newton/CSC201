package ch06lab2;
import java.util.Scanner;

/**
 * gathers user input, calls another class to check if a part number is valid, and outputs result
 * 2020-04-01
 * @author Matt N.
 * @author Jose G.
 */
public class PartNumberMain {
    private static Scanner scnr = new Scanner(System.in); // a scanner used to gather user input
    /**
     * description: takes in user input, checks if the input is valid, then outputs the result
     * @param args ignored
     */
    public static void main(String[] args) {
        String isOrIsNot;  // used to reduce repetition when outputting information
        String partNumber; // a part number

        System.out.print("Please enter a part number: ");
        partNumber = scnr.nextLine();

        isOrIsNot = (PartNumber.isValid(partNumber)) ? "is" : "is not";

        System.out.printf("The part number (%s) you entered %s valid", partNumber, isOrIsNot);
    }
}