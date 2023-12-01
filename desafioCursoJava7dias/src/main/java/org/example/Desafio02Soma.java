package org.example;

import java.util.Scanner;

public class Desafio02Soma {
    public static void main(String[] args) {
        double valorA, valorB, result, media;

        Scanner A = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        valorA = A.nextDouble();

        Scanner B = new Scanner(System.in);
        System.out.println("Digite o valor de B: ");
        valorB = B.nextDouble();

        result = valorA + valorB;
        media = result / 2;

        System.out.println("O valor da soma é: " + result);
        System.out.println("O valor da média é: " + media);

    }
}
