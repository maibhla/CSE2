// Scott Kaplan
// Bicycle homework 3
// Program to take inputs from a user and compute distance travelled and speed

import java.util.Scanner;

// main method

public class Bicycle{
    public static void main(String [] args) {
        double PI =3.14159;
        Scanner myScanner;
        myScanner = new Scanner ( System.in );  // initialize the scanner
        System.out.print("Enter the number of Seconds: ");  //prompt the user for the time the trip took and store that number
        int nSeconds = myScanner.nextInt();
        System.out.print("Enter the number of Counts: ");  //prompt the user for the number of counts and store that number
        int nCounts = myScanner.nextInt();
        int wheelDiameter = 27;  //initialize a variable and set it equal to the diameter of the wheel in inches
        double dTravelled = nCounts * wheelDiameter*PI / 5280 / 12;  // calculate the distance travelled while converting from inches to miles
        double minutesTaken = nSeconds / 60;  //calculate the time taken in minutes
        double speedMPH = dTravelled / (nSeconds / 3600.00);  // calculate the speed in mph
        int dInteger = (int) dTravelled;  //store the nice 2 decimal point numbers
        int dFirstDec = (int) (dTravelled*10)%10;
        int dSecondDec = (int) (dTravelled*100)%10;
        int speedInteger = (int) speedMPH;
        int speedFirstDec = (int) (speedMPH*10)%10;
        int speedSecondDec = (int) (speedMPH*100)%10;
        System.out.println("the Distance Travelled was: " +dInteger+ "." +dFirstDec+dSecondDec+ " miles and took " +minutesTaken+ " minutes");  //print the distance travelled and time taken
        System.out.println("The Average Speed in Miles Per Hour was: " +speedInteger+ "." +speedFirstDec+speedSecondDec);  // print the speed
    }
}
        