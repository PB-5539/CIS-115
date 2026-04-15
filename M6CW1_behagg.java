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
                System.out.println("M6HW2");
                break;
            case 3:
                System.out.println("M6HW3");
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
        In.close();
    }
    public static void getM6HW1() {
        System.out.println("Getting M6HW1");
        //code for M6HW1
    }
}
