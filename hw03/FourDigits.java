// Scott Kaplan
// FourDigits homework 3
// Program to take inputs from a user and compute and display the four digits to the right of the decimal point

import java.util.Scanner;

// main method

public class FourDigits{
    public static void main(String [] args) {
         Scanner myScanner;
         myScanner = new Scanner ( System.in );
         int firstDec, secondDec, thirdDec, fourthDec;  //initialize variables to store each of the four digits in
         System.out.print("Enter a double and I display the four digits after the decimal point-");  // prompt the user for a double
         double number = myScanner.nextDouble();
         int numberConvert = (int) (number * 10000);  // convert the double to an integer 10000 times the value so that we can pull integers for each digit from the new number
         firstDec = (numberConvert/1000)%10;  //store the integer values of each digit
         secondDec = (numberConvert/100)%10;
         thirdDec = (numberConvert/10)%10;
         fourthDec = (numberConvert)%10;
         System.out.println("The four digits are " +firstDec+secondDec+thirdDec+fourthDec);  // print the digits in the correct order
    }
}