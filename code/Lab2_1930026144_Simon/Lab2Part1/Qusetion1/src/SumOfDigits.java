import java.util.Scanner;

/**
* SumOfDigits.java
* @author Simon
* @copyright None 
* @ID 1930026144
* @description 

Question 2: write a Java program called
SumOfDigits which reads an integer
between 0 and 1000 and adds all the digits in
the integer.
Test Data:
Input an integer between 0 and 1000: 565
Expected Output:
The sum of all digits in 565 is 16

* @created 2020-10-05T19:03:29.414Z+08:00
* None
* @last-modified 2020-10-05T19:13:50.051Z+08:00
*/



public class SumOfDigits {
    public static void main(String[] args) {
        // Test
        // System.out.println("Hello World!");
        
        // hint for input
        System.out.println("Input a number ");
        // create a Scanner
        Scanner input = new Scanner(System.in);
        // obtain the input value
        int num = input.nextInt();
        
        input.close();
        
        System.out.println(num);
    }
}
