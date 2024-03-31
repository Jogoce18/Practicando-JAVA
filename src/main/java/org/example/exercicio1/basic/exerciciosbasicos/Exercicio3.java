package org.example.exercicio1.basic.exerciciosbasicos;

/*
 * Escreva um programa que peça ao usuário para inserir dois números inteiros e depois imprima a soma desses números.
 * Autor: Johana
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira um número inteiro: ");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, insira outro número inteiro: ");
        int number2 = Integer.parseInt(scanner.nextLine());

        int soma = number1 + number2;

        System.out.println("A soma dos números é: " + soma);

        scanner.close(); // Fechar o Scanner quando terminar de usá-lo
    }
}
