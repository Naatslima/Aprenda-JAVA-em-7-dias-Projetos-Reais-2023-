package DesafioExtra;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero, o operador e o segundo numero para calcular:");

        double number1 = calc.nextDouble();
        char op = calc.next().charAt(0); //usado char no lugar de interger
        double number2 = calc.nextDouble();

        if (op == '+') {
            System.out.println(number1 + number2);
        } else if (op == '-') {
            System.out.println(number1 - number2);
        } else if (op == '*') {
            System.out.println(number1 * number2);
        } else if (op == '/') {
            System.out.println(number1 / number2);
        } else {
            System.out.println("Formato inválido!");
        }
    }
}
