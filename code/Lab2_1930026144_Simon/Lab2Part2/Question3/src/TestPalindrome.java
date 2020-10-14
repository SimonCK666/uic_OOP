import java.util.Scanner;


public class TestPalindrome {
    public static void main(String[] args) {
        System.out.println("Please input a String: ");
        Scanner in = new Scanner(System.in);
        // Input a string
        String inStr = in.nextLine();
        // change all the letters into lower case
        String lowStr = inStr.toLowerCase();
        
        // close the Scanner
        in.close();
        
        String lowStr_withoutSpaces = lowStr.replaceAll(" +", "");
        // Test
        // System.out.println("The without spaces is " + lowStr_withoutSpaces);

        // forward & backward indexes
        int fIdx = 0, bIdx = inStr.length() - 1;
        char fChar, bChar;
        while (fIdx < bIdx) {
            fChar = lowStr_withoutSpaces.charAt(fIdx);
            bChar = lowStr_withoutSpaces.charAt(bIdx);
            // judge whether it is palindrome
            if (fChar != bChar) {
                System.out.println("\"" + inStr + "\" is not a palindrome");
                return;
            } else {
                fIdx++;
                bIdx--;
            }
        }
        System.out.println("\"" + inStr + "\" is a palindrome");
    }
}
