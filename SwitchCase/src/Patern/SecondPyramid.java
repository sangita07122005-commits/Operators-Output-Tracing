package Patern;

import java.util.Scanner;

public class SecondPyramid {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = Sc.nextInt();

        for (int i = 0; i < n; i--) {
            for (int j = 0; j < i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 *(n - i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        Sc.close();
    }
}
