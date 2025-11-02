//Take a number from the user. Keep asking the user for the input number
//if the number is less than 100. Stop only when the number is greater than or
//equal to 100. Once the user has a number greater than or equal to 100,
//print the table of 7 from 33 to 40 using a while loop.


package sangita_loops_assignment2;
import java.util.Scanner;

public class QuestionNumber7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();;


        do {
            System.out.print("Enter a number: ");
        } while (input < 100);


        int i = 33;
        System.out.println("print Table of 7 (from 33 to 40):");
        while (i <= 40) {
            System.out.println("7 x " + i + " = " + (7 * i));
            i++;
        }
    }
}
