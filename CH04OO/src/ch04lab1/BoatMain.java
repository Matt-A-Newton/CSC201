package ch04lab1;

import java.util.Scanner;
/**
 * description: gathers user input and stores it as object attributes
 * date: 2020-19-02
 * @author Matt Newton
 * @author Alex Hardy
 * @author Maks Vakarchuk
 */
public class BoatMain {
   private static Scanner scnr = new Scanner(System.in); // Used to gather user input
   /**
    * description: requests user input, calls methods from another class, and outputs information.
    * @param args ignored
    */
   public static void main(String[] args){
      Boat boatA = new Boat(); //First boat
      Boat boatB = new Boat(); //Second boat

      System.out.print("Please enter the name of boat #1: ");
      boatA.setName(scnr.nextLine());
      System.out.print("Please enter the type of boat #1: ");
      boatA.setType(scnr.nextLine());
      System.out.print("Please enter the length of boat #1: ");
      boatA.setLength(scnr.nextDouble());

      scnr.nextLine();

      System.out.print("Please enter the name of boat #2: ");
      boatB.setName(scnr.nextLine());
      System.out.print("Please enter the type of boat #2: ");
      boatB.setType(scnr.nextLine());
      System.out.print("Please enter the length of boat #2: ");
      boatB.setLength(scnr.nextDouble());

      System.out.println(boatA.toString());
      System.out.println(boatB.toString());
   }
}
