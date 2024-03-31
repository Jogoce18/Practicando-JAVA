package org.example.exercicio1.basic.exercios;

import java.util.Scanner;

/*
Escreva um programa que solicite ao usuário que insira um número e verifique se é positivo, negativo ou zero. Em seguida, imprima uma mensagem correspondente.
Autor = Johana
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero: ");

        // Verifica se o próximo token de entrada é um número inteiro
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("Numero negativo");
            } else if (numero == 0) {
                System.out.println("Numero é 0");
            } else {
                System.out.println("Numero positivo ");
            }
        } else {
            System.out.println("Por favor, insira um número inteiro válido.");
        }

        scanner.close();
    }
}
