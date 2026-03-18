/**
 * Parker Behagg
 * M4HW1
 * 03/18/26
 */
 import java.util.Scanner;
public class M4HW1_Behagg {
    public static void main(String[] args) {
        final double PRICE = 4.79;
        final double BASE = 2000.0;
        String name = "";
        int sold = 0;
        int returned = 0;
        int net_sold = 0;
        double sales_amount = 0.0;
        double commision_rate = 0.0;
        double commision = 0.0;
        double salary = 0.0;

        Scanner keyboard = new Scanner(System.in);

        //gather input
        System.out.print("Enter the name of the widgets person: ");
        name = keyboard.nextLine();
        System.out.print("Enter the number of widgets sold: ");
        sold = keyboard.nextInt();
        System.out.print("Enter the number of widgets returned: ");
        returned = keyboard.nextInt();
        
        keyboard.close();

        //calculate commision_rate
        if ((net_sold >= 0) && (net_sold <= 100))
        {
            commision_rate = 0.1;
        }
        else if ((net_sold >= 101) && (net_sold <= 199))
        {
            commision_rate = 0.15;
        }
        else if ((net_sold >= 200) && (net_sold <= 300))
        {
            commision_rate = 0.2;
        }
        else if (net_sold > 300)
        {
            commision_rate = 0.25;
        }

        //calculate commision and salary
        net_sold = sold - returned;
        sales_amount = net_sold * PRICE;
        commision = sales_amount * commision_rate;
        salary = BASE + commision;

        //display output
        System.out.println();
        System.out.println("==========Results==========");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Net widgets sold: " + net_sold);
        System.out.println("Sales amount: $" + sales_amount);
        System.out.println("Commision rate: " + (commision_rate * 100) + "%");
        System.out.println("Commision: $" + commision);
        System.out.println("Total salary: $" + salary);

    }
}