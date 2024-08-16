// TravelTime.java
package com.mycompany.trainstops;

public class TravelTime {
    public static void main(String[] args) {
        int totalDistance = 10000; // in km
        int speed = 250; // in km/hr
        int stops = 0;

        // Calculate stops for passengers
        for (int i = 0; i < totalDistance; i += 150) {
            stops++;
        }

        // Calculate stops for refueling
        for (int i = 0; i < totalDistance; i += 200) {
            stops++;
        }

        double travelTime = (double) totalDistance / speed;
        double stopTime = stops * 5 / 60.0; // convert minutes to hours
        double totalTime = travelTime + stopTime;

        System.out.println("The total time taken to travel from Kampala to Kabale is " + totalTime + " hours.");
    }
}
