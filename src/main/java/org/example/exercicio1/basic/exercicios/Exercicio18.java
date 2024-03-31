package org.example.exercicio1.basic.exercicios;

import java.util.Scanner;

/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
 Autor: johana
 */
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo os valores de entrada
        int numeroFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double valorPorHora = scanner.nextDouble();

        // Calculando o salário
        double salario = horasTrabalhadas * valorPorHora;

        // Imprimindo o número e o salário formatado com duas casas decimais
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = Uutil$ %.2f%n", salario);

        scanner.close();


    }
}
