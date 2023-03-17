
package ch04lab2;
import java.util.Scanner;
/**
 * create a couple more Boat objects, fill them with data, print the info
 * https://docs.google.com/document/d/1OSm0Z4tuR_ZVXTq1qci21ZfK1xDvPQB1IaBBiYKhGEY/
 edit?usp=sharing
 * 2018-09-20
 * @author john maxfield
 */
public class BoatMain {
   private static Scanner scnr = new Scanner(System.in);   // for user input
   /**
    * get info for, create, and display two boat objects.
    * @param args ignore
    */
   public static void main(String[] args) {
      Boat myBoat = getBoatData("#1");    // a Boat to get/set data for
      Boat yourBoat = getBoatData("#2");  // another one
      // print the boat info
      System.out.println(myBoat.toString());
      System.out.println(yourBoat.toString());
   }
   /**
    * prompts user for boat data, creates the Boat object
    * @param label for the boat, used in the prompts to user
    * @return the completed boat object
    */
   private static Boat getBoatData(String label) {
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
}
