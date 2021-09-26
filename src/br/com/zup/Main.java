package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PersonagemDoJogador jogador = new PersonagemDoJogador(100, "yan", 0, 0, 20, 500, "Guerreiro", 100);
        Inimigo vilao = new Inimigo(100, "vilao", 0, 10, 20);
        Sistema system = new Sistema(vilao, jogador);

        system.menuDeCompras();
    }
}
