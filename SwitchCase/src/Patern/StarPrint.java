package Patern;
import java.util.Scanner;

public class StarPrint {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a nmuber:");
        int n = Sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
