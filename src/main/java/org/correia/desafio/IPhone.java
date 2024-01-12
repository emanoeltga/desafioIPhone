package org.correia.desafio;

import org.correia.desafio.interfaces.Navegador;
import org.correia.desafio.interfaces.ReprodutorMusica;
import org.correia.desafio.interfaces.Telefone;

public class IPhone implements Telefone, ReprodutorMusica, Navegador {
    @Override
    public String ligar(String numero) {
        return "Ligando para o número "+numero;
    }

    @Override
    public String atender(String numero) {
        return "Atendendo o número: "+numero;
    }

    @Override
    public String iniciarCorreioVoz(String numero) {
        return "Ligando para o correio de Voz do número  "+numero;
    }

    @Override
    public String tocar(String musica) {
        return "Tocando a Musica "+ musica;
    }

    @Override
    public String pausar(String musica) {
        return "Pausando a Musica "+ musica;
    }

    @Override
    public String selecionarMusica() {
        return "Selecione ma das musicas: \n  01 - Eu tenho que me decidir\n  02 - Dois Fugitivos";
    }

    @Override
    public String abrirPagina(String pesquisa) {
        return "Pesquisando "+pesquisa;
    }

    @Override
    public String abrirNovaAba() {
        return "Abrindo nova Guia";
    }

    @Override
    public String atualizarPagina() {
        return "Atualizando Paginas";
    }
}
