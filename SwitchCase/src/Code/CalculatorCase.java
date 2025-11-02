//Write a program that simulates a simple menu-driven calculator.
//The user should be able to perform addition, subtraction, multiplication,
//and division. Use a switch-case statement to handle the operations and a `while
//` loop to keep the program running until the user chooses to exit.
//Use a `continue` statement to handle invalid inputs.
package Code;
import java.util.Scanner;
public class CalculatorCase {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int operator;

        while (true) {
            // Display menu
            System.out.println("\n=== Simple Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            operator = Sc.nextInt();

            // Exit option
            if (operator == 5) {
                System.out.println("Exiting... Goodbye!");
                break;
            }


            System.out.println("enter a number1 :");
            int num1 = Sc.nextInt();

            System.out.println("enter a number1 :");
            int num2 = Sc.nextInt();
            System.out.println("choose operator (+,-,*,/):");

//        char Operator = Sc.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;

                default:
                    System.out.println("Invalid Input");


            }
        }
        Sc.close();
    }
}
