/**
 * Parker Behagg
 * M7HW1
 * 5/4/26
 */

//note: make two versions, one with and one without arrays because arrays are really useful.
import java.util.Scanner;
public class M7HW1_Behagg {





    public static void main(String[] args) {
        runProgram();
    }





    public static void runProgram() {
        Scanner I = new Scanner(System.in);
        //Get Info From User
        String name = "";
        name = displayInfo(I);
        getSales(I);
        getReturns(I);
        //Calculate Values
        calWidSold();
        calWidSalesAmt();
        calComm();
        calSalary();
        //display values
        displayValues(name);
        I.close();
    }



    public static String displayInfo(Scanner I) {
        String name = "";
        System.out.print("Widget Salesperson: ");
        name = I.nextLine();
        return name;

    }

    public static void getSales(Scanner I) {

    }

    public static void getReturns(Scanner I) {

    }

    public static void calWidSold() {

    }

    public static void calWidSalesAmt() {

    }

    public static void calComm() {

    }

    public static void calSalary() {

    }

    public static void displayValues(String name) {
        System.out.println(name);
    }
    
    
}
