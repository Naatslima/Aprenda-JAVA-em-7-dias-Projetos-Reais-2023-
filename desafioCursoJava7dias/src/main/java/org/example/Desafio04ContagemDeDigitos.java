package org.example;

import java.util.Scanner;

public class Desafio04ContagemDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        if (numero <9 &&  numero >= 1) {
            System.out.println("Este número contém 1 digito.");

        } else if (numero <100 && numero > 10) {
            System.out.println("Este número contém 2 digitos.");

        } else if (numero <1000 && numero > 100) {
            System.out.println("Este número contém 3 digitos.");

        } else if (numero <10000 && numero >1000) {
            System.out.println("Este número contém 4 digitos.");

        } else {
            System.out.println("Este número contém 5 digitos ou mais.");
        }
    }
}
