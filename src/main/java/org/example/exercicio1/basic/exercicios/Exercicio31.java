package org.example.exercicio1.basic.exercicios;
/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.


 */


import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        double valor = scanner.nextDouble();

        // Calcula a quantidade de cada nota e moeda necessária
        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidadeNotas = (int) (valor / nota);
            System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ".00");
            valor %= nota;
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int quantidadeMoedas = (int) (valor / moeda);
            System.out.println(quantidadeMoedas + " moeda(s) de R$ " + String.format("%.2f", moeda));
            valor %= moeda;
        }

        scanner.close();
    }
}
