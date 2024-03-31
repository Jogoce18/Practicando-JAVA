package org.example.exercicio1.basic.exercicios;

import java.io.*;
/*
A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
 * Autor : Johana
 */

public class Exercicio12 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        Double n = 3.14159;
        Double raio, A;

        raio = Double.parseDouble(in.readLine());

        A = n * raio * raio;

        System.out.printf("A=%.4f\n", A); // Formata a saída para exibir apenas quatro casas decimais
    }
}
