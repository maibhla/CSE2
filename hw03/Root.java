// Scott Kaplan
// Root homework 3
// Program to take inputs from a user and compute the cube root of that number

import java.util.Scanner;

// main method

public class Root{
    public static void main(String [] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter a double and i will compute and print its cube root- ");  // prompt the user for a number to take the cube root of
        double cNumberZ= myScanner.nextDouble();
        double cNumberA =  cNumberZ / 3;  // store the first guess
        double cNumber = (2*cNumberA*cNumberA*cNumberA + cNumberZ) / (3*cNumberA*cNumberA);  //calculate a new guess using the old guess 5 total times
        cNumber = (2*cNumber*cNumber*cNumber + cNumberZ) / (3*cNumber*cNumber);
        cNumber = (2*cNumber*cNumber*cNumber + cNumberZ) / (3*cNumber*cNumber);
        cNumber = (2*cNumber*cNumber*cNumber + cNumberZ) / (3*cNumber*cNumber);
        cNumber = (2*cNumber*cNumber*cNumber + cNumberZ) / (3*cNumber*cNumber);
        double verifyCube = cNumber*cNumber*cNumber;  // calculate the cube of the final solution
        System.out.println("the cube root is " +cNumber);  // print the estimated cube root, and the value that you get when you cube this number
        System.out.println(+cNumber+ "*" +cNumber+ "*" +cNumber+ " = " +verifyCube); 
    }
}