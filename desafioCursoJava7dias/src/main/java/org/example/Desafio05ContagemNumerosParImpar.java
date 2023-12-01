package org.example;

public class Desafio05ContagemNumerosParImpar {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 100; i++) {
            if (i %2 == 0) {
                System.out.print(i + " ");

            } else if (i % 2 != 0){
                System.out.println(i + " ");
            }
        }
    }
}
