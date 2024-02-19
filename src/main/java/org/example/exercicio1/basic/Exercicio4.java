package org.example.exercicio1.basic;

import java.util.Scanner;

/*
 * Escreva um programa que converta uma temperatura em Celsius para Fahrenheit. O programa deve solicitar ao usuário que insira a temperatura em Celsius e, em seguida, imprimir a temperatura equivalente em Fahrenheit.
 * Autor: Johana
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = ((9.0/5.0) * temperaturaCelsius) + 32;
        System.out.println("A temperatura equivalente em Fahrenheit é: " + temperaturaFahrenheit);

        scanner.close(); // Fechar o Scanner quando terminar de usá-lo
    }
}
