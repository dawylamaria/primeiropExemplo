package br.edu.fescfafic.animal.Model;

public class Gato extends Animal{

    public String corDoPelo;

    public Gato(String nome, int idade, String especie, String corDoPelo){
        super(nome, idade, especie);
        this.corDoPelo = corDoPelo;
    }
}
