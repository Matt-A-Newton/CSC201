package ch06lab1;

/**
 * a 2nd class to represent a simple boat
 * 2018-10-18
 * 2020-03-25
 * @author john mafield
 * @author Matt N.
 * @author David C.
 */
public class Boat {
    private String name;                 // name of the boat
    private String type;                 // type of the boat e.g. "canoe","sailboat"
    private double length;               // length of the boat, in feet
    /**
     * sets Strings to empty string, length to 0
     * calls the other constructor
     */
    public Boat() {
        this("", "", 0.0);
    }
    /**
     * create a Boat object with given data
     * @param name of the Boat
     * @param type of the Boat
     * @param length of the Boat
     */
    public Boat(String name, String type, double length) {
        this.setName(name);
        this.setType(type);
        this.setLength(length);
    }
    /**
     * get the name of the boat
     * @return the boat's name
     */
    public String getName() {
        return this.name;
    }
    /**
     * set the name of the boat
     * @param name the boat's name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * get the type of the boat (e.g. "sailboat")
     * @return the type of the boat
     */
    public String getType() {
        return this.type;
    }
    /**
     * set the type of the boat (e.g. "sailboat")
     * @param type the type of the boat
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * get the length of the boat, in feet
     * @return length of the boat
     */
    public double getLength() {
        return this.length;
    }
    /**
     * set the length of the boat, in feet
     * @param length length of the boat
     */
    public void setLength(double length) {
        if (length < 0) {
            length = this.getLength();
        }
        this.length = length;
    }
    /**
     * combine all of the relevant boat info
     * @return a String representation of the boat
     */
    public String toString() {
        return "Boat{" +
                "name='" + this.name + '\'' +
                ", type='" + this.type + '\'' +
                ", length=" + this.length +
                '}';
    }
}