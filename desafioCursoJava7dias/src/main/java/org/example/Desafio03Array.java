package org.example;

import java.util.Arrays;

public class Desafio03Array {
    public static void main(String[] args) {
        int[] x = {1, 4, 2, 18, 75, 9, 19, 0};
        System.out.println("Array original: " + Arrays.toString(x));
        Arrays.sort(x);
        System.out.println("Array em ordem: " + Arrays.toString(x));
        System.out.println("_____________");

        String[] name = {"Ana", "Matheus", "Carlos", "Pedro", "Sergio"};
        System.out.println("Array original: " + Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Array em ordem: " + Arrays.toString(name));

    }
}