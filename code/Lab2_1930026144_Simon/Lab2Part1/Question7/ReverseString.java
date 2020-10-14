import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner input = new Scanner(System.in);
        String inStr = input.nextLine();

        int inLength = inStr.length();
        System.out.println("The Reverse String is: ");
        
        for (int i = inLength - 1; i >= 0; i--) {
            System.out.print(inStr.charAt(i));
        }
        System.out.println();
        System.out.println("DONE");
        
    }
}
