import java.util.Scanner;

/**
* M7NeedtoDebug.java
* Debug the java file to make sure it will execute correctly
* The program asks the user for two values (a and b where c is the third value)
for a right triangle to get the area and hypotenuse
* The program will use methods and functions
* The program will ask whether it can run again
* You will need to debug the functions and methods
* use the value 5 for Side A
* Use the value 12 for side B
* Thus, 13 should be value you will receive for hypotenuse
*/
public class M7CW2_Behagg
{
public static void main(String[] args)
{
runMenu();
}
public static void runMenu()
{
Scanner in = new Scanner(System.in); // fix this scanner variable and pass its variable to other methods
String keep_going = "yes";
String name = "";
while(keep_going.equalsIgnoreCase("yes"))
{
System.out.print("Enter your name: ");
name = in.nextLine();
displayInfo(name);
// all calls to your function/methods should come from runProgram() method only
Double sideA = getSideA(in);
Double sideB = getSideB(in);
Double area = calArea(sideA,sideB);
Double hypotenuse = calHypotenuse(sideA,sideB);
displayValues(sideA, sideB, area, hypotenuse);
System.out.println();
System.out.println();
System.out.print("Do you want to run the program again? (yes/no): ");
keep_going = in.nextLine();
}
in.close();
System.out.println("Program has terminated!");
}

public static void displayInfo(String name)
{
System.out.println();
System.out.println("Name: " + name);
System.out.println();
}
public static Double getSideA(Scanner in )
{
System.out.print("Enter side A of the right triangle: ");
Double sideA = in.nextDouble();
in.nextLine();
return sideA;
}
public static double getSideB(Scanner in )
{
System.out.print("Enter side B of the right triangle: ");
Double sideB = in.nextDouble();
in.nextLine();
return sideB;
}
public static double calArea(double a, double b )
{
return (a*b)/2;
}
public static double calHypotenuse( double a, double b )
{
// hypotenuse must be double in the Math.hypot() function so values are received as double not integers
// this function has no errors
return Math.hypot(a, b);
}
public static void displayValues(double sideA, double sideB, double area, double hypotenuse)
{
System.out.println();
System.out.println("Side A is " + sideA);
System.out.println("Side B is " + sideB);
System.out.println("Area is " + area);
System.out.println("Hypotenuse is " +hypotenuse);
System.out.println();
}
}
