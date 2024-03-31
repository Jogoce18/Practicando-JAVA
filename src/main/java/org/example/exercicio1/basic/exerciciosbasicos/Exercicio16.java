package org.example.exercicio1.basic.exerciciosbasicos;

import java.util.Scanner;

/*
 * Autor : Johana
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
 */
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A, B, C;

        // Lê as notas do aluno
        A = lerNota(scanner);
        B = lerNota(scanner);
        C = lerNota(scanner);

        double MEDIA = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5);

        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }

    // Método para ler uma nota e verificar se está no intervalo de 0 a 10.0
    private static double lerNota(Scanner scanner) {
        double nota;
        do {
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 10.0);
        return nota;
    }

}
