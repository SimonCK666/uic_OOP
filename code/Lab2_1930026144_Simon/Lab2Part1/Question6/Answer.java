public class Answer {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;

        System.out.println("----- For Loop: -----");
        for (int number = lowerbound; number <= upperbound; number++) {
            sum += number;
        }
        average = (double)sum / (upperbound - lowerbound + 1);

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);

        System.out.println();
        System.out.println("----- While Loop: -----");

        sum = 0;
        int number = lowerbound;
        while (number <= upperbound) {
            sum += number;
            number++;
        }
        average = (double)sum / (upperbound - lowerbound + 1);

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);

        System.out.println("DONE!!!");  
    }
}
