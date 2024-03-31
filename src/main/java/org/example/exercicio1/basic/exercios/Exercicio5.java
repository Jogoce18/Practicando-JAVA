package org.example.exercicio1.basic.exercios;

import java.util.Scanner;

/*
 * Escreva um programa que leia o raio de um círculo e calcule e imprima a área desse círculo.
 * Autor: Johana
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * raio * raio;
        System.out.println("A área do círculo é: " + area);

        scanner.close(); // Fechar o Scanner quando terminar de usá-lo
    }
}