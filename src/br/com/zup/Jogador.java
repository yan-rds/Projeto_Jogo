package br.com.zup;

public class Jogador extends Personagem {
    private int dinheiro;
    private double defesaBase;
    private String classe;
    private double mana;
    private boolean defender = false;
    private int pocaoDeVida;
    private int pocaoDeMana;
    private int pocaoDePoder;
    private boolean giroCortante = false;
    private boolean rouboDeVida = false;
    private boolean relampago = false;
    private boolean cura = false;
    private int turnosPocaoPoder;

    public Jogador(double vidaMaxima, String nome, int energiaEspecial, double defesa, double ataque) {
        super(vidaMaxima, nome, energiaEspecial, defesa, ataque);
    }

    public boolean isGiroCortante() {
        return giroCortante;
    }

    public void setGiroCortante(boolean giroCortante) {
        this.giroCortante = giroCortante;
    }

    public double getDefesaBase() {
        return defesaBase;
    }

    public void setDefesaBase(double defesaBase) {
        this.defesaBase = defesaBase;
    }

    public int getTurnosPocaoPoder() {
        return turnosPocaoPoder;
    }

    public void setTurnosPocaoPoder(int turnosPocaoPoder) {
        this.turnosPocaoPoder = turnosPocaoPoder;
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

    public double utilizarRelampago (){
        return getAtaque()*2;
    }
    public void utilizarCura (){
        double vidaCurada = getAtaque();
        setVidaAtual(getVidaAtual() + vidaCurada);
    }
    public void aumentoPoder(){
        while (turnosPocaoPoder > 0) {
            double aumentoDeAtaque = getAtaque() * 0.2;
            setAtaque(getAtaque() + aumentoDeAtaque);
            turnosPocaoPoder--;
        }
    }
    public void regenerarMana(){
        double manaRegenerada = 10;
        setMana(getMana() + manaRegenerada);
    }

}
