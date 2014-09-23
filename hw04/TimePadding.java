import java.util.Scanner;

public class TimePadding{
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter the time in seconds: ");
        int nTime = myScanner.nextInt();  // load the user input into a variable
        int nSeconds = (nTime)%60;  // divide by 60 and take the remainder and store it as the number of seconds
        double nIntermediate = nTime/60.00;  // create a variable to take the remainder yet again for the minutes
        int nMinutes = (int) ((nIntermediate)%60);  // divide by 60 and store the remainder as the number of minutes
        int nHours = (int) (nTime / 3600.00);  // divide by 3600 and take the integer value and store it as the number of hours
        if ((nMinutes < 10) && (nSeconds < 10)) {  // if both minutes and seconds are below 10 pad both
             System.out.println("The time is " +nHours+ ":0" +nMinutes+ ":0" +nSeconds+ ".");
        }
        else if ((nMinutes < 10) && (nSeconds >= 10)) {  // if just minutes but not seconds are below 10 just pad minutes
             System.out.println("The time is " +nHours+ ":0" +nMinutes+ ":" +nSeconds+ ".");
        }
        else if ((nMinutes >= 10) && (nSeconds < 10)) {  // if just seconds but not minutes are below 10 just pad seconds
             System.out.println("The time is " +nHours+ ":" +nMinutes+ ":0" +nSeconds+ ".");
        } 
        else {  // else just dont pad at all
            System.out.println("The time is " +nHours+ ":" +nMinutes+ ":" +nSeconds+ ".");
        }
    }
}