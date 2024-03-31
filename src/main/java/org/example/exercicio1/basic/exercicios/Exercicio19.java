package org.example.exercicio1.basic.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
Autor: Johana
 */
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Lendo os valores de entrada
        String nomeVendedor = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        // Calculando o total a receber (salário fixo + comissão)
        double comissao = totalVendas * 0.15;
        double totalReceber = salarioFixo + comissao;

        // Imprimindo o total a receber formatado com duas casas decimais
        System.out.printf("TOTAL = R$ %.2f%n", totalReceber);

        scanner.close();
    }
}
