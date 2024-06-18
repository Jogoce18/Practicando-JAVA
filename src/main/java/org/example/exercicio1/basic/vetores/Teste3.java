package org.example.exercicio1.basic.vetores;

public class Teste3 {
    public static void main(String[] args) {
        try {
            Vetor vetor = new Vetor(5);
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            System.out.println(vetor.busca(1));
     ;
        }catch (Exception e ){
            e.printStackTrace();
        }

    }
}
