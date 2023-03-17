package ch03lab1;

import java.util.Scanner;

/**
 * description: Uses methods to calculate the area and volume of circles/spheres, squares/cubes.
 * date: 2020-05-02
 * @author Matt Newton
 * @author Alex Hardy
 * @author Maks Vakarchuk
 */
public class Geometry_1 {
   //A static scanner defined as a field variable
   /**
      description: Calculates the area of a square.
      2020-05-02
      @param side, the length of a single side of a square.
      @return the area of a square.
    */
   private static double calcSquareArea(double side)
   {
      return(Math.pow(side,2));
   }
   /**
    description: Calculates the area of a circle.
    2020-05-02
    @param diameter, the diameter of a circle.
    @return The area of a circle.
    */
   private static double calcCircleArea(double diameter)
   {
      double radius; //The radius of a circle/sphere, calculated by diameter / 2.
      radius = diameter / 2;
      return(Math.PI * Math.pow(radius, 2));
   }
   /**
    description: Displays the area of a square/circle.
    2020-05-02
    @param squareArea, Area of a square.
    @param circleArea, Area of a circle.
    @param length, the length/diameter.
    */
   private static void displayAreas(double squareArea, double circleArea, double length)
   {
      System.out.printf(
          "A square with a side of %s has an area of %s",
          length, squareArea
      );
      System.out.println();
      System.out.printf(
          "A circle with a diameter %s has an area of %s",
          length, circleArea
      );
      System.out.println();
   }
   /**
    description: Calculates the volume of a cube.
    2020-05-02
    @param length, the length of a single side of a cube.
    @return The volume of a cube.
    */
   private static double calcCubeVolume(double length)
   {
      return(Math.pow(length,3));
   }
   /**
    description: Calculates the volume of a sphere.
    2020-05-02
    @param diameter, the diameter of a sphere.
    @return The volume of a sphere.
    */
   private static double calcSphereVolume(double diameter)
   {
      final double SPHERE_HEMISPHERE = (4.0/3.0);
      double radius; //The radius of a circle/sphere, calculated by diameter / 2
      radius = diameter / 2;
      return(SPHERE_HEMISPHERE * Math.PI) * Math.pow(radius,3);
   }
   /**
    description: Displays the area of a cube/sphere.
    2020-05-02
    @param cubeVolume, Volume of a cube.
    @param sphereVolume, Volume of a sphere.
    @param length, the length/diameter.
    */
   private static void displayVolumes(double cubeVolume, double sphereVolume, double length)
   {
      System.out.printf(
          "A cube with a side of %s has a volume of %s",
          length, cubeVolume
      );
      System.out.println();
      System.out.printf(
          "A sphere with diameter of %s has a volume of %s",
          length, sphereVolume
      );
      System.out.println();
   }
   public static void main(String [] args)
   {
      Scanner scnr = new Scanner(System.in);
      double userChosenNumber; //A number chosen by the user, gathered by user input.
      System.out.print("Please enter a length: ");
      userChosenNumber = scnr.nextDouble();
      displayAreas(
          calcSquareArea(userChosenNumber), calcCircleArea(userChosenNumber), userChosenNumber
      );
      displayVolumes(
          calcCubeVolume(userChosenNumber),calcSphereVolume(userChosenNumber), userChosenNumber
      );
   }
}
