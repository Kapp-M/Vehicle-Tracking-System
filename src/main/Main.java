package main;

import java.util.Scanner;

import VehicleTracking.*;

/**
 * This class contains the main method to run the vehicle tracking program.
 */
public class Main {
    /**
     * The main method initializes the vehicle and GPS system with predefined initial parameters,
     * simulates location changes based on these parameters,
     * and then accepts user input for new location coordinates to further simulate the vehicle's movement.
     * After each input, it updates the vehicle's location and displays its status.
     * The program continues until the user enters 'q' to quit.
     * @author Kalp-Rudra-Girish-Jiya
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Initialize danger zone center and radius
        Location dangerZoneCenter = new Location(6, 6);
        double dangerZoneRadius = 3;

        // Initialize vehicle and GPS with danger zone parameters
        Vehicle vehicle = new Vehicle(new Location(0, 0), dangerZoneCenter, dangerZoneRadius);
        GPS gps = new GPS(vehicle);

        // Add displays to GPS
        gps.addDisplay(new CurrentLocationDisplay());
        gps.addDisplay(new TotalDistanceTravelledDisplay());
        gps.addDisplay(new DangerZoneDisplay());

        // Simulate predefined location changes
        vehicle.changeLocation(new Location(2, 2));
        gps.updateDisplays();

        vehicle.changeLocation(new Location(2, 4));
        gps.updateDisplays();
        
        vehicle.changeLocation(new Location(4, 6));
        gps.updateDisplays();
        
        vehicle.changeLocation(new Location(6, 8));
        gps.updateDisplays();
        
        vehicle.changeLocation(new Location(8, 10));
        gps.updateDisplays();
        
        // Initialize scanner to accept user input
        Scanner scanner = new Scanner(System.in);
        
        // Simulate location changes based on user input
        while (true) {
            System.out.println("Enter new location coordinates (x y), or 'q' to quit:");
            if (!scanner.hasNextDouble()) {
                break;
            }
            double newX = scanner.nextDouble();
            double newY = scanner.nextDouble();
            Location newLocation = new Location(newX, newY);
            vehicle.changeLocation(newLocation);
            gps.updateDisplays();
        }

        // Close scanner after use
        scanner.close();
    }
}
