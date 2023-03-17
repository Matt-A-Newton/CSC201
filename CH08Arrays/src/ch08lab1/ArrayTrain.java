package ch08lab1;

import java.util.Scanner;

/**
 * loads / unloads train containers whose contents are derived from user input or command line args
 * 2020-04-22
 * @author Matt N.
 * @author Jose G.
 */
public class ArrayTrain {
    private static Scanner scnr = new Scanner(System.in); // gets user input
    private String[] train;                               // holds each train container's contents

    /**
     * description: no-arg constructor, does nothing
     */
    public ArrayTrain () {

    };

    /**
     * description: int-arg constructor uses loadTrain() / unloadTrain() to load/unload containers
     * @param numContainers the number of containers the train is carrying
     */
    public ArrayTrain (int numContainers) {
        this.train = new String [numContainers];
        loadTrain();
        unloadTrain();
    };

    /**
     * description: string-array-arg constructor
     * @param train the contents of train containers
     */
    public ArrayTrain (String[] train) {
        System.out.println("Strings copied from command line");
        this.train = train;
        unloadTrain();
    }

    /**
     * description: gets and stores the contents of each container
     */
    private void loadTrain() {
        for (int i = 0; i < this.train.length; i++) {
            System.out.print("What's in container #" + (i + 1) + "? ");
            this.train[i] = scnr.nextLine();
        }
    }

    /**
     * description: prints the contents of the container, starting from the last container
     */
    private void unloadTrain() {
        for (int i = (this.train.length - 1); i > -1; i--) {
            System.out.println("Unloading " + this.train[i] + ".");
        }
    }

    /**
     * description: gets the number of containers the train should carry
     * @return returns the number of containers the train should have
     */
    private static int getNumContainers() {
        int numContainers; // used to store the number of trains
        do {
            System.out.print("How many containers are on the train? ");
            numContainers = scnr.nextInt();
            scnr.nextLine();
        } while (numContainers <= 0);
        return (numContainers);
    }

    /**
     * description: calls the appropriate constructor depending on if command-line args are use
     * @param args optional, command line args will be used as the contents of containers if present
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            new ArrayTrain(getNumContainers());
        } else {
            new ArrayTrain(args);
        }
    }
}
