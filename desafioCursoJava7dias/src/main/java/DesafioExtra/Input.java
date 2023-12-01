package DesafioExtra;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = input.nextInt();

        if (n % 2 == 0 && n >= 2 && n <= 5) {
            System.out.println("A");
        }
        else if (n % 2 == 0 && n >= 6 && n <= 20) {
            System.out.println("B");
        }
        else if (n % 2 ==0 && n > 20) {
            System.out.println("C");
        }
        else {
            System.out.println("É um numero impar!");
        }

      /*forma do professor
         if (n%2 == 1) {
             System.out.println("impar");
        } else {
             if (n >= 2 && n <=5) {
                 System.out.println("A");
             } else if (n >=6 && <=20) {
                 System.out.println("B");
             }else{
                 System.out.println("C");
             }*/
    }
}

