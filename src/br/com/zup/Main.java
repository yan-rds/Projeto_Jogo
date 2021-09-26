package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Jogador jogador = new Jogador(0, "", 0, 0, 0);
        Inimigo vilao = new Inimigo(250, "", 0, 30, 40, 250);
        Sistema system = new Sistema(vilao, jogador);

        system.introducao();
        system.criacaoDoPersonagem();
        system.menuDeCompras();
        system.inicioDaBatalha();
        system.batalha();
        system.resultado();

    }
}
