/**
 * Parker Behagg
 * M6CW1
 * 4/15/26
 */

import java.util.Scanner;
public class M6CW1_behagg {
    public static void main(String[] args) {
        runProgram();
    }
    public static void runProgram() {
        System.out.println("Method Project");
        Scanner In = new Scanner(System.in);
        String keep_going = "yes";
        while (keep_going.equalsIgnoreCase("yes")) {
            displayMenu();
            System.out.println();
            System.out.println("you have exited the menu!");
            System.out.println("Do you want to run the program again? (yes/no)");
            keep_going = In.nextLine();
            System.out.println();
            }
        In.close();
        System.out.println("program has ended");
    }
    public static void displayMenu() {
        System.out.println();
        System.out.println("Menu:");
        System.out.println();
        System.out.println("1) M6HW1");
        System.out.println("2) M6HW2");
        System.out.println("3) M6HW3");
        System.out.println("4) Exit");
        System.out.println();
        System.out.print("Selection: ");
        Scanner In = new Scanner(System.in);
        switch (In.nextInt()){
            case 1:
                getM6HW1();
                displayMenu();
                break;
            case 2:
                getM6HW2();
                displayMenu();
                break;
            case 3:
                getM6HW3();
                displayMenu();
                break;
            case 4:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
                System.out.println();
                displayMenu();
                break;
        } 

    }
    public static void getM6HW1() {
    System.out.println("Getting M6HW1");
    //code for M6HW1
    Scanner In = new Scanner(System.in);
    String employeeName = "";
    double hoursWorked = 0.0;
    double hourlyRate = 0.0;
    double grossPay = 0.0;

    System.out.print("Enter employee's name: ");
    employeeName = In.nextLine();
    System.out.print("Enter hourly pay rate: ");
    hourlyRate = In.nextDouble();
    System.out.print("Enter hours worked: ");
    hoursWorked = In.nextDouble();
    grossPay = hoursWorked * hourlyRate;
    System.out.println("Employee: " + employeeName);
    System.out.println("Hourly Rate: $" + hourlyRate);
    System.out.println("Hours Worked: " + hoursWorked);
    System.out.println("Gross Pay: $" + grossPay);
    }
    public static void getM6HW2() {
        System.out.println("Getting M6HW2");
        String name = "";
        Scanner In = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = In.nextLine();
        System.out.print("Last Month's Water Usage (in gallons): ");
        double lastMonthUsage = In.nextDouble();
        System.out.print("This month's Water Usage (in gallons): ");
        double thisMonthUsage = In.nextDouble();
        double usage = thisMonthUsage - lastMonthUsage;
        double charge = (usage * 0.2) + 50;
        System.out.println("Customer Name: " + name);
        System.out.println("Water Usage: " + usage + " gallons");
        System.out.println("Charge: $" + charge);
    }
    public static void getM6HW3() {
        System.out.println("Getting M6HW3");
        //code for M6HW3
    }
}
