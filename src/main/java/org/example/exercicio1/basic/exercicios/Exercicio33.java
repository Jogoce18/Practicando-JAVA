package org.example.exercicio1.basic.exercicios;
/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
 */

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // Calcula o delta
        double delta = Math.pow(B, 2) - 4 * A * C;

        // Verifica se é possível calcular as raízes
        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            // Calcula as raízes
            double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);

            // Imprime as raízes com 5 dígitos após o ponto
            System.out.printf("R1 = %.5f%n", raiz1);
            System.out.printf("R2 = %.5f%n", raiz2);
        }

        scanner.close();
    }
}
