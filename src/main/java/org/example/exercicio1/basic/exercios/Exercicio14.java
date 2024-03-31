package org.example.exercicio1.basic.exercios;

import java.io.*;

/*
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.

Entrada
O arquivo de entrada contém 2 valores inteiros.
 * Autor : Johana
 */
public class Exercicio14 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int A, B, PROD;

        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());

        PROD = A * B;

        System.out.printf("PROD = %d\n", PROD);
    }
}
