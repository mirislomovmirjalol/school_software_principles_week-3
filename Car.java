package week03;

/**
 * This class is used add and show car details.
 * Taken from https://www.w3schools.blog/object-and-class-in-java
 *
 * @author W3spoint
 */
public class Car {
    private String carColor;
    private int carSpeed;
    private String carName;

    /**
     * Constructor this is called when we create a new instance of the Car class
     * @param pName
     */
    public Car(String pName)
    {
        carName = pName;
    }

    /**
     * This method is used to add car details.
     *
     * @param color
     * @param speed
     * @author W3spoint
     */
    void addCarDetails(String color, int speed) {
        carColor = color;
        carSpeed = speed;
    }

    /**
     * This method is used to show details.
     * Note modified from W3Schools to return a String
     *
     * @author W3spoint
     */
    String showCarDetails() {
        return "Name: " + carName + "\tColor: " + carColor + "\tSpeed: " + carSpeed;
    }
    String getCarName() {
        return carName;
    }
}

