// Scott Kaplan
// Homework 04
// program to take a input from the user and calculate the percent income tax and the total income tax on that total
import java.util.Scanner;

public class IncomeTax{
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        double taxRate;
        double taxCost;
        int nIncome;
        myScanner = new Scanner ( System.in ); 
        System.out.print("Enter an int giving the number of thousands- "); // prompt the user for an income in thousands
        if (myScanner.hasNextInt()){
            nIncome = myScanner.nextInt(); // store the income
            if ((nIncome < 20) && (nIncome >= 0)){ // if the income is positive but less than 20000 calculate with a 5% tax rate and print the output
                taxRate = 5.0;
                taxCost = 1000 *nIncome * (taxRate/100.0);
            }
            else if ((nIncome >= 20) && (nIncome < 40)){  // if the income is greater than or equal to 20000 but less than 40000 calculate with a 7% tax rate and print the output
                taxRate = 7.0;
                taxCost = 1000 *nIncome * (taxRate/100.0);
            }
            else if ((nIncome >= 40) && (nIncome < 78)){  // if the income is greater than or equal to 40000 but less than 78000 calculate with a 12% tax rate and print the output 
                taxRate = 12.0;
                taxCost = 1000 *nIncome * (taxRate/100.0);
            }
            else if (nIncome >= 78){ //  if the income is greater than or equal to 78000 calculate with a 14% tax rate and print the output
                taxRate = 14.0;
                taxCost = 1000 *nIncome * (taxRate/100.0);
            }
            else{
                System.out.println("you did not enter a positive int");
                return;
            }
            System.out.println("the tax rate on $" +nIncome+ " is " +taxRate+ "%, and the tax is $"+taxCost);
        }
        else {
            System.out.println("you did not enter an int");
        }
        
    }
}