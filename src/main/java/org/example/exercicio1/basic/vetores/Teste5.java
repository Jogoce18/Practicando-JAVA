package org.example.exercicio1.basic.vetores;

public class Teste5 {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);
        vetor.adiciona(0,"A");
        System.out.println(vetor);
        vetor.adiciona(3,"D");
        System.out.println(vetor);


    }
}
