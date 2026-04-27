/**
 * Parker Behagg
 * 4/19/2026
 * M6CW2
 * area calculator
 */
import java.util.Scanner;
public class M6HW4_Behagg {
    public static void main(String[] args) {
        displayGreeting();
        calculateArea();
        displayClosing();
    }
    public static void displayGreeting() {
        System.out.println("welcome!");
    }
    public static void calculateArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the length of the rectangle:");
        double length = input.nextDouble();
        System.out.print("enter the width of the rectangle:");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("the area of the rectangle is: " + area);
        input.close();
    }
    public static void displayClosing() {
        System.out.println("thank you for using the area calculator!");
    }
}