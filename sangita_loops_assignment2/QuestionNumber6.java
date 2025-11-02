//Take 10 numbers from the user. Print how many of those numbers were even
//  and how many numbers were positive.

        package sangita_loops_assignment2;
import java.util.Scanner;

public class QuestionNumber6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0;
        int positive = 0;

        System.out.println("enter 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("number " + i + ": ");
            int num = sc.nextInt();

            //  even number
            if (num % 2 == 0) {
                even++;
            }

            // positive number
            if (num > 0) {
                positive++;
            }
        }

        System.out.println("even numbers: " + even);
        System.out.println("positive numbers: " + positive);
    }
}
