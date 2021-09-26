package br.com.zup;

public class Inimigo extends Npc{
    private int invocarAliados;
    private boolean invocacaoAtiva = false;
    private int contadorEspecialFraco = 4;
    private int contadorEspecialMedio = 0;
    private int contadorEspecialForte = 0;

    public Inimigo(double vidaMaxima, String nome, int energiaEspecial, int defesa, int ataque) {
        super(vidaMaxima, nome, energiaEspecial, defesa, ataque);

    }

    public boolean isInvocacaoAtiva() {
        return invocacaoAtiva;
    }

    public void setInvocacaoAtiva(boolean invocacaoAtiva) {
        this.invocacaoAtiva = invocacaoAtiva;
    }

    public int getContadorEspecialFraco() {
        return contadorEspecialFraco;
    }

    public void setContadorEspecialFraco(int contadorEspecialFraco) {
        this.contadorEspecialFraco = contadorEspecialFraco;
    }

    public int getContadorEspecialMedio() {
        return contadorEspecialMedio;
    }

    public void setContadorEspecialMedio(int contadorEspecialMedio) {
        this.contadorEspecialMedio = contadorEspecialMedio;
    }

    public int getContadorEspecialForte() {
        return contadorEspecialForte;
    }

    public void setContadorEspecialForte(int contadorEspecialForte) {
        this.contadorEspecialForte = contadorEspecialForte;
    }

    public int getInvocarAliados() {
        return invocarAliados;
    }

    public void setInvocarAliados(int invocarAliados) {
        this.invocarAliados = invocarAliados;
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

    public double ataqueBasico(){
        setEnergiaEspecial(getEnergiaEspecial()+20);
        System.out.println("ataque basico");
        return getAtaque();
    }
    public double especialFraco(){
        contadorEspecialFraco = 0;
        System.out.println("Especial fraco");
        return getAtaque() * 1.2;
    }

    public double especialMedio(){
        contadorEspecialMedio = 0;
        System.out.println("Especial medio");
        return getAtaque() * 1.5;
    }

    public double especialForte(){
        contadorEspecialForte = 0;
        System.out.println("Especial forte");
        return getAtaque() * 2;
    }

    public void aumentarContador(){
        contadorEspecialForte++;
        contadorEspecialMedio++;
        contadorEspecialFraco++;

    }





}
