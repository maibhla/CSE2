import java.util.Scanner;

// main method
 public class BoolaBoola{
     public static void main(String [] args) {
         Scanner myScanner;  // declare variables and a scanner
         myScanner = new Scanner (System.in);
         int randomNumber1;  // declare variables for random numbers, a boolean for 3 of those numbers, and a boolean to store the comparison
         int randomNumber2;
         int randomNumber3;
         int randomNumber4;
         int randomNumber5;
         boolean b1;
         boolean b3;
         boolean b5;
         boolean comparison;
         String trfls;  // declare a string to be compared to the boolean value of the comparison
         randomNumber1 = (int) (Math.random() * 2);
         randomNumber2 = (int) (Math.random() * 2);
         randomNumber3 = (int) (Math.random() * 2);
         randomNumber4 = (int) (Math.random() * 2);
         randomNumber5 = (int) (Math.random() * 2);
         if (randomNumber1 == 1){  // if the first random number is 1 assign the first boolean to be true and print the first part of the statement
             b1 = true;
             System.out.print ("Does true ");
         }
         else{  // if the first random number is not 1 assign the first boolean to be false and print the appropriate statement
             b1 = false;
             System.out.print ("Does false ");
         }
         if (randomNumber2 == 1){  // if the second random number is 1 print the comparison || to be calculated later
             System.out.print ("|| ");
         }
         else{  //otherwise print the comparison && to be calculated later
            System.out.print  ("&& ");
         }
         // see above description for random number 1
         if (randomNumber3 == 1){
             b3 = true;
             System.out.print ("true ");
         }
         else{
             b3 = false;
             System.out.print ("false ");
         }
         if (randomNumber4 == 1){// see the above description for random number 2
             System.out.print ("|| ");
         }
         else{
             System.out.print  ("&& ");
         }
         // now print the appropriate boolean string and the remainder of the statement
         if (randomNumber5 == 1){
             b5 = true;
             System.out.print("true have the value true(t/T) or false(f/F)? ");
         }
         else{
             b5 = false;
             System.out.print("false have the value true(t/T) or false(f/F)? ");
         }
         // now that all booleans variables have been determined do the appriopriate comparisons
         if (randomNumber2 == 1){
             comparison = b1 || b3;
         }
         else{
             comparison = b1 && b3;
         }
         if (randomNumber4 == 1){
             comparison = comparison || b5;
         }
         else{
             comparison = comparison && b5;
         }
         trfls = myScanner.next();  // read the input from the scanner into a string
         if (comparison){  // check if the comparison value is true
            if (trfls.equals("f") || trfls.equals("F")) {  // check if the string entered corresponds to false print that the user is incorrect
                System.out.println("Wrong; try again");
            }
            else if (trfls.equals("t") || trfls.equals("T")) {  // if the string entered corresponds to true print that the user is correct
                System.out.println("Correct");
            }
            else {  // otherwise tell the user what they entered is not valid
                System.out.println("you did not enter a correct string");
            }
         }
         else {  // do the same as above instead with the comparison value being false
            if (trfls.equals("f") || trfls.equals("F")) {
                System.out.println("Correct");
                
            }
            else if (trfls.equals("t") || trfls.equals("T")) {
                System.out.println("Wrong; try again");
            }
            else {
                System.out.println("you did not enter a correct string");
            }
         }
     }
 }
         