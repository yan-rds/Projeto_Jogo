package br.com.zup;

public class Npc {
   private double vidaMaxima;
   private double vidaAtual = vidaMaxima;
   private String nome;
   private int energiaEspecial;
   private int defesa;
   private int ataque;

    public Npc(double vidaMaxima, String nome, int energiaEspecial, int defesa, int ataque) {
        this.vidaMaxima = vidaMaxima;
        this.nome = nome;
        this.energiaEspecial = energiaEspecial;
        this.defesa = defesa;
        this.ataque = ataque;
    }

    public double getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(double vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public double getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(double vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergiaEspecial() {
        return energiaEspecial;
    }

    public void setEnergiaEspecial(int energiaEspecial) {
        this.energiaEspecial = energiaEspecial;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void receberDano (int danoAplicado){
        int porcentagemDeDefesa = 1 - (defesa/100);
        int danoRecebido = danoAplicado * porcentagemDeDefesa;
        vidaAtual -= danoRecebido;
    }
}
