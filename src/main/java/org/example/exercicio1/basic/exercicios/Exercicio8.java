package org.example.exercicio1.basic.exercicios;

import java.util.*;

/*
 * Escreva um programa que solicite ao usuário que insira cinco números inteiros e depois imprima o menor desses cinco números.
 * Autor: Johana
 */
public class Exercicio8 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i < 5; i++){ // Corrigindo a condição para i < 5
            System.out.println("Inserir um numero: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        // Encontra o menor número na lista
        int menor = Collections.min(numeros);

        // Imprime o menor número
        System.out.println("O menor número inserido é: " + menor);

        scanner.close();
    }
}
