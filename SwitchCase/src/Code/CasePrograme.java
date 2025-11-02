//Write a calculator program that takes two numbers and
//        an operator (+, -, *, /) as input and performs the corresponding
//        arithmetic operation using a switch-case statement.

        package Code;
import java.util.Scanner;

public class CasePrograme {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("enter a number1 :");
        int num1 = Sc.nextInt();

        System.out.println("enter a number1 :");
        int num2 = Sc.nextInt();
        System.out.println("choose operator (+,-,*,/):");

        char operator = Sc.next().charAt(0);

        switch (operator){
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
        }
    }

}
