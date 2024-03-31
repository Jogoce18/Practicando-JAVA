package org.example.exercicio1.basic.exerciciosbasicos;

import java.util.Scanner;

/*
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 Autor: Johana
 */

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, D, PROD1, PROD2, DIFERENCA;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        PROD1 = A * B;
        PROD2 = C * D;

        DIFERENCA = PROD1 - PROD2;

        System.out.println("DIFERENCA java= " + DIFERENCA);


    }
}
