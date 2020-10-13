/**
* SumAndAverage.java
* @author Simon
@ ID 1930026144
* @description 
* @created 2020-10-13T10:16:13.230Z+08:00
* @copyright None 
* @last-modified 2020-10-13T15:06:54.194Z+08:00
*/


public class SumAndAverage {
	public static void main(String[] args) {
        int starNum = 0;
        
        /* Question 1.1: for loop to sum only the odd numbers from
        				1 to 100, and compute the average
        */
        int oddSum = 0;
        float oddAverage = 0;

        for (int i = 1; i <= 100; i = i + 2) {
            oddSum += starNum;
            starNum++;
        }
        // Compute the average
        oddAverage = (float)oddSum / 49;
        // Print out the answer
        System.out.println("The odd sum is " + oddSum);
        System.out.println("The odd average is " + oddAverage);
        
        /* Question 1.2: use while loop to sum the number from 1 to 100 that
                        divisible by 7, and compute the average
        */
        float divisibleBySevenAverage = 0;
        int divisibleBySevenSum = 0;
        int divisibleBySevenNum = 0;
        starNum = 7;
        while (starNum < 100) {
            
            divisibleBySevenSum += starNum;
            starNum += 7;
            divisibleBySevenNum++;
        }
        // Compute the average
        divisibleBySevenAverage = (float)divisibleBySevenSum / divisibleBySevenNum;
        // Print out the answer
        System.out.println("The divisible by seven sum is " + divisibleBySevenSum);
        System.out.println("The divisible by seven average is " + divisibleBySevenAverage);

        
        /* Question 1.3: modify the first do while loop to find the sum of the squares of
                        all the numbers from 1 to 100
        */
        starNum = 0;
        int squareResult = 0;
        // do while statement
        do {
            squareResult += starNum * starNum;
            starNum++;
        } while (starNum <= 100);
        // print out the result
        System.out.println("The square of the numbers from 1 to 100 is " + squareResult);
    }
}
