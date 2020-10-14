/**
* SumAndAverage.java
* @author Simon
@ ID 1930026144
* @description 
* @created 2020-10-13T10:16:13.230Z+08:00
* @copyright None 
* @last-modified 2020-10-13T10:24:34.951Z+08:00
*/


public class SumAndAverage {
	public static void main(String[] args) {
        int starNum = 0;
        int sum = 0;
        float average = 0;
        
        for (int i = 0; i <= 100; i++) {
            sum += starNum;
            starNum++;
        }
        
        average = (float)sum / 100;

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
