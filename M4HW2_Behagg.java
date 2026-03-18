/**
 * Parker Behagg
 * M4HW2
 * 03/18/26
 */
import java.util.Scanner;

public class M4HW2_Behagg {
    public static void main(String[] args) {
        int age = 0;
        String county = "";
        String name = "";
        boolean felon = false;
        String felon_input = "";
        int time_of_residence = 0;
        String reason = "";
        boolean eligible = false;

        Scanner keyboard = new Scanner(System.in);
        //gather input
        System.out.print("Enter your name: ");
        name = keyboard.nextLine();
        System.out.print("Enter your age: ");
        age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter your county of residence: ");
        county = keyboard.nextLine();
        System.out.print("Enter the number of days you have resided in this county: ");
        time_of_residence = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("are you currently serving a felony sentence? (yes/no): ");
        felon_input = keyboard.nextLine();
        if (felon_input.equalsIgnoreCase("yes")) {
            felon = true;
        }
        keyboard.close();

        //determine eligibility
        reason = "you are ineligible to vote here because you are currently serving a felony sentence.";
        if (!felon) {
            reason = "you are ineligible to vote here because you do not meet the age requirement.";
            if (age >= 18) {
                reason  = "you are ineligible to vote here because you are not currently in Cumberland County.";
                if  (county.equalsIgnoreCase("Cumberland County")) {
                    reason = "you are ineligible to vote here because you have not met the time of residence requirement.";
                    if (time_of_residence >= 30) {
                        eligible = true;
                        reason = "";
                    }
                }
            } else {
                System.out.println("You are not eligible to vote.");
            }
        }
        //display output
        System.out.println();
        System.out.println("==========Results==========");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("County: " + county);
        System.out.println("Time of Residence: " + time_of_residence);
        System.out.println("Felon: " + felon);
        if (!eligible) {
            System.out.println("Reason: " + reason);
        }
        
    }
}
