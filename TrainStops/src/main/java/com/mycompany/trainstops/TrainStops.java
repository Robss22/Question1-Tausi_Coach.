/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trainstops;

/**
 *
 * @author ABBY
 */
public class TrainStops {

    public static void main(String[] args) {
        // Total distance travelled
        int totalDistance = 10000;

        // This is the distance intervals for passenger stops and refueling stops
        int passengerStopInterval = 150;
        int refuelStopInterval = 200;

        // Calculate the number of passenger stops and refueling stops
        int passengerStops = totalDistance / passengerStopInterval;
        int refuelStops = totalDistance / refuelStopInterval;

        // Total stops (passenger stops + refueling stops)
        int totalStops = passengerStops + refuelStops;

        // The Output will be
        System.out.println("The train will stop " + passengerStops + " times for passengers.");
        System.out.println("The train will stop " + refuelStops + " times for refueling.");
        System.out.println("The total number of stops during the journey is " + totalStops + ".");
    }
}
