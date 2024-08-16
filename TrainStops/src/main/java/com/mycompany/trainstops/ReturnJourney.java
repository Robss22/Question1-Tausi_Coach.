/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trainstops;

/**
 *
 * @author ABBY
 */
    
public class ReturnJourney {
    public static void main(String[] args) {
        int totalDistance = 10000; // in km
        int speed = 250; // in km/hr
        int stops = 0;

        for (int i = 0; i < totalDistance; i += 200) {
            stops++;
        }

        double travelTime = (double) totalDistance / speed;
        double stopTime = stops * 5 / 60; // convert minutes to hours
        double totalTime = travelTime + stopTime;

        System.out.println("The total time taken to travel from Kabale to Kampala is " + totalTime + " hours.");
    }
}