//Write a program that takes a character as input and checks
//if it is a vowel or consonant using a switch-case statement.

package Code;
import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a number :");

//        char ch = Sc.nextLine().toLowerCase().charAt(0);
        char ch = Sc.nextLine().toLowerCase().charAt(1);

        switch (ch){
            case 'a':
                System.out.println("vowel");
            break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");

            case 'o':
                System.out.println("vowel");
            case 'u':
                System.out.println("vowel");

            break;
            default:
                System.out.println("consonant");



        }
    }

}
//
//Write a program that simulates a simple menu-driven calculator.
//The user should be able to perform addition, subtraction, multiplication, and
//division. Use a switch-case statement to handle the operations and a `while` loop to
//keep the program running until the user chooses to exit.
