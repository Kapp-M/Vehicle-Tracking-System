package VehicleTracking;

import java.util.ArrayList;

/**
 * This class represents a GPS system that manages vehicle displays.
 */
public class GPS {
    private Vehicle vehicle; // The vehicle being tracked by the GPS
    private ArrayList<Display> displays; // List of displays managed by the GPS

    /**
     * Constructor to initialize the GPS with the vehicle it tracks.
     * @author Kalp-Rudra-Girish-Jiya
     * @param vehicle The vehicle to be tracked by the GPS.
     */
    public GPS(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.displays = new ArrayList<>();
    }

    /**
     * Method to add a display to the GPS system.
     *
     * @param display The display to be added.
     */
    public void addDisplay(Display display) {
        displays.add(display);
    }

    /**
     * Method to update all displays with the current vehicle information.
     * It retrieves the current location, total distance travelled, and danger zone status of the vehicle,
     * then updates each display accordingly.
     */
    public void updateDisplays() {
        // Get current vehicle information
        Location currentLocation = vehicle.getCurrentLocation();
        double totalDistanceTravelled = vehicle.getTotalDistanceTravelled();
        boolean inDangerZone = vehicle.isInDangerZone();

        // Update each display with the current information
        for (Display display : displays) {
            display.update(currentLocation, totalDistanceTravelled, inDangerZone);
        }
    }
}
