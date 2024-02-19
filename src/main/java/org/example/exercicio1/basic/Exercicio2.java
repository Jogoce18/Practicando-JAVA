package org.example.exercicio1.basic;
/*
 * Escreva um programa que peça ao usuário para inserir seu nome e depois imprima uma saudação com o nome fornecido.
 * Autor: Johana
 */


import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "! Bem-vindo ao programa.");
        scanner.close();
    }
}
