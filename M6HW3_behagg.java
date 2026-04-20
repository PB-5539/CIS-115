import java.util.Scanner;

public class M6HW3_behagg {
    public static void main(String[] args) {
        System.out.println("Getting M6HW3");
        Scanner In = new Scanner(System.in);
        String name = "";
        int widgetsSold = 0;
        int returned = 0;
        double commision = 0.0;

        System.out.print("Enter Your Name: ");
        name = In.nextLine();
        System.out.print("Enter Widgets Sold: ");
        widgetsSold = In.nextInt();
        System.out.print("Enter Widgets Returned: ");
        returned = In.nextInt();
        commision = 500 + ((widgetsSold - returned)*10);

        System.out.println("Salesperson: " + name);
        System.out.println("Total Widgets Sold: " + (widgetsSold - returned));
        System.out.println("Commission: $" + commision);
        In.close();
    }
}
