//Take a number from the user and store it in “input” named variable..
//If the input is less than 5 but greater than 2, print “I enjoy coding”
//<input> times using a while loop. If the input is less 10 than  but greater than 6,
//print the multiplication table of input number from 8 to 19 using a do-while loop.

package sangita_loops_assignment2;
import java.util.Scanner;

public class QuestionNumber4 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("enter the number: ");
        int input = Sc.nextInt();

//        if(input < 5 && input > 2) {
//            int i = 0;
//            while(i < input)
//                i++;
//            System.out.println("i enjoy coding " + input);
//        }



         if (input < 10 && input > 6) {
             int i = 8;
             do {
                 System.out.println(input + " x " + i + " = " + (input * i));
                 i++;
             } while (i <= 19);

         }
    }
}
