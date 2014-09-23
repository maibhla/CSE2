// Scott Kaplan
// Homework 04
// program to take a input from the user and calculate the numver of days in the given month
import java.util.Scanner;

public class Month{
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        int nMonth; // initialize variables
        int nRemainder;
        int nOther;
        int nLast;
        int nYear;
        System.out.print("Enter an int giving the number of the month (1-12)- ");
        if (myScanner.hasNextInt()){  // check if the scanner is reading an integer
            nMonth = myScanner.nextInt();  // store the integer as nMonth
            if ((nMonth == 1) || (nMonth == 3) || (nMonth == 5)  || (nMonth == 7)  || (nMonth == 8)  || (nMonth == 10)  || (nMonth == 12)){  // check if the month is january, march, may, july, august, october, or december
                System.out.println("the month has 31 days");  // print the number of days in these months
            }
            else if ((nMonth == 9) || (nMonth == 4) || (nMonth == 6)  || (nMonth == 11)) {  // check if the month is april, june, september, or november
                System.out.println("the month has 30 days"); // print the number of days in these months
            }
            else if (nMonth == 2){  // check if the month is february
                System.out.print("Enter an int giving the year ");  // prompt the user for the year
                nYear = myScanner.nextInt();  // store the year as nyear
                nRemainder = (nYear)%4;  // divide by 4 and store the remainder
                nOther = (nYear)%100;  // divide by 100 and store the remainder
                nLast = (nYear)%400;   // divide by 400 and store the remainder
                if (nRemainder == 0) {  // check if the year is divisible by 4
                    if ((nOther == 0) && (nLast == 0)) {  // check if the year is also divisible by 100 and 400
                        System.out.println ("the month has 29 days");  // print 29 days as the number in the month
                    }
                    else if (nOther != 0) {  // check if the number is not divisible by 100
                        System.out.println ("the month has 29 days");  // print 29 days as the number in the month
                    }
                    else {  // if the number is divisible by 100 but not divisible by 400 print 28 days as the number in the month
                        System.out.println ("the month has 28 days");
                    }
                }
                else {
                    System.out.println ("the month has 28 days");  // if the year is not divisible by 4 print 28 days
                }
            }
            else {
                System.out.println("You did not enter an int between 1 and 12");  // if the entered month was not between 1 and 12 print this message
            }
        }
        else{
            System.out.println("You did not enter an int between 1 and 12");  // if the entered value was not an integer print the same message
        }
    }
}