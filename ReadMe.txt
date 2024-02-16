Vehicle Tracking System
=======================


Overview:
---------
This project implements a vehicle tracking system in Java. It tracks the location of a vehicle using GPS coordinates and provides information such as the current location, total distance travelled, and danger zone status.

Components:
-----------
1. Main.java: Contains the main method to run the vehicle tracking program.
2. GPS.java: Manages the GPS system and vehicle displays.
3. Vehicle.java: Represents a vehicle in the tracking system.
4. Display.java: Abstract class representing a display in the vehicle tracking system.
5. CurrentLocationDisplay.java: Display for showing the current location of the vehicle.
6. TotalDistanceTravelledDisplay.java: Display for showing the total distance travelled by the vehicle.
7. DangerZoneDisplay.java: Display for showing the danger zone status of the vehicle.
8. Location.java: Represents a location in a two-dimensional Cartesian coordinate system.

Usage:
------
1. Compile all Java files in the VehicleTracking package.
2. Compile Main.java in the main package.
3. Run Main.java to start the vehicle tracking program.
4. Follow the prompts to input danger zone coordinates and radius.
5. The program will simulate predefined location changes and continuously prompt for new location coordinates until 'q' is entered.
