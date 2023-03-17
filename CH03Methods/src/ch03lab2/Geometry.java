package ch03lab2;

import java.util.Scanner;

/**
 * description: Uses methods to calculate the area and volume of circles/spheres, squares/cubes.
 * date: 2020-12-02
 * @author Matt Newton
 * @author Alex Hardy
 * @author Maks Vakarchuk
 */
public class Geometry {
   private static Scanner scnr = new Scanner(System.in);
   /**
    @param description, a string.
    @return a double.
    */
   public static double getMeasurement(String description)
   {
      System.out.print("Please enter a " + description + ": ");
      return scnr.nextDouble();
   }
   /**
    @param diameter, a double.
    @return the area of a circle found by PI * r^2.
    */
   public static double calcArea(double diameter)
   {
      return (Math.PI * Math.pow((diameter / 2), 2));
   }
   /**
    @param length, a double.
    @param width, a double
    @return the area of a square found by multiplying L * W
    */
   public static double calcArea(double length, double width)
   {
      return (length * width);
   }
   /**
    @param diameter, a double
    @return the volume of a sphere found by PI * r^3.
    */
   public static double calcVolume(double diameter)
   {
      return ((4.0/3.0) * Math.PI * Math.pow((diameter / 2), 3));
   }
   /**
    @param length, a double.
    @param width, a double
    @param height, a double
    @return the volume of a cube found by multiplying L * W * H
    */
   public static double calcVolume(double length, double width, double height)
   {
      return (calcArea(length, width) * height);
   }
   /**
    @param diameter, a double
    */
   public static void displayInfo(double diameter)
   {
      System.out.println(
          "A circle with a diameter " + diameter + " an area of " + calcArea(diameter)
      );
      System.out.println(
          "A sphere with a diameter " + diameter + " has a volume of " + calcVolume(diameter)
      );
   }
   /**
    @param length, a double.
    @param width, a double
    @param height, a double
    */
   public static void displayInfo(double length, double width, double height)
   {
      System.out.println(
          "A " + length + " x " + width + " x " + height +
              " box has a volume of " + calcVolume(length, width, height)
      );
   }
   public static void main(String [] args)
   {
      double userLength; // a length, found from user input
      double userWidth; // a width, found from user input
      double userHeight; // a height, found from user input
      double userDiameter; // a diameter, found from user input
      userLength = getMeasurement("length");
      userWidth = getMeasurement("width");
      userHeight = getMeasurement("height");
      userDiameter = getMeasurement("diameter");
      displayInfo(
          userLength,
          userWidth,
          userHeight
      );
      displayInfo(
          userDiameter
      );
   }
}
