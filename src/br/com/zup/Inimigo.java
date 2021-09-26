package br.com.zup;

public class Inimigo extends Npc{
    private int invocarAliados;
    private boolean invocacaoAtiva = false;
    private int contadorEspecialFraco = 4;
    private int contadorEspecialMedio = 0;
    private int contadorEspecialForte = 0;
    private boolean invocacaoSimples = true;
    private boolean invocacaoMedia = true;
    private boolean invocacaoForte = true;

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


    public void realizarInvocacao(){

        double metadeDaVida = getVidaMaxima()*0.5;
        double vidaCritica = getVidaMaxima()*0.30;
        double morrendo = getVidaMaxima()*0.1;

        if (getVidaAtual() < metadeDaVida & getVidaAtual() > vidaCritica & invocacaoSimples){
            setInvocarAliados(getInvocarAliados() + 1);
            invocacaoAtiva = true;
            invocacaoSimples = false;
            System.out.println("Arrrg! Me defenda!");
            System.out.println("O " + getNome() + " invocou " + invocarAliados + " lacaio para defendê-lo");
        }
        else if (getVidaAtual() < vidaCritica & getVidaAtual() > morrendo & invocacaoMedia){
            setInvocarAliados(getInvocarAliados() + 3);
            invocacaoAtiva = true;
            invocacaoMedia = false;
            System.out.println("GRRR! Venham mais!");
            System.out.println("O " + getNome() + " invocou " + invocarAliados + " lacaios para defendê-lo");
        }
        else if (getVidaAtual() < morrendo & invocacaoForte){
            setInvocarAliados(getInvocarAliados() + 5);
            invocacaoAtiva = true;
            invocacaoMedia = false;
            invocacaoForte = false;
            System.out.println("Todos! Venham todos AGORA!!!");
            System.out.println("O " + getNome() + " invocou " + invocarAliados + " lacaios para defendê-lo");
        }
        else if (invocarAliados == 0) {
            invocacaoAtiva = false;
        }
    }

    public void regeneracao(){
        if (invocacaoAtiva){
            double vidaRegenerada = getVidaMaxima() * 0.1;
            setVidaAtual(getVidaAtual() + vidaRegenerada);
            System.out.println("O "+getNome()+" está se regenerando");
        }
    }

    public void utilizarInvocacao(){
        if (invocarAliados > 0){
            setDefesa(100);
            invocarAliados --;
        }
        else{
            setDefesa(10);
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
