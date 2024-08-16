/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trainstops;

/**
 *
 * @author ABBY
 */
public class SecondCoachArrival {
    public static void main(String[] args) {
        int totalDistance = 10000; // in km
        double speed = 225.5; // in m/s
        speed = speed * 3.6; // we have to convert  from  m/s to km/hr
        double travelTime = (double) totalDistance / speed;
        double arrivalTime = 9 + travelTime;
        
        
        //this will be the output
       System.out.println("The approximate arrival time in hours for the second coach to Kampala is " + arrivalTime + " hours.");
    }
}