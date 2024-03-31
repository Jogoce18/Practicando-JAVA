package org.example.exercicio1.basic.exerciciosbasicos;

import java.util.Scanner;

/*
*Escreva um programa que solicite ao usuário para inserir uma frase e conte o número de vogais (a, e, i, o, u) nessa frase.
* Autor : Johana
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma frase:");
        String frase = scanner.nextLine();

        int contadorVogais = contarVogais(frase);

        System.out.println("Número de vogais na frase: " + contadorVogais);

        scanner.close();
    }

    public static int contarVogais(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.toLowerCase().charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
