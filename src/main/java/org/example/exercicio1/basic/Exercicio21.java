package org.example.exercicio1.basic;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();

        double volume = (4.0/3.0) * PI * Math.pow(raio, 3);

        System.out.println("VOLUME= " + volume);
    }
}
