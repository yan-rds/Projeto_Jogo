package br.com.zup;

public class Inimigo extends Personagem {
    private double vidaAtual;
    private int invocarAliados;
    private boolean invocacaoAtiva = false;
    private int contadorEspecialFraco = 4;
    private int contadorEspecialMedio = 0;
    private int contadorEspecialForte = 0;
    private boolean invocacaoSimples = true;
    private boolean invocacaoMedia = true;
    private boolean invocacaoForte = true;

    public Inimigo(double vidaMaxima, String nome, int energiaEspecial, int defesa, int ataque, double vidaAtual) {
        super(vidaMaxima, nome, energiaEspecial, defesa, ataque);
        this.vidaAtual = vidaAtual;

    }


    @Override
    public double getVidaAtual() {
        return vidaAtual;
    }

    @Override
    public void setVidaAtual(double vidaAtual) {
        this.vidaAtual = vidaAtual;
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


    public void realizarInvocacao(){

        double metadeDaVida = getVidaMaxima()*0.5;
        double vidaCritica = getVidaMaxima()*0.30;
        double morrendo = getVidaMaxima()*0.1;

        if (getVidaAtual() < metadeDaVida & getVidaAtual() > vidaCritica & invocacaoSimples){
            setInvocarAliados(getInvocarAliados() + 1);
            invocacaoAtiva = true;
            invocacaoSimples = false;
            System.out.println("Arrrg! Me defenda!");
            System.out.println("O " + getNome() + " invocou " + invocarAliados + " lacaio para defend??-lo");
        }
        else if (getVidaAtual() < vidaCritica & getVidaAtual() > morrendo & invocacaoMedia){
            setInvocarAliados(getInvocarAliados() + 3);
            invocacaoAtiva = true;
            invocacaoMedia = false;
            System.out.println("GRRR! Venham mais!");
            System.out.println("O " + getNome() + " invocou " + invocarAliados + " lacaios para defend??-lo");
        }
        else if (getVidaAtual() < morrendo & invocacaoForte){
            setInvocarAliados(getInvocarAliados() + 5);
            invocacaoAtiva = true;
            invocacaoMedia = false;
            invocacaoForte = false;
            System.out.println("Todos! Venham todos AGORA!!!");
            System.out.println("O " + getNome() + " invocou " + invocarAliados + " lacaios para defend??-lo");
        }
        else if (invocarAliados == 0) {
            invocacaoAtiva = false;
        }
    }

    public void regeneracao(){
        if (invocacaoAtiva){
            double vidaRegenerada = getVidaMaxima() * 0.1;
            setVidaAtual(getVidaAtual() + vidaRegenerada);
            System.out.println("O "+getNome()+" est?? se regenerando");
        }
    }

    public void utilizarInvocacao(){
        if (invocarAliados > 0){
            setDefesa(100);
            invocarAliados --;
        }
        else{
            setDefesa(30);
        }
    }

    public double ataqueBasico(){
        setEnergiaEspecial(getEnergiaEspecial()+20);
        System.out.println(getNome()+ " ergueu a espada e avan??ou em sua dire????o");
        return getAtaque();
    }
    public double especialFraco(){
        contadorEspecialFraco = 0;
        System.out.println("HAHAHAHAHA CORTE CRUZADO!");
        return getAtaque() * 1.2;
    }

    public double especialMedio(){
        contadorEspecialMedio = 0;
        System.out.println("?? SEU FIM! EXPLOS??O FOCALIZADA!");
        return getAtaque() * 1.5;
    }

    public double especialForte(){
        contadorEspecialForte = 0;
        System.out.println("EU ADMITO QUE VOCE FOI PERSISTENTE, MAS ACABA AGORA!");
        return getAtaque() * 2;
    }

    public void aumentarContador(){
        contadorEspecialForte++;
        contadorEspecialMedio++;
        contadorEspecialFraco++;

    }





}
