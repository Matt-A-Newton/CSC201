package ch08lab2;
import java.util.Scanner;

/**
 * keeps track of which boat is at which slip and storing information about them in Boat objects
 * 2020-04-29
 * @author Matt N.
 * @author Jose G.
 * @author John Maxfield
 */
public class Marina {
    private Scanner scnr = new Scanner(System.in);          // used to get user input

    /**
     * gathers information about the marina and the boats docked within it
     */
    public Marina() {
        Boat[][] boatArray;                                        // # of docks / slips per dock
        int numDocks;                                              // # of docks within the marina
        int numSlips;                                              // # of slips per dock
        Character slipLetter;                                      // the letter of the current slip
        int i;                                                     // the current index
        numDocks = getInt("Enter # of docks in the Marina: ", 26);
        numSlips = getInt("Enter # of slips per dock: ", 26);
        boatArray = new Boat[numDocks][numSlips];
        slipLetter = 'A';

        for (i = 0; i < boatArray.length; i++) {
            for (int j = 0; j < boatArray[i].length; j++) {
                boatArray[i][j] = getBoatData("in slip " + slipLetter + (j + 1));
            }
            slipLetter++;
        }

        System.out.println();
        System.out.println("Boats in marina:");
        for (Boat[] a: boatArray) {
            for (Boat b : a) {
                System.out.println(b);
            }
        }
    }

    /**
     * gather information about the marina how the marina is setup
     * @param prompt the text that should be displayed when asking for user input
     * @param upperLimit the maximum allowed value that can be accepted as valid input.
     * @return a value which is between 1 (inclusive) and upperLimit (inclusive)
     */
    private int getInt(String prompt, int upperLimit) {
        int userInt; // a user generated number
        do {
            System.out.print(prompt);
            userInt = scnr.nextInt();
            scnr.nextLine();
        } while (userInt < 1 || userInt > upperLimit);
        return (userInt);
    }

    /**
     * prompts user for boat data, creates the Boat object
     * @param label for the boat, used in the prompts to user
     * @return the completed boat object
     */
    private Boat getBoatData(String label) {
        String name;                              // name of the boat
        String type;                              // type of the boat
        double length;                            // length of the boat

        // get info for Boat
        System.out.print("Please enter the name of boat " + label + ": ");
        name = scnr.nextLine();
        System.out.print("Please enter the type of boat " + label + ": ");
        type = scnr.nextLine();
        System.out.print("Please enter the length of boat " + label + ": ");
        length = scnr.nextDouble();

        // remove the \n from input
        scnr.nextLine();

        // create and return the Boat
        return new Boat(name, type, length);
    }

    /**
     * calls the constructor
     * @param args ignored
     */
    public static void main(String[] args) {
        new Marina();
    }
}
