package br.com.zup;

public class Npc {
   private double vidaMaxima;
   private double vidaAtual = vidaMaxima;
   private String nome;
   private int energiaEspecial;
   private double defesa;
   private double ataque;

    public Npc(double vidaMaxima, String nome, int energiaEspecial, double defesa, double ataque) {
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

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void receberDano (int danoAplicado){
        double porcentagemDeDefesa = 1 - (defesa/100);
        double danoRecebido = danoAplicado * porcentagemDeDefesa;
        vidaAtual -= danoRecebido;
    }
}
