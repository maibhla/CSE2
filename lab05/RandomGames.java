// Scott Kaplan
// Lab 05
// Random Games Lab
// program to allow the user to choose a game and output a randomly generated output for that specific game
import java.util.Scanner;

// main method
 public class RandomGames{
     public static void main(String [] args) {
         Scanner myScanner;  // initialize variables and a scanner
         int randomNumber;
         myScanner = new Scanner (System.in);
         System.out.print ("Enter R or r for Roulette, C or c for crraps, P or p for pick a card- ");
         String game = myScanner.next();  // set the variable game to the string in the scanner
         if (game.length() != 1){
             System.out.println("a single character expected");  // if the length of the string is not one print an error message and leave the program
             return;
         }
         switch (game){
             case "R":  // if the letter is R or r generate a random number between 1 and 38, if it is 38 display 00
                randomNumber = (int) (Math.random() * 38 + 1);
                if (randomNumber == 38){
                    randomNumber = 00;
                }
                System.out.println("Roulette:" +randomNumber);
             break;
             case "r":
                randomNumber = (int) (Math.random() * 37 + 1);
                if (randomNumber == 38){
                    randomNumber = 00;
                }
                System.out.println("Roulette:" +randomNumber);
             break;
             //A.  if the letter is C, c, P or p display that the option is not implemented
             case "C":
                System.out.println("That option has not yet been implemented");
             break;
             case "c":
                System.out.println("That option has not yet been implemented");
             break;
             case "P":
                System.out.println("That option has not yet been implemented");
             break;
             case "p":
                System.out.println("That option has not yet been implemented");
             break;
             //end of what is describe in A.
             default:
                System.out.println(""+game+" is not one of 'R' 'r' 'C' 'c' 'P' or 'p'");  // if the user entered 1 char that is not one of the 6 allowed print that that is not an allowed character
             break;
         }
     }
 }
