/**
 * Parker Behagg
 * 2/25/26
 * M4CW1
 */
import java.util.Scanner;
public class M4CW1_Behagg 
{
    public static void main(String[] args) 
    {

        //variables
        Double majors, nonmajors; //set as a double because JAVA can't convert from integer to Double for calculations (throws an imcompileable error)
        Double total, percentmajors, percentnonmajors;

        //prompt
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please Fill out the form to the best of your ability.");
        System.out.println();
        System.out.println();
        System.out.println("==========Form==========");
        System.out.print("Majors: ");
        majors = keyboard.nextDouble();
        System.out.print("Non-Majors: ");
        nonmajors = keyboard.nextDouble();
        keyboard.close();

        //calculations
        total = majors + nonmajors;
        percentmajors = majors / total * 100;
        percentnonmajors = nonmajors / total * 100;

        //results
        System.out.println("");
        System.out.println("==========Results==========");
        System.out.println("");
        System.out.println("Majors: " + percentmajors);
        System.out.println("");
        System.out.println("Non-Majors: " + percentnonmajors);

    }
}
