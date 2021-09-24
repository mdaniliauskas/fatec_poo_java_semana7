package com.semana7.animal;

public class TesteMamifero {

    public static void main(String[] args) {
        Gato gato = new Gato("Bichano");
        Cachorro cachorro = new Cachorro("Totó");

        System.out.printf("O gato %s tem %d patas\n", gato.getNome(), gato.getPatas());
        System.out.printf("O cachorro %s tem %d patas\n", cachorro.getNome(), cachorro.getPatas());
    }

}
