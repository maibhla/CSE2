import java.util.Scanner;

public class CourseNumber{
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print ("Enter a six digit number giving the course semester- ");  // prompt use for input
        int nCourse = myScanner.nextInt();  // store the input as the course number
        int nYear = (int) (nCourse / 100);  // store the first 4 digits of the number as the year
        int nSemester = (nCourse)%100;  // store the last 2 digits of the number and the semester number
        if ((nYear >=1865) && (nYear <=2014)) {  // if the years are within the range check the semester number and print the proper semester name
            if (nSemester == 10) {  //spring
                System.out.println("The course was offered in the Spring semester of " +nYear);
            }
            else if (nSemester == 20) {  // summer 1
                System.out.println("The course was offered in the Summer 1 semester of " +nYear);
            }
            else if (nSemester == 30) {  // summer 2
                System.out.println("The course was offered in the Summer 2 semester of " +nYear);
            }
            else if (nSemester == 40) {  // fall
                System.out.println("The course was offered in the Fall semester of " +nYear);
            }
            else {  // if the semester number was not 10, 20, 30, or 40 print an error message
                System.out.println(+nSemester+ "is not a legitimate semester");
            }
        }
        else {  // if the year was not between 1865 and 2014 print an error message
            System.out.println("the number was outside the range [186510, 201440]");
        }
            
    }
}