public class multi {
    public static void main(String[] args) {
        int firstNum, secoundNum;
        int result, row = 1;
        for (firstNum = 1; firstNum < 10; firstNum++) {
            for (secoundNum = 1; secoundNum <= firstNum; secoundNum++) {
                result = firstNum * secoundNum;
                System.out.print(firstNum + " * " + secoundNum + " = " + result);

                // if (row == firstNum) {
                //     System.out.println();
                // }

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
