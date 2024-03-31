package org.example.exercicio1.basic.exercios;

import java.io.*;
import java.util.Scanner;

/*
 * Autor : Johana
 * Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.
 */
public class Exercicio15 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double MEDIA = (A * 3.5 + B * 7.5) / 11;

        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}
