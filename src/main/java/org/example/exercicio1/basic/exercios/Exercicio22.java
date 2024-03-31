package org.example.exercicio1.basic.exercios;

import java.util.Scanner;
/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;
        Double A , B , C;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();


        // Calcular las áreas según las fórmulas dadas
        double areaTriangulo = (A * C) / 2;
        double areaCirculo = PI * Math.pow(C, 2);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;

        // Mostrar los resultados
        System.out.println("TRIANGULO: " + String.format("%.3f", areaTriangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", areaCirculo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", areaTrapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", areaQuadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", areaRetangulo));

        scanner.close();


    }
}
