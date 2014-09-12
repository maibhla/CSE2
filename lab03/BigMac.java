// Scott Kaplan
// Big Mac Lab 3
// Program to display the cost of a big mac

import java.util.Scanner;

// main method

public class BigMac {
    public static void main(String [] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter the number of Big Macs (an integer > 0): ");    // prompt the user for a number of big macs
        int nBigMacs = myScanner.nextInt();  //store the number of big macs as a variable
        System.out.print("Enter the cost of a Big Mac as " + "A double (in the form of xx.xx): ");   // prompts the user for the cost of a big mac
        double bigMac$ = myScanner.nextDouble(); // stores the cost as a variable
        System.out.print("Enter the percent tax as a whole number (xx): ");     // prompts the user for the tax percentage
        double taxRate = myScanner.nextDouble(); // stores the tax percentage
        taxRate/= 100;  //converts the tax percentage to a decimal
        double cost$;  //initialize a variable for total cost
        int dollars, dimes, pennies;  // initialize variables to store the integer value and each digit of the cost
        cost$ = nBigMacs * bigMac$ * (1+taxRate);   //calculate the total cost
        dollars = (int) cost$;  //store the integer value as a dollar cost
        dimes = (int) (cost$*10)%10;    // store the first digit after the decimal point
        pennies = (int) (cost$*100)%10; // store the second digit after the decimal point
        System.out.println("The total cost of " +nBigMacs+ " BigMacs, at $" +bigMac$ + " per BigMac, with a" + " sales tax of " + (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);    //print the toal cost
        
    }
}