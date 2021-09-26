package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PersonagemDoJogador jogador = new PersonagemDoJogador(100, "yan", 0, 10, 20, 500, "Guerreiro", 100);
        Inimigo vilao = new Inimigo(70, "vilao", 0, 10, 20);
        Sistema system = new Sistema(vilao, jogador);

        vilao.setVidaAtual(vilao.getVidaMaxima());
        for (int i = 0; i<15; i++){
            System.out.println("invocar aliados: "+vilao.getInvocarAliados());
            System.out.println("Defesa: " + vilao.getDefesa());
            vilao.receberDano(jogador.getAtaque());
            System.out.println(vilao.getVidaAtual());
            system.turnoVilao();

        }



    }
}
