package sangita_loops_assignment2;
import java.util.Scanner;

public class QuestionNumber8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Enter a 3-digit number: ");
            num = sc.nextInt();

            if (num >= 100 && num <= 999) {
                break;
            } else {
                System.out.println(" 3 digit number print: 😒");
            }
        }

        //  sum
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("amar jonno " + sum + " roshogolla aanish 😋.");

    }
}
