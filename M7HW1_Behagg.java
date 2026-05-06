/**
 * Parker Behagg
 * M7HW1
 * 5/4/26
 */

//note: make two versions, one with and one without arrays because arrays are so much easier.
import java.util.Scanner;
public class M7HW1_Behagg {





    public static void main(String[] args) {
        runProgram();
    }





    public static void runProgram() {
        final double PRICE = 4.79;
        final double BASE = 2000.0;
        Scanner I = new Scanner(System.in);
        String iinput = "y";
        while (iinput.equalsIgnoreCase("y")) {
        //Get Info From User
        String temp = ""; //just here to fix errors
        String name = "";
        int sales = 0;
        int returns = 0;
        int totalsold = 0;
        double salesamnt = 0.0;
        double commission = 0.0;
        double salary = 0.0;
        name = displayInfo(I);
        sales = getSales(I);
        returns = getReturns(I);
        //Calculate Values
        totalsold = calWidSold(sales, returns);
        salesamnt = calWidSalesAmt(totalsold, PRICE);
        commission = calComm(totalsold, salesamnt);
        salary = calSalary(BASE, commission);
        //display values
        displayValues(name, sales, returns, totalsold, salesamnt, commission, salary);
        System.out.println();
        temp = I.nextLine();
        iinput = temp;//just so it can be used
        System.out.print("would you llike to run the program again (y/n): ");
        iinput = I.nextLine();
    }
        if (iinput.equalsIgnoreCase("n")) {
            I.close();
            System.out.println("exiting...");
        }
}



    public static String displayInfo(Scanner I) {
        String name = "";
        System.out.print("Widget Salesperson: ");
        name = I.nextLine();
        return name;

    }

    public static int getSales(Scanner I) {
        int totalsales = 0;
        for (int i = 0; i <4; i++) {
            System.out.print("enter week " + (i+1) + " sales: ");
            totalsales += I.nextInt();
            System.out.println();
        }
        return totalsales;
    }

    public static int getReturns(Scanner I) {
        int totalreturns = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("enter week "+(i+1)+" returns: ");
            totalreturns += I.nextInt();
            System.out.println();
        }
        return totalreturns;
    }

    public static int calWidSold(int sales, int returns ) {
        int finalsales = 0;
        finalsales = sales - returns;
        return finalsales;
    }

    public static double calWidSalesAmt(int totalsales, double PRICE) {
        double salesamnt = 0;
        salesamnt = totalsales * PRICE;
        return salesamnt;
    }

    public static double calComm(int totalsales, double salesamnt) {
        double commision_rate = 0.0;

        if ((totalsales >= 0) && (totalsales <= 100))
        {
        commision_rate = 0.1;
        }
        else if ((totalsales >= 101) && (totalsales <= 199))
        {
        commision_rate = 0.15;
        }
        else if ((totalsales >= 200) && (totalsales <= 300))
        {
        commision_rate = 0.2;
        }
        else if (totalsales > 300)
        {
        commision_rate = 0.25;
        }
        return (commision_rate * salesamnt);
    }

    public static double calSalary(double commision, double BASE) {
        double salary = 0.0;
        salary = BASE+commision;
        return salary;
    }

    public static void displayValues(String name, int sales, int returns, int totalsales, double salesamnt, double commision, double salary) {
        System.out.println("name: "+name);
        System.out.println("sales: "+sales);
        System.out.println("returns: "+returns);
        System.out.println("net sales: "+totalsales);
        System.out.println("sales amount: $"+salesamnt);
        System.out.println("commision: $"+commision);
        System.out.println("salary: $"+salary);
    }
    
    
}
