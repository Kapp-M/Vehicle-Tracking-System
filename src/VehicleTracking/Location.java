package VehicleTracking;

/**
 * This class represents a location in a two-dimensional Cartesian coordinate system.
 */
public class Location {
    private double x; // The x-coordinate of the location
    private double y; // The y-coordinate of the location

    /**
     * Constructor to create a new location with the specified coordinates.
     *
     * @param x The x-coordinate of the location.
     * @param y The y-coordinate of the location.
     */
    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method to get the x-coordinate of the location.
     *
     * @return The x-coordinate of the location.
     */
    public double getX() {
        return x;
    }

    /**
     * Method to get the y-coordinate of the location.
     *
     * @return The y-coordinate of the location.
     */
    public double getY() {
        return y;
    }
}
