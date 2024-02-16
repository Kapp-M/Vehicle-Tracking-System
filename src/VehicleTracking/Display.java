package VehicleTracking;

/**
 * This abstract class represents a display in the vehicle tracking system.
 * It defines an abstract method update that must be implemented by its subclasses.
 */
public abstract class Display {
    /**
     * This abstract method is responsible for updating the display with relevant information.
     * Subclasses must implement this method to define how the display should be updated.
     *
     * @param currentLocation The current location of the vehicle.
     * @param totalDistanceTravelled The total distance travelled by the vehicle.
     * @param inDangerZone A boolean indicating whether the vehicle is in the danger zone.
     */
    public abstract void update(Location currentLocation, double totalDistanceTravelled, boolean inDangerZone);
}
