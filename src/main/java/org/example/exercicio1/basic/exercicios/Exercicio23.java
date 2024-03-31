package org.example.exercicio1.basic.exercicios;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scnanner = new Scanner(System.in);
        int A , B, C;
        A = scnanner.nextInt();
        B = scnanner.nextInt();
        C = scnanner.nextInt();

        int maiorAB = ((A + B + Math.abs(A-B))/2);
        int maiorResusul = ((maiorAB + C + Math.abs(maiorAB-C))/2);

        System.out.println(maiorResusul + " eh o maior");

    }
}
