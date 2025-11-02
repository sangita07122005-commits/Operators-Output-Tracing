//Take 10 numbers from the user and print the addition of all those numbers.

package sangita_loops_assignment2;
import java.util.Scanner;

public class QuestionNumber5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 10 numbers:");
        int num = sc.nextInt();

        int add = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("number: " + i + " : ");

            add += num;
        }

        System.out.println("the sum of all numbers = " + add);
    }
}
