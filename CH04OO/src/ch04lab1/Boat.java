package ch04lab1;

/**
 * description: Stores information about a boat that can be returned
 * date: 2020-19-02
 * @author Matt Newton
 * @author Alex Hardy
 * @author Maks Vakarchuk
 */
public class Boat {
   private String name;   // the name of a boat
   private String type;   // the type of boat
   private double length; // the length of a boat

   /**
    * description: returns the name of a boat
    * @return the name of a boat as a string
    */
   public String getName() {
      return name;
   }

   /**
    * description: sets the name of a boat
    * @param boatName the name of the boat
    */
   public void setName(String boatName) {
      name = boatName;
   }

   /**
    * description: returns the type of a boat
    * @return the type of a boat as a string
    */
   public String getType() {
      return type;
   }
   /**
    * description: sets the type of a boat
    * @param boatType the type of the boat
    */
   public void setType(String boatType) {
      type = boatType;
   }
   /**
    * description: returns the length of a boat
    * @return the length of a boat as a double
    */
   public double getLength() {
      return length;
   }
   /**
    * description: sets the length of a boat
    * @param boatLength the length of the boat
    */
   public void setLength(double boatLength) {
      length = boatLength;
   }
   /**
    * description: returns a boat's information (name, type, and length)
    * @return the boat's information as a string
    */
   public String toString() {
      return (
          "Boat{name = '" + name +
          "', type = '" + type +
          "', length = '" + length + "'}"
      );
   }
}
