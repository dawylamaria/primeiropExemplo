package br.edu.fescfafic.animal.Model;

public abstract class Animal {
    public String nome;
    public int idade;
    public String especie;

    public Animal (String nome, int idade, String especie){
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public void emitirSom(){
        System.out.printf("%s emitiu som!\n", nome);
    }

}
