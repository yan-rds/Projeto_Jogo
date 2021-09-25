package br.com.zup;

public class Inimigo extends Npc{
    private int invocarAliados;
    private boolean invocacaoAtiva = false;
    private int regeneracao;

    public Inimigo(double vidaMaxima, String nome, int energiaEspecial, int defesa, int ataque, int invocarAliados, boolean invocacaoAtiva, int regeneracao) {
        super(vidaMaxima, nome, energiaEspecial, defesa, ataque);
        this.invocarAliados = invocarAliados;
        this.invocacaoAtiva = invocacaoAtiva;
        this.regeneracao = regeneracao;
    }

    public int getInvocarAliados() {
        return invocarAliados;
    }

    public void setInvocarAliados(int invocarAliados) {
        this.invocarAliados = invocarAliados;
    }

    public int getRegeneracao() {
        return regeneracao;
    }

    public void setRegeneracao(int regeneracao) {
        this.regeneracao = regeneracao;
    }

    public void invocacao(){

        double metadeDaVida = getVidaAtual()*0.5;
        double vidaCritica = getVidaAtual()*0.25;
        double morrendo = getVidaAtual()*0.1;

        if (getVidaAtual() < metadeDaVida & getVidaAtual() > vidaCritica){
            invocarAliados = 1;
            invocacaoAtiva = true;
        }
        else if (getVidaAtual() < vidaCritica & getVidaAtual() > morrendo){
            invocarAliados = 3;
            invocacaoAtiva = true;
        }
        else if (getVidaAtual() < morrendo){
            invocarAliados = 5;
            invocacaoAtiva = true;
        }
        else {
            invocacaoAtiva = false;
            invocarAliados = 0;
        }
    }

    public void regeneracao(){
        if (invocacaoAtiva){
            double porcentagemRenegeracao = getVidaMaxima() * 0.05;
            setVidaAtual(getVidaAtual() + porcentagemRenegeracao);
        }

    }

    public double especialFraco(){
        return getAtaque() * 1.2;
    }

    public double especialMedio(){
        return getAtaque() * 1.5;
    }

    public double especialForte(){
        return getAtaque() * 2;
    }





}
