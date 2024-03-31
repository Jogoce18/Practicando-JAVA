package org.example.exercicio1.basic.exerciciosbasicos;

import java.util.Scanner;

/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
 */
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanciaTotal;
        Double totalcombustivel;
        distanciaTotal = scanner.nextInt();
        totalcombustivel = scanner.nextDouble();

        Double consumoMedio = distanciaTotal / totalcombustivel;

        System.out.printf("%.3f km/l\n", consumoMedio);
        scanner.close();
    }
}
