package br.edu.fescfafic.animal.Main;
import br.edu.fescfafic.animal.Model.*;
public class Main {
    public static void main(String[] args) {

       Cachorro cachorro1 = new Cachorro("toto", 4, "cachorro" , "preto");



       Gato gato1 = new Gato ("golias", 2, "gato", "marrom");



       Leao leao1 = new Leao ("dudu", 5, "leao", "amarelo");


       cachorro1.emitirSom();
       gato1.emitirSom();
       leao1.emitirSom();

    }
}