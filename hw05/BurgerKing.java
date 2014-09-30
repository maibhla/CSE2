// Scott Kaplan
// homework 05
// Burger King homework
// program to ask the user what they want from burger king and output details on what they want
import java.util.Scanner;

// main method
 public class BurgerKing{
     public static void main(String [] args) {
         Scanner myScanner;  // initialize scanner
         myScanner = new Scanner (System.in);
         String bDetails;
         String sDetails;
         String fDetails;
         System.out.println("Enter a letter to indicate a choice of");
         System.out.println("   Burger (B or b)");
         System.out.println("   Soda (S or S)");
         System.out.print("   Fries (F or f) ");
         String order = myScanner.next();  // set the variable order to the string in the scanner
         switch (order){
             case "B":  // if the user enters B prompt them for what they want on their burger
                 System.out.println ("Enter A or a for \"all the fixins\"");
                 System.out.println (" C or c for cheese");
                 System.out.print  ("N or n for none of the above ");
                 bDetails = myScanner.next();
                 switch (bDetails) {
                    // if the user wants everything print that they want all the fixins
                    case "A": 
                         System.out.println ("You ordered a burger with all the fixins");
                    break;
                    case "a":
                        System.out.println ("You ordered a burger with all the fixins");
                    break;
                    // if the user wants cheese print that
                    case "C":
                        System.out.println ("You ordered a burger with cheese");
                    break;
                    case "c":    
                        System.out.println ("You ordered a burger with cheese");
                    break;
                    //if the use wants nothing print that
                    case "N":
                        System.out.println ("You ordered a burger with nothing on it");
                    break;
                    case"n":
                        System.out.println ("You ordered a burger with nothing on it");
                    break;
                    default:
                        System.out.println ("you did not enter any of A, a, C, c, N, n");
                    break;
                 }
            break;
            // do the same as above for a lower case b
             case "b":  // if the user enters b prompt them for what they want on their burger
                 System.out.println ("Enter A or a for \"all the fixins\"");
                 System.out.println (" C or c for cheese");
                 System.out.print  ("N or n for none of the above ");
                 bDetails = myScanner.next();
                 switch (bDetails) {
                    // if the user wants everything print that they want all the fixins
                    case "A": 
                         System.out.println ("You ordered a burger with all the fixins");
                    break;
                    case "a":
                        System.out.println ("You ordered a burger with all the fixins");
                    break;
                    // if the user wants cheese print that
                    case "C":
                        System.out.println ("You ordered a burger with cheese");
                    break;
                    case "c":    
                        System.out.println ("You ordered a burger with cheese");
                    break;
                    //if the use wants nothing print that
                    case "N":
                        System.out.println ("You ordered a burger with nothing on it");
                    break;
                    case"n":
                        System.out.println ("You ordered a burger with nothing on it");
                    break;
                    // if the user entered an incorrect string print an error message
                    default:
                        System.out.println ("you did not enter any of A, a, C, c, N, n");
                    break;
                 }
            break;
            case "S":  // if the use enters S prompt them for what soda they want
                 System.out.println ("Do you want Pepsi (p or P)");
                 System.out.print ("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
                 sDetails = myScanner.next();
                 switch (sDetails) {
                    // if the user wants Pepsi print that
                    case "P": 
                         System.out.println ("You ordered a Pepsi");
                    break;
                    case "p":
                        System.out.println ("You ordered a Pepsi");
                    break;
                    // if the user wants coke print that
                    case "C":
                        System.out.println ("You ordered a Coke");
                    break;
                    case "c":    
                        System.out.println ("You ordered a Coke");
                    break;
                    //if the user wants sprite print that
                    case "S":
                        System.out.println ("You ordered a Sprite");
                    break;
                    case"s":
                        System.out.println ("You ordered a Sprite");
                    break;
                    // if the user wants Mountain dew print that
                    case "M":
                        System.out.println ("You ordered a Mountain Dew");
                    break;
                    case"m":
                        System.out.println ("You ordered a Mountain Dew");
                    break;
                    // if the user entered an incorrect string print that
                    default:
                        System.out.println ("you did not enter any of P, p, C, c, S, s, M. m");
                    break;
                 }
            break;
             case "s":  // if the use enters s prompt them for the same as above and execute the same process
                 System.out.println ("Do you want Pepsi (p or P)");
                 System.out.print ("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
                 sDetails = myScanner.next();
                 switch (sDetails) {
                    // if the user wants Pepsi print that
                    case "P": 
                         System.out.println ("You ordered a Pepsi");
                    break;
                    case "p":
                        System.out.println ("You ordered a Pepsi");
                    break;
                    // if the user wants coke print that
                    case "C":
                        System.out.println ("You ordered a Coke");
                    break;
                    case "c":    
                        System.out.println ("You ordered a Coke");
                    break;
                    //if the user wants sprite print that
                    case "S":
                        System.out.println ("You ordered a Sprite");
                    break;
                    case"s":
                        System.out.println ("You ordered a Sprite");
                    break;
                    // if the user wants Mountain dew print that
                    case "M":
                        System.out.println ("You ordered a Mountain Dew");
                    break;
                    case"m":
                        System.out.println ("You ordered a Mountain Dew");
                    break;
                    // if the user entered an incorrect string print that
                    default:
                        System.out.println ("you did not enter any of P, p, C, c, S, s, M, m");
                    break;
                 }
            break;
            case "F":
                 System.out.println ("Do you want a large or small order of fries (l.L,s, or S)- ");
                 fDetails = myScanner.next();
                 switch (fDetails) {
                    // if the user wants Pepsi print that
                    case "l": 
                         System.out.println ("You ordered large fries");
                    break;
                    case "L":
                        System.out.println ("You ordered a large fries");
                    break;
                    // if the user wants coke print that
                    case "s":
                        System.out.println ("You ordered small fries");
                    break;
                    case "S":
                        System.out.println ("You ordered small fries");
                    default:
                        System.out.println ("you did not enter any of l, L, S, s,");
                    break;
                 }
            break;
            case "f":
                 System.out.println ("Do you want a large or small order of fries (l.L,s, or S)- ");
                 fDetails = myScanner.next();
                 switch (fDetails) {
                    // if the user wants Pepsi print that
                    case "l": 
                         System.out.println ("You ordered large fries");
                    break;
                    case "L":
                        System.out.println ("You ordered a large fries");
                    break;
                    // if the user wants coke print that
                    case "s":
                        System.out.println ("You ordered small fries");
                    break;
                    case "S":
                        System.out.println ("You ordered small fries");
                    default:
                        System.out.println ("you did not enter any of l, L, S, s,");
                    break;
                 }
            break;
            default:
                System.out.println ("you did not enter any of B, b, S, s, F, or f");
            break;
            }
        }
 }