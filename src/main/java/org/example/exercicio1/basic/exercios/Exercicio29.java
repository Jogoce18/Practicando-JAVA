package org.example.exercicio1.basic.exercios;

import java.util.Scanner;

/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        int tempoSegundos = scanner.nextInt();

        // Calcula horas, minutos e segundos
        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600) / 60;
        int segundos = tempoSegundos % 60;

        // Imprime o resultado formatado
        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        scanner.close();
    }
}
