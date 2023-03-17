package ch02lab1;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * description: Gather and use user input to calculate the weight and determine the name of a train.
 * date: 2020-01-28
 * @author Matt
 * @author Alex
 * @author Maks
 */
public class TrainWeight {
    public static void main(String [] args) {
        /*Declare all variables and initialize all constants, scanners, and other classes*/
        //Used to gather user input.
        Scanner scnr = new Scanner(System.in);
        scnr.useDelimiter("\\n"); //Delimit the scanner so nextInt 'consumes' the whole line.
        //The weight of a single Amtrak ACS-64.
        final double LOCOMOTIVE_WEIGHT = 215537.0;
        //The weight of a single Amfleet passenger car.
        final double PASSENGER_CAR_WEIGHT = 106000.0;
        //Total number of locomotives, value comes from user input.
        int totalLocomotives;
        //Total number of passenger cars, value comes from user input.
        int totalPassengerCars;
        //Total weight of all passenger cars. Found from totalPassengerCars * PASSENGER_CAR_WEIGHT.
        double totalPassengerCarWeight;
        //Total weight of all locomotives. Found from totalLocomotives * LOCOMOTIVE_WEIGHT.
        double totalLocomotiveWeight;
        //Total weight of the train. Found from totalLocomotiveWeight + totalPassengerCarWeight.
        double totalTrainWeight;
        //The name of the train, value comes from user input.
        String trainName;
        //Used to format totalTrainWeight to remove the decimal point.
        DecimalFormat decimalFormat = new DecimalFormat("0000");

        /*Gather user input to be used later in calculating the total empty weight of the train.*/
        //Ask the user how many engines the train should have.
        System.out.print("How many engines should the train have? ");
        //Get the next int the user types.
        totalLocomotives = scnr.nextInt();
        //Ask the user how many passenger cars the train should have.
        System.out.print("How many passenger cars should the train have? ");
        //Get the next int the user types.
        totalPassengerCars = scnr.nextInt();
        //Ask the user what the train's name should be.
        System.out.print("What should the train's name be? ");
        //Get the next string the user types.
        trainName = scnr.next();

        /*Calculate the total empty weight of the user defined train.*/
        //Calculate the total weight of all locomotives.
        totalLocomotiveWeight = totalLocomotives * LOCOMOTIVE_WEIGHT;
        //Calculate the total weight of all passenger cars.
        totalPassengerCarWeight = totalPassengerCars * PASSENGER_CAR_WEIGHT;
        //Calculate the total empty weight of the train..
        totalTrainWeight = (totalLocomotiveWeight + totalPassengerCarWeight);
        //Output the trains name and total empty weight into the console.
        //print() or println() could've been used but require concatenation and don't format text.
        System.out.printf("The total weight of %s is %s pounds", trainName, decimalFormat.format(totalTrainWeight));
    }
}
