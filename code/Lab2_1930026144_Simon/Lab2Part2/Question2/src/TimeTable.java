
public class TimeTable {
    public static void main(String[] args) {
        int firstNum, secoundNum;
        int result;
        
        // print the title
        System.out.print("* |  ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();
        System.out.println("---------------------------------------");

        // for loop outputs the multiplication result
        for (firstNum = 1; firstNum < 10; firstNum++) {
            System.out.print(firstNum + " |  ");
            for (secoundNum = 1; secoundNum < 10; secoundNum++) {
                result = firstNum * secoundNum;
                // System.out.print(firstNum + " * " + secoundNum + " = " + result);
                System.out.print(result);

                if (result >= 10) {
                    System.out.print("  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
