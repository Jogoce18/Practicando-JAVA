package org.example.exercicio1.basic.vetores;

public class Teste8 {
    public static void main(String[] args) throws Exception {
        VetorObjetos vetor = new VetorObjetos(3);
        vetor.adiciona(3);
        vetor.adiciona(4);
        vetor.adiciona(5);
        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);

    }
}
