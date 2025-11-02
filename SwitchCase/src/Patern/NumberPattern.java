package Patern;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = Sc.nextInt();
//        for(int i = 5; i >= 1; i--){
//            for(int j = 1; j <= i; j++){
//
//                System.out.print(" *" );
//            }
//            System.out.println();
//        }
//        Sc.close();


        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
                System.out.print(" " );
            }
            System.out.println();
        }
        Sc.close();

    }
}
