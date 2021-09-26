package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PersonagemDoJogador jogador = new PersonagemDoJogador(100, "yan", 0, 10, 20, 500, "Guerreiro", 100);
        Inimigo vilao = new Inimigo(70, "vilao", 0, 10, 20);
        Sistema system = new Sistema(vilao, jogador);

        jogador.setVidaAtual(jogador.getVidaMaxima());
        vilao.setVidaAtual(vilao.getVidaMaxima());

        while (vilao.getVidaAtual() > 0 & jogador.getVidaAtual() > 0){
            system.turnoJogador();
            system.turnoVilao();
        }

        if (jogador.getVidaAtual()<=0){
            System.out.println("Você foi derrotado");
        }
        else if (vilao.getVidaAtual()<=0){
            System.out.println("Você derrotou " + vilao.getNome());
        }





    }
}
