//- Write a program that takes a student's score as input. Then determine the grade depending on the score:
//        Score >= 90 - “Average”
//        Score >= 80 but less than 90 - “Below Average”
//        Score >= 70 but less than 80 - “Ki j hobe 😫”
//        Score >= 60 but less than 70 - “Bss, akhon pora-shona chere de.”
//        Keep asking the user for the student's score until he enters -1.
//        The grade will be determined and printed until and unless the user enters -1.

package sangita_loops_assignment2;
import java.util.Scanner;

public class QuestionNumber9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter student's score: ");
            int score = sc.nextInt();

            if (score == -1) {
                System.out.println("Program ended.");
                break;
            }

            if (score >= 90) {
                System.out.println("Average");
            } else if (score >= 80) {
                System.out.println("Below Average");
            } else if (score >= 70) {
                System.out.println("Ki j hobe 😫");
            } else if (score >= 60) {
                System.out.println("Bss, akhon pora-shona chere de.");
            } else {
                System.out.println("Fail re vai! 😵");
            }
        }
    }
}
