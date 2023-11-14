/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class ParkingLot {

    int small;
    int medium;
    int large;

    int smallCounter;
    int mendiumCounter;
    int largeCounter;

    int totalSpots;
    int totalSpotsCounter;

    // Constructor
    ParkingLot() {

        small = 30;
        medium = 40;
        large = 30;

        smallCounter = 0;
        mendiumCounter = 0;
        largeCounter = 0;
        totalSpotsCounter = 0;

        totalSpots = small + medium + large;
    }

    public void addVehicleToParking(String vehicleType) {

        if (totalSpotsCounter <= totalSpots) {

            switch (vehicleType) {

                // Case 1
                case "MotorCycle":
                    if (smallCounter <= small) {
                        smallCounter++;
                        totalSpotsCounter++;
                        totalSpots--;
                    } else if (mendiumCounter <= medium) {
                        mendiumCounter++;
                        totalSpotsCounter++;
                        totalSpots--;
                    } else if (largeCounter <= large) {
                        largeCounter++;
                        totalSpotsCounter++;
                        totalSpots--;
                    }
                    break;

                // Case 2
                case "Car":
                    if (mendiumCounter <= medium) {
                        mendiumCounter++;
                        totalSpotsCounter++;
                        totalSpots--;
                    }
                    break;

                // Case 3
                case "Van":
                    if (largeCounter <= large) {
                        largeCounter++;
                        totalSpotsCounter++;
                        totalSpots--;
                    }
                    break;

                // Case 4
                // Default case
                default:
                    System.out.println("no match");
            }
        }
    }

}

class Solution {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        strings.add("This pad is running Java " + Runtime.version().feature());

        for (String string : strings) {
            System.out.println(string);
        }

    }

    /*
     * Design a parking lot using object-oriented principles.
     * 
     * Goals:
     * Your solution should be in Python or Node.js - if you would like to use
     * another language, please let the interviewer know.
     * The solution should be an object oriented solution.
     ** Objective is to display your best code design, this doesn’t need to be 100%
     * functional. **
     * 
     * Assumptions:
     * The parking lot can hold motorcycles, cars and vans
     * The parking lot has small spots, medium spots and large spots.
     * A motorcycle can park in any spot.
     * A car can park in a medium spot, or a large spot.
     * A van can park only in a large spot.
     * 
     * Functionality needed:
     * Ability to add vehicles by type. Once added it should deduct accordingly from
     * total slots.
     * Ability to tell us how many spots are remaining by vehicle type or by all
     * types.
     * Ability to tell us if the lot is full.
     */

}
