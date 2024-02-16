package VehicleTracking;

/**
 * This class represents a vehicle in the tracking system.
 */
public class Vehicle {
    private Location currentLocation; // The current location of the vehicle
    private double totalDistanceTravelled; // The total distance travelled by the vehicle
    private Location dangerZoneCenter; // The center of the danger zone
    private double dangerZoneRadius; // The radius of the danger zone

    /**
     * Constructor to create a new vehicle with the specified initial location and danger zone parameters.
     * @author Kalp-Girish-Rudra-Jiya
     * @param initialLocation The initial location of the vehicle.
     * @param dangerZoneCenter The center of the danger zone.
     * @param dangerZoneRadius The radius of the danger zone.
     */
    public Vehicle(Location initialLocation, Location dangerZoneCenter, double dangerZoneRadius) {
        this.currentLocation = initialLocation;
        this.totalDistanceTravelled = 0.0;
        this.dangerZoneCenter = dangerZoneCenter;
        this.dangerZoneRadius = dangerZoneRadius;
    }

    /**
     * Method to change the location of the vehicle and update the total distance travelled.
     * @param newLocation The new location of the vehicle.
     */
    public void changeLocation(Location newLocation) {
        double distance = calculateDistance(currentLocation, newLocation);
        totalDistanceTravelled += distance;
        currentLocation = newLocation;
    }

    /**
     * Method to get the current location of the vehicle.
     *
     * @return The current location of the vehicle.
     */
    public Location getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Method to get the total distance travelled by the vehicle.
     *
     * @return The total distance travelled by the vehicle.
     */
    public double getTotalDistanceTravelled() {
        return totalDistanceTravelled;
    }

    /**
     * Method to check if the vehicle is in the danger zone.
     *
     * @return true if the vehicle is in the danger zone, false otherwise.
     */
    public boolean isInDangerZone() {
        return calculateDistance(currentLocation, dangerZoneCenter) <= dangerZoneRadius;
    }

    /**
     * Private method to calculate the distance between two locations using the Euclidean distance formula.
     *@author Kalp-Rudra-Girish-Jiya
     * @param loc1 The first location.
     * @param loc2 The second location.
     * @return The distance between the two locations.
     */
    private double calculateDistance(Location loc1, Location loc2) {
        double dx = loc2.getX() - loc1.getX();
        double dy = loc2.getY() - loc1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
