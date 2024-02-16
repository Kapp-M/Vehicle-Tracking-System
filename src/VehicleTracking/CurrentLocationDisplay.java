package VehicleTracking;

/**
 * This class represents a display for showing the current location of the vehicle.
 * It extends the abstract class Display and overrides the update method.
 */
public class CurrentLocationDisplay extends Display {
    /**
     * This method updates the display with the current location of the vehicle.
     * It prints the current location coordinates to the console.
     *
     * @param currentLocation The current location of the vehicle.
     * @param totalDistanceTravelled The total distance travelled by the vehicle (not used in this display).
     * @param inDangerZone A boolean indicating whether the vehicle is in the danger zone (not used in this display).
     */
    @Override
    public void update(Location currentLocation, double totalDistanceTravelled, boolean inDangerZone) {
        System.out.println("Current Location: (" + currentLocation.getX() + ", " + currentLocation.getY() + ")");
    }
}
