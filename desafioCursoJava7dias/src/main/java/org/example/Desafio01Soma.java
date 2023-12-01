package org.example;

import java.util.Scanner;

public class Desafio01Soma {
    public static void main(String[] args) {

        int valorA, valorB, result, media;

        Scanner A = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        valorA = A.nextInt();

        Scanner B = new Scanner(System.in);
        System.out.println("Digite o valor de B: ");
        valorB = B.nextInt();

        result = valorA + valorB;
        media = result / 2;

        System.out.println("O valor da soma é: " + result);
        System.out.println("O valor da média é: " + media);

    }
}