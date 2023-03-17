package lecture;

public class Restaurant {
   String name;
   double rating;
   // Default constructor
   public Restaurant() {
      this.name = "NoName";
      this.rating = -1;
   }

   // Another constructor
   public Restaurant(String initName, int initRating) {
      this.name = initName;
      this.rating = initRating;
   }

   @Override
   public String toString() {
      return "Restaurant{" +
          "name='" + name + '\'' +
          ", rating=" + rating +
          '}';
   }
}
