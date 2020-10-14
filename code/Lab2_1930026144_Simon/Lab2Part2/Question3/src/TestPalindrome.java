import java.util.Scanner;


public class TestPalindrome {
    public static void main(String[] args) {
        System.out.println("Please input a String: ");
        Scanner in = new Scanner(System.in);
        // Input a string
        String inStr = in.nextLine();
        
        
        // close the Scanner
        in.close();
        
        String str = "";
        // Test
        // System.out.println(inStr.length());
        
        // get rid of all the spacess
        for (int i = 0; i < inStr.length(); i++) {
            if (Character.isLetter(inStr.charAt(i))) {
                str += inStr.charAt(i);
            }
        }

        // change all the letters into lower case
        String lowStr = str.toLowerCase();

        // forward & backward indexes
        int fIdx = 0, bIdx = lowStr.length() - 1;
        char fChar, bChar;
        while (fIdx < bIdx) {
            fChar = lowStr.charAt(fIdx);
            bChar = lowStr.charAt(bIdx);
            // judge whether it is palindromic sentences
            if (fChar != bChar) {
                System.out.println("\"" + inStr + "\" is not a palindromic sentence");
                return;
            } else {
                fIdx++;
                bIdx--;
            }
        }
        System.out.println("\"" + inStr + "\" is a palindromic sentence");
    }
}
