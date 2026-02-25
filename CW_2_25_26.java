import java.util.Scanner;
public class CW_2_25_26 {
    public static void main(String[] args)
    {
        //prompt
        Double budget, gas, accomadation, food, totalExpense, remainingBudget;
        String destination;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please Fill out the form to the best of your ability.");
        System.out.println();
        System.out.println();
        System.out.println("==========Form==========");
        System.out.print("Budget: ");
        budget = keyboard.nextDouble();
        System.out.print("Destination: ");
        destination = keyboard.next();
        System.out.print("Gas: ");
        gas = keyboard.nextDouble();
        System.out.print("Accomadation: ");
        accomadation = keyboard.nextDouble();
        System.out.print("Food: ");
        food = keyboard.nextDouble();
        System.out.println();

        //calculations
        totalExpense = gas + accomadation + food;
        remainingBudget = budget - totalExpense;

        //results
        System.out.println("");
        System.out.println("==========Results==========");
        System.out.println("");
        System.out.println("----Expenses----");
        System.out.println("gas: "+gas);
        System.out.println("Accomodation: " + accomadation);
        System.out.println("Food: " + food);
        System.out.println("");
        System.out.println("----Budget----");
        System.out.println("Initial Budget: " + budget);
        System.out.println("Total Expenses: " + totalExpense);
        System.out.println("Remaining Budget: " + remainingBudget);
        System.out.println("");
    }
}