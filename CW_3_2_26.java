import java.util.Scanner;
public class CW_3_2_26 
{
    public static void main(String[] args) 
    {
        double input1 = 0;
         Scanner keyboard = new Scanner(System.in);
         System.out.print("input: ");
        input1 = keyboard.nextDouble();
        if (input1 == 12)
        {
            System.out.println("true");
            System.out.println("The number is 12");
        }
        else
            System.out.println("false");
    }
}