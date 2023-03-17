package lecture;

import java.util.Scanner;

public class CircleMain {
   private static Scanner scnr = new Scanner(System.in);
   public static void main(String[] args) {
      Circle circle = new Circle(); //A new circle object
      double radius;

      System.out.print("Please enter the radius of a circle: ");
      radius = scnr.nextDouble();
      circle.setRadius(radius);
      System.out.println(circle.getRadius());
      System.out.println(circle.getArea());
      System.out.println(circle.getCircumference());

      System.out.println(circle);
   }
}
