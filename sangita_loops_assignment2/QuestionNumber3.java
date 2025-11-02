//Take a number from the user and store it in “inputValue” variable.
//Print the multiplication table of the inputValue from 3 to 15.
//Print the multiplication table it in this format
//inputValue x 3 = result
//inputValue x 4 = result
//Do this using all the loops.


package sangita_loops_assignment2;
import java.util.Scanner;

public class QuestionNumber3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("enter the number: ");
        int inputValue = Sc.nextInt();

        //using for loop
//        for (int i = 3; i <= 15; i++) {
//            System.out.println(inputValue + " x " + i + " = " + (inputValue * i));
//        }


        // using while loop

//        int j = 3;
//        while (j <= 15) {
//            System.out.println(inputValue + " x " + j + " = " + (inputValue * j));
//            j++;
//        }

        // do while loop

        int i = 3;
        do{
            System.out.println(inputValue + " x " + i + " = " + (inputValue * i));
            i++;
        }while(i <= 15);



    }
}
