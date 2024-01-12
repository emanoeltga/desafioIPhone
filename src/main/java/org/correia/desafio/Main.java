package org.correia.desafio;

public class Main {
    static IPhone iPhone;
    public static void main(String[] args) {

        iPhone = new IPhone();
        System.out.println(iPhone.atender("65 9 9999-2522"));
        System.out.println(iPhone.ligar("65 9 9999-2522"));
        System.out.println(iPhone.iniciarCorreioVoz("65 9 9999-2522"));

        System.out.println(iPhone.selecionarMusica());
        System.out.println(iPhone.tocar("Eu tenho que me decidir"));
        System.out.println(iPhone.pausar("Eu tenho que me decidir"));

        System.out.println(iPhone.abrirPagina("facebook"));
        System.out.println(iPhone.abrirNovaAba());
        System.out.println(iPhone.atualizarPagina());

    }
}