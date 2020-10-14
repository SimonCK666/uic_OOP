import java.util.Scanner;

public class GradesAverage {
    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        int numStudents = input.nextInt();

        int grades[] = new int[numStudents];
        int sumGrades = 0;
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = input.nextInt();
            if (0 <= grades[i] && grades[i] <= 100) {
                sumGrades += grades[i];
            } else {
                i--;
                System.out.println("Invalid grade, try again...");
            }
        }

        System.out.println("The average is: " + (double)sumGrades / numStudents);

        System.out.println("DONE!!!!");
    }
}
