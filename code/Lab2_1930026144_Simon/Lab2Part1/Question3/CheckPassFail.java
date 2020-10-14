import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        System.out.print("Please input a number: ");
        Scanner input = new Scanner(System.in);
        int mark = input.nextInt();

        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FALL");
        }

        System.out.println("DONE");

    }
}
