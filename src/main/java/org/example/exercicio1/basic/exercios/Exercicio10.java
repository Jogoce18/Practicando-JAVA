package org.example.exercicio1.basic.exercios;

import java.util.Scanner;

/*
 * Escreva um programa que solicite ao usuário para inserir uma palavra e conte o número de consoantes (letras que não são vogais) nessa palavra.
 * Autor : Johana
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma palavra:");

        String palavra = scanner.nextLine();

        int contadorConsoantes = consoantes(palavra);

        System.out.println("Número de consoantes na palavra: " + contadorConsoantes);

        scanner.close();
    }

    public static int consoantes(String palavra) {
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char caractere = palavra.toLowerCase().charAt(i);
            if (caractere >= 'a' && caractere <= 'z' && caractere != 'a' && caractere != 'e' && caractere != 'i' && caractere != 'o' && caractere != 'u') {
                contador++;
            }
        }
        return contador;
    }
}
