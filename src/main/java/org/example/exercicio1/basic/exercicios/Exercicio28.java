package org.example.exercicio1.basic.exercicios;
/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */


import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        int valor = scanner.nextInt();

        // Array com os valores das notas
        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(valor);

        // Calcula a quantidade de cada nota necessária
        for (int nota : notas) {
            int quantidadeNotas = valor / nota;
            System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ",00");
            valor %= nota; // Atualiza o valor para o próximo loop
        }

        scanner.close();
    }
}
