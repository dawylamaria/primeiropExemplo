package br.edu.fescfafic.animal.Model;

public class Leao extends Animal{

    public String  corDoPelo;

    public Leao(String nome, int idade, String especie, String corDoPelo){
        super(nome, idade, especie);
        this.corDoPelo = corDoPelo;
    }
}
