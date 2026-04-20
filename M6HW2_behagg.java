import java.util.Scanner;

public class M6HW2_behagg {
    public static void main(String[] args) {
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
        In.close();
    }
}
