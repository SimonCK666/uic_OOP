import java.util.Scanner;

public class PrintNumberInWord {
    public static void main(String[] args) {
        System.out.print("Please input a number: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
    
        if (i == 1) {
            System.out.println("ONE");
        } else if (i == 2) {
            System.out.println("TWO");
        } else if (i == 3) {
            System.out.println("THREE");;
        } else if (i == 4) {
            System.out.println("FOUR");
        }
        
        System.out.println("FIRST DONE!!!");

        switch (i) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            default:
                System.out.println("OTHER");;
                break;
        }

        System.out.println("SECOND DONE!!!");

    }
}
