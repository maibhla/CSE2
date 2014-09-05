// Scott Kaplan
// Lab 2 Cyclometer
//
// This program will print the number of minutes for 2 trips
// recorded from a cyclometer and print the number of minutes,
// counts, and the total distance in miles for each trip.
// it will also print the total distance for both trips combined

public class Cyclometer {
    public static void main(String [] args) {
        int secsTrip1 = 480;     // Time of trip 1
        int secsTrip2 = 3220;    // Time of trip 2
        int countsTrip1 = 1561;  // Counts for trip 1
        int countsTrip2 = 9037;  // Counts for trip 2
        double wheelDiameter = 27.0, // create multiple variables for constants including wheel diameter
        PI=3.14159,             // Pi
        feetPerMile=5280,       // number of feet in a mile
        inchesPerFoot=12,       // number of inches in a foot
        secondsPerMinute=60;    // number of seconds in a minute
        double distanceTrip1, distanceTrip2,totalDistance; // create the variables for these distances which will be calculated
        // print times and counts for both trips
        System.out.println("Trip 1 took " +(secsTrip1/secondsPerMinute) +" minutes and had " + countsTrip1+" counts.");
        System.out.println("Trip 2 took " +(secsTrip2/secondsPerMinute) +" minutes and had " + countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        distanceTrip1/=inchesPerFoot*feetPerMile;
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("the total distance was "+totalDistance+" miles");
        // Print distances"
    }
}