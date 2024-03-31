package org.example.exercicio1.basic.exercicioslistas;

import java.util.ArrayList;
import java.util.Collections;

public class ExerciciosListas {
    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        exercicio6();
        exercicio7();
        exercicio8();
        exercicio9();
        exercicio10();
    }

    // Exercício 1: Soma de Elementos em uma Lista
    public static void exercicio1() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        int soma = 0;
        for (int num : lista) {
            soma += num;
        }
        System.out.println("Soma: " + soma);
    }

    // Exercício 2: Maior e Menor Elemento em uma Lista
    public static void exercicio2() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(3);
        lista.add(9);
        lista.add(2);
        lista.add(7);

        int maior = Collections.max(lista);
        int menor = Collections.min(lista);

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }

    // Exercício 3: Verificar se uma Lista está em Ordem Crescente
    public static void exercicio3() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(3);
        lista.add(5);
        lista.add(7);
        lista.add(2);

        boolean emOrdemCrescente = true;
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i + 1)) {
                emOrdemCrescente = false;
                break;
            }
        }

        if (emOrdemCrescente) {
            System.out.println("A lista está em ordem crescente.");
        } else {
            System.out.println("A lista NÃO está em ordem crescente.");
        }
    }

    // Exercício 4: Remover Duplicatas de uma Lista
    public static void exercicio4() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(4);

        ArrayList<Integer> listaSemDuplicatas = new ArrayList<>();
        for (int num : lista) {
            if (!listaSemDuplicatas.contains(num)) {
                listaSemDuplicatas.add(num);
            }
        }

        System.out.println("Lista original: " + lista);
        System.out.println("Lista sem duplicatas: " + listaSemDuplicatas);
    }

    // Exercício 5: Média dos Elementos em uma Lista
    public static void exercicio5() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        double soma = 0;
        for (int num : lista) {
            soma += num;
        }
        double media = soma / lista.size();
        System.out.println("Média: " + media);
    }

    // Exercício 6: Inverter uma Lista
    public static void exercicio6() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        Collections.reverse(lista);
        System.out.println("Lista invertida: " + lista);
    }

    // Exercício 7: Buscar um Elemento em uma Lista
    public static void exercicio7() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        int elementoProcurado = 3;
        if (lista.contains(elementoProcurado)) {
            System.out.println("O elemento " + elementoProcurado + " está presente na lista.");
        } else {
            System.out.println("O elemento " + elementoProcurado + " NÃO está presente na lista.");
        }
    }

    // Exercício 8: Ordenar uma Lista em Ordem Crescente
    public static void exercicio8() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(3);
        lista.add(9);
        lista.add(2);
        lista.add(7);

        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);
    }

    // Exercício 9: Contar o Número de Ocorrências de um Elemento em uma Lista
    public static void exercicio9() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(4);

        int elementoProcurado = 2;
        int contador = 0;
        for (int num : lista) {
            if (num == elementoProcurado) {
                contador++;
            }
        }
        System.out.println("Ocorrências do elemento " + elementoProcurado + ": " + contador);
    }

    // Exercício 10: Calcular a Mediana de uma Lista
    public static void exercicio10() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(3);
        lista.add(2);
        lista.add(5);
        lista.add(4);

        Collections.sort(lista);
        double mediana;
        if (lista.size() % 2 == 0) {
            mediana = (lista.get(lista.size() / 2 - 1) + lista.get(lista.size() / 2)) / 2.0;
        } else {
            mediana = lista.get(lista.size() / 2);
        }
        System.out.println("Mediana: " + mediana);
    }
}
