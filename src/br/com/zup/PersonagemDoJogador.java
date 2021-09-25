package br.com.zup;

public class PersonagemDoJogador extends Npc{
    private int dinheiro;
    private String classe;
    private double mana;

    public PersonagemDoJogador(double vidaMaxima, String nome, int energiaEspecial, int defesa, int ataque, int dinheiro, String classe, double mana) {
        super(vidaMaxima, nome, energiaEspecial, defesa, ataque);
        this.dinheiro = dinheiro;
        this.classe = classe;
        this.mana = mana;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }


}
