import java.util.Scanner;
public class M7CW1_Behagg // change to your last name
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int choice;
do {
System.out.println("\n=== Java Function Practice Menu ===");
System.out.println("1. Add two integers");
System.out.println("2. Greet user");
System.out.println("3. Area of a circle");
System.out.println("4. Larger of two numbers");
System.out.println("5. Fahrenheit to Celsius");
System.out.println("6. Show student info");
System.out.println("7. Discounted price");
System.out.println("8. Check even or odd");
System.out.println("9. String length");
System.out.println("10. Average of three numbers");
System.out.println("0. Exit");
System.out.print("Enter your choice: ");
choice = input.nextInt();
input.nextLine();
switch (choice) {
case 1 -> {
System.out.print("Enter the first integer: ");
int a = input.nextInt();
System.out.print("Enter the second integer: ");
int b = input.nextInt();
System.out.println("Sum = " + add(a, b)); // create this
}
case 2 -> {
System.out.print("Enter your name: ");
String name = input.nextLine();
greet(name); // create this method
}
case 3 -> {
System.out.print("Enter radius: ");
double r = input.nextDouble();
System.out.println("Area = " + circleArea(r)); // create this
}
case 4 -> {
System.out.print("Enter the first number: ");
int x = input.nextInt();
System.out.print("Enter the second number: ");
int y = input.nextInt();
larger(x, y); // create this method
}
case 5 -> {
System.out.print("Enter Fahrenheit temperature: ");
double f = input.nextDouble();
System.out.println("Celsius = " + toCelsius(f)); // create this
}
case 6 -> {
System.out.print("Enter student name: ");
String sname = input.nextLine();
System.out.print("Enter grade: ");
int grade = input.nextInt();
showStudent(sname, grade); // create this method
}
case 7 -> {
System.out.print("Enter price: ");
double price = input.nextDouble();
System.out.print("Enter discount (%): ");
double percent = input.nextDouble();
System.out.println("Discounted price = " + discounted(price, percent)); // create this method
}
case 8 -> {
System.out.print("Enter a number: ");
int n = input.nextInt();
System.out.println("The number is "+ isEvenOdd(n)); // create

}
case 9 -> {
System.out.print("Enter a string: ");
String str = input.nextLine();
System.out.println("Length = " + strLength(str)); // create

}
case 10 -> {
System.out.print("Enter the first integer: ");
int n1 = input.nextInt();
System.out.print("Enter the second integer: ");
int n2 = input.nextInt();
System.out.print("Enter the third integer: ");
int n3 = input.nextInt();
System.out.println("Average = " + average(n1, n2, n3)); //

}
case 0 -> System.out.println("Exiting program. Goodbye!");
default -> System.out.println("Invalid choice. Try again.");
}
} while (choice != 0);
input.close();
}
// create your methods here
// be sure to use the method names given
public static int add(int a, int b) // i create this method to show you an

{
return a + b;
}

public static void greet(String name)
{
    System.out.println("Hello, " + name + "!");
}

public static double circleArea(double r)
{
    return Math.PI * r * r;
}
public static void larger(int x, int y)
{
    if (x > y) {
        System.out.println(x + " is larger than " + y);
    } else if (y > x) {
        System.out.println(y + " is larger than " + x);
    } else {
        System.out.println("Both numbers are equal.");
    }
}
public static double toCelsius(double f)
{
    return (f - 32) * 5/9;
}
public static void showStudent(String sname, int grade)
{
    System.out.println("Student Name: " + sname);
    System.out.println("Grade: " + grade);
}
public static double discounted(double price, double percent)
{
    return price * (1 - percent / 100);
}
public static String isEvenOdd(int n)
{
    return (n % 2 == 0) ? "even" : "odd";
}
public static int strLength(String str)
{
    return str.length();
}
public static double average(int n1, int n2, int n3)
{
    return (n1 + n2 + n3) / 3.0;
}
}