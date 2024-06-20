package org.example.exercicio1.basic.vetores;



public class Vetor {
    private String[] elementos;
    private int tamanho;
    public  Vetor(int capacidade){
        this.elementos = new  String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(String elemento) throws Exception {
        this.aumentaCapacidde();
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else {
            throw new Exception("Vetor já esta cheio, não é possivel adicionar mais elementos");
        }
    }
    public int tamanho(){
        return this.tamanho;
    }
    public String busca (int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.elementos[posicao];
    }
    public int busca(String elemento){
        for(int i = 0; i<this.tamanho; i++){
            if(this.elementos[i].equals((elemento))){
                return i;
            }
        }
        return -1;
    }
    public boolean adiciona(int posicao, String elemento){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        this.aumentaCapacidde();
        //mover todos os elementos
        for(int i = this.tamanho; i>=posicao; i-- ){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return false;
    }
    private void aumentaCapacidde(){
        if(this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for(int i=0 ; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        for(int i = posicao; i<this.tamanho-1;i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i = 0; i<this.tamanho-1; i++){
            s.append (this.elementos[i]);
            s.append(",");
        }
        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");
        return  s.toString();
    }
}
