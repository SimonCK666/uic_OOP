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
* @last-modified 2020-10-13T10:10:57.093Z+08:00
*/



public class SumOfDigits {
    public static void main(String[] args) {
        // Test
        // System.out.println("Hello World!");
        
        // hint for input
        System.out.println("Input a number between 0 and 1000: ");
        // create a Scanner
        Scanner input = new Scanner(System.in);
        // obtain the input value
        int num = input.nextInt();
        input.close();
        
        // Test
        // System.out.println(num);

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += num % 10;
            num /= (int)10;
        }
        
        System.out.println(sum);
    }
}
