package Patern;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = Sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {   //space logic
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {     // star print
                System.out.print("*");
            }
            System.out.println();
        }

            for (int i = n; i >= 1; i--) {
                for (int j = 1; j < (n - i); j++) {   //space logic
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {     // star print
                    System.out.print("*");
                }
                System.out.println();
            }
            Sc.close();
        }
    }

