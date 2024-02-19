package org.example.exercicio1.basic;

import java.util.*;

public class Exercicio7 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir três números inteiros
        for (int i = 0; i < 3; i++) {
            System.out.println("Insira um número inteiro:");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        // Encontra o maior número na lista
        int maior = Collections.max(numeros);

        // Imprime o maior número
        System.out.println("O maior número inserido é: " + maior);

        scanner.close();
    }
}
