/**
 * Parker Behagg
 * CIS-115
 * M3HW1
 * 2/23/26
 * Simple Circle Calculator
 */

public class M3HW1_Behagg 
{
    public static void main(String[] args)
    {
        double radius = 3.8;
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Circle with radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
        /** Explanation:
         * radius – the distance from the center to the edge of the circle.
         * Diameter formula → 2 × radius
         * Circumference formula → 2 × π × radius
         * Area formula → π × radius × radius
         * Math.PI gives the value of π (3.14159...).
        */
    }    
}
