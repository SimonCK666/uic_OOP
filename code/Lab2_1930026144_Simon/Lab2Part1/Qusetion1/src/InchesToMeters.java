/**
* InchesToMeters.java
* @author Simon
* @ID: 1930026144
* @description 

Question 1: write a Java program called
InchesToMeters which reads a number in
inches and converts it to meters.
Note: 1 inch = 0.0254 meter.
Test Data:
Input a value for inches: 1000.0
Expected Output:
1000.0 inches is 25.4 meters

* @created 2020-10-05T18:06:44.849Z+08:00
* None
* @last-modified 2020-10-05T19:05:03.338Z+08:00
*/

import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Define a number
        double f = 0.0f;
        double meter = 0.0f;
        System.out.println("Please input a float: ");
        // Input the number
        if (scan.hasNextDouble()) {
            f = scan.nextDouble();
            // Test
            // System.out.println("Float: " + f);
        }
        // Test
        // System.out.println("Double: " + f);

        // Close the input scan
        scan.close();
        // Calculus the meters
        meter = 0.0254 * f;

        // Out put the result
        System.out.println(f + " inches " + "is " + meter + " meters.");

    }
}
