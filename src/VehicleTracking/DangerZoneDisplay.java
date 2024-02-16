package VehicleTracking;

/**
 * This class represents a display for showing the danger zone status of the vehicle.
 * It extends the abstract class Display and overrides the update method.
 */
public class DangerZoneDisplay extends Display {
    /**
     * This method updates the display with the danger zone status of the vehicle.
     * If the vehicle is in the danger zone, it prints a danger zone alarm message.
     * If the vehicle is not in the danger zone, it prints a message indicating no danger zone alarm.
     *
     * @param currentLocation The current location of the vehicle (not used in this display).
     * @param totalDistanceTravelled The total distance travelled by the vehicle (not used in this display).
     * @param inDangerZone A boolean indicating whether the vehicle is in the danger zone.
     */
    @Override
    public void update(Location currentLocation, double totalDistanceTravelled, boolean inDangerZone) {
        if (inDangerZone) {
            System.out.println("Danger Zone Alarm: Vehicle is in danger zone!");
        } else {
            System.out.println("No Danger Zone Alarm");
        }
    }
}
