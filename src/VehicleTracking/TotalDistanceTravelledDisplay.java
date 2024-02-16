package VehicleTracking;

/**
 * This class represents a display for showing the total distance travelled by the vehicle.
 * It extends the abstract class Display and overrides the update method.
 */
public class TotalDistanceTravelledDisplay extends Display {
    /**
     * This method updates the display with the total distance travelled by the vehicle.
     * It prints the total distance travelled to the console.
     *
     * @param currentLocation The current location of the vehicle (not used in this display).
     * @param totalDistanceTravelled The total distance travelled by the vehicle.
     * @param inDangerZone A boolean indicating whether the vehicle is in the danger zone (not used in this display).
     */
    @Override
    public void update(Location currentLocation, double totalDistanceTravelled, boolean inDangerZone) {
        System.out.println("Total Distance Travelled: " + totalDistanceTravelled);
    }
}
