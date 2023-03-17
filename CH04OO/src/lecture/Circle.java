package lecture;

public class Circle
{
   private double radius; // radius of a circle

   public double getRadius()
   {
      return radius;
   }

   public void setRadius(double newRadius)
   {
      radius = newRadius; //this.radius = newRadius; also works.
   }

   public double getArea()
   {
      return (Math.PI * Math.pow(radius, 2));
   }

   public double getCircumference()
   {
      return (2 * (Math.PI * radius));
   }

   public String toString() {
      return ("Circle with radius " + radius);
   }
}
