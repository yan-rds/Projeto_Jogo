package br.com.zup;

public class PersonagemDoJogador extends Npc{
    private int dinheiro;
    private String classe;
    private double mana;
    private boolean defender = false;
    private int pocaoDeVida;
    private int pocaoDeMana;
    private int pocaoDePoder;
    private boolean rouboDeVida = false;
    private boolean relampago = false;
    private boolean cura = false;

    public PersonagemDoJogador(double vidaMaxima, String nome, int energiaEspecial, double defesa, double ataque, int dinheiro, String classe, double mana) {
        super(vidaMaxima, nome, energiaEspecial, defesa, ataque);
        this.dinheiro = dinheiro;
        this.classe = classe;
        this.mana = mana;
    }

    public boolean isRouboDeVida() {
        return rouboDeVida;
    }

    public void setRouboDeVida(boolean rouboDeVida) {
        this.rouboDeVida = rouboDeVida;
    }

    public boolean isRelampago() {
        return relampago;
    }

    public void setRelampago(boolean relampago) {
        this.relampago = relampago;
    }

    public boolean isCura() {
        return cura;
    }

    public void setCura(boolean cura) {
        this.cura = cura;
    }

    public int getPocaoDeVida() {
        return pocaoDeVida;
    }

    public void setPocaoDeVida(int pocaoDeVida) {
        this.pocaoDeVida = pocaoDeVida;
    }

    public int getPocaoDeMana() {
        return pocaoDeMana;
    }

    public void setPocaoDeMana(int pocaoDeMana) {
        this.pocaoDeMana = pocaoDeMana;
    }

    public int getPocaoDePoder() {
        return pocaoDePoder;
    }

    public void setPocaoDePoder(int pocaoDePoder) {
        this.pocaoDePoder = pocaoDePoder;
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

    public boolean isDefender() {
        return defender;
    }

    public void setDefender(boolean defender) {
        this.defender = defender;
    }
}
