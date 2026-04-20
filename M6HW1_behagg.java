/**
 * Parker Behagg
 * M6HW1
 * 4/20/26
 */
import java.util.Scanner;

public class M6HW1_behagg {
    public static void main(String[] args) {
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
    In.close();
    }
}
