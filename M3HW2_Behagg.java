/**
 * Parker Behagg
 * CIS-115
 * M3HW2
 * 2/23/26
 * Simple Average Calculator
 */

/**----Pseudocode----
 * Declare Real num1, num2, num3, average
 * declare the keyboard variable to get input form the keyboard
 * Display "Enter number one: "
 * Input num1
 * Display "Enter number two: "
 * Input num2
 * Display "Enter number three: "
 * Input num3
 * Set average = num1 + num2 + num3
 * Display "The average is ", average
*/

import java.util.Scanner;

public class M3HW2_Behagg {

    public static void main(String[] args)
    {
        double num1, num2, num3, average;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("number one:");
        num1 = keyboard.nextDouble();
        System.out.print("number two:");
        num2 = keyboard.nextDouble();
        System.out.print("number three:");
        num3 = keyboard.nextDouble();
        average = (num1 + num2 + num3 ) / 3;
        System.out.println("average = " + average);
        keyboard.close();
    }
}
