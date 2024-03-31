package org.example.exercicio1.basic.exercios;


import java.io.*;

/*
Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.
 * Autor : Johana
 */
public class Exercicio13 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int A, B, SOMA;

        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());

        SOMA = A + B;

        System.out.printf("SOMA = %d\n", SOMA);
    }
}
