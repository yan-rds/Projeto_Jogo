package br.com.zup;

import java.util.Scanner;

public class Sistema {
    Scanner leitor = new Scanner(System.in);
    private int preco;
    private Inimigo vilao;
    private PersonagemDoJogador jogador;

    public Sistema( Inimigo vilao, PersonagemDoJogador jogador) {
        this.vilao = vilao;
        this.jogador = jogador;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Inimigo getVilao() {
        return vilao;
    }

    public void setVilao(Inimigo vilao) {
        this.vilao = vilao;
    }

    public PersonagemDoJogador getJogador() {
        return jogador;
    }

    public void setJogador(PersonagemDoJogador jogador) {
        this.jogador = jogador;
    }

    public void menuDeCompras(){
        boolean menuCompras = true;
        while (menuCompras){
            int escolha;
            System.out.println("1 - Equipamentos");
            System.out.println("2 - Consumíveis");
            System.out.println("3 - Habilidades");
            System.out.println("4 - Finalizar compras");
            escolha = leitor.nextInt();

            switch (escolha) {
                case 1:
                    boolean menuEquipamentos = true;
                    while (menuEquipamentos) {
                        System.out.println("1 - Espada\n+15% de poder de ataque\nCusto: 80 de ouro");
                        System.out.println("2 - Cajado\n+30% de dano mágico\nCusto: 130 de ouro");
                        System.out.println("3- Escudo\nHabilita a opção de se defender de um ataque\nCusto: 80 de ouro");
                        System.out.println("4 - Lança\n+20% de poder de ataque\nCusto: 100 de ouro");
                        System.out.println("5 - Armadura de pano\n+15% de defesa\nCusto: 60 de ouro");
                        System.out.println("6 - Armadura de couro\n+25% de defesa\nCusto: 75 de ouro");
                        System.out.println("7 - Armadura de metal\n+50% de defesa\nCusto: 150 de ouro");
                        System.out.println("8 - Voltar para o menu anterior");
                        int escolhaEquipamento = leitor.nextInt();
                        switch (escolhaEquipamento){
                            case 1:
                                if (jogador.getDinheiro() < 80) {
                                    System.out.println("Dinheiro insuficiente");
                                } else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 80);
                                    jogador.setAtaque(jogador.getAtaque() * 1.15);
                                }
                                break;
                            case 2:
                                if (jogador.getDinheiro() < 130) {
                                    System.out.println("Dinheiro insuficiente");
                                } else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 130);
                                    jogador.setAtaque(jogador.getAtaque() * 1.30);
                                }
                                break;
                            case 3:
                                if (jogador.getDinheiro() < 80) {
                                    System.out.println("Dinheiro insuficiente");
                                } else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 80);
                                    jogador.setDefender(true);
                                }
                                break;
                            case 4:
                                if (jogador.getDinheiro() < 100) {
                                    System.out.println("Dinheiro insuficiente");
                                } else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 100);
                                    jogador.setAtaque(jogador.getAtaque() * 1.20);
                                }
                                break;
                            case 5:
                                if (jogador.getDinheiro() < 60) {
                                    System.out.println("Dinheiro insuficiente");
                                } else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 60);
                                    jogador.setDefesa(jogador.getDefesa() * 1.15);
                                }
                                break;
                            case 6:
                                if (jogador.getDinheiro() < 75) {
                                    System.out.println("Dinheiro insuficiente");
                                } else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 75);
                                    jogador.setDefesa(jogador.getDefesa() * 1.25);
                                }
                                break;
                            case 7:
                                if (jogador.getDinheiro() < 150) {
                                    System.out.println("Dinheiro insuficiente");
                                } else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 150);
                                    jogador.setDefesa(jogador.getDefesa() * 1.50);
                                }
                                break;
                            case 8:
                                menuEquipamentos = false;
                                break;
                            default:
                                System.out.println("Opção inválida");

                        }
                    }
                    break;
                case 2:
                    boolean menuConsumiveis = true;
                    while (menuConsumiveis) {
                        System.out.println("1 - Poção de vida\nRestaura uma parte da vida perdida\nCusto: 30 de ouro");
                        System.out.println("2 - Poção de mana\nRestaura uma parte da mana perdida\nCusto: 30 de ouro");
                        System.out.println("3 - Poção de poder\nAumenta o dano causado em 20% por 3 turnos\nCusto: 45 de ouro");
                        System.out.println("4 - Voltar ao menu anterior");
                        int escolhaConsumiveis = leitor.nextInt();
                        switch (escolhaConsumiveis) {
                            case 1:
                                if (jogador.getDinheiro() < 30) {
                                    System.out.println("Dinheiro insuficiente");
                                } else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 30);
                                    jogador.setPocaoDeVida(jogador.getPocaoDeVida() + 1);
                                }
                                break;
                            case 2:
                                if (jogador.getDinheiro() < 30) {
                                    System.out.println("Dinheiro insuficiente");
                                } else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 30);
                                    jogador.setPocaoDeMana(jogador.getPocaoDeMana() + 1);
                                }
                                break;
                            case 3:
                                if (jogador.getDinheiro() < 45) {
                                    System.out.println("Dinheiro insuficiente");
                                } else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 45);
                                    jogador.setPocaoDePoder(jogador.getPocaoDePoder() + 1);
                                }
                                break;
                            case 4:
                                menuConsumiveis = false;
                                break;

                        }
                    }
                    break;
                case 3:
                    boolean menuHabilidades = true;
                    while (menuHabilidades) {
                        System.out.println("1 - Roubo de vida\nCura 10% do dano causado\nCusto: 150 de ouro");
                        System.out.println("2 - Relâmpago\nCausa dano a todos os inimigos equivalente ao seu poder mágico\nCusto: 150 de ouro");
                        System.out.println("3 - Cura\nCura vida perdida baseado no seu poder mágico\nCusto: 200 de ouro");
                        System.out.println("4 - Voltar ao menu anterior");
                        int escolhaHabilidades = leitor.nextInt();
                        switch (escolhaHabilidades) {
                            case 1:
                                if (jogador.getDinheiro() < 150) {
                                    System.out.println("Dinheiro insuficiente");
                                    menuHabilidades = false;
                                }
                                else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 150);
                                    jogador.setRouboDeVida(true);
                                }
                                break;
                            case 2:
                                if (jogador.getDinheiro() < 150) {
                                    System.out.println("Dinheiro insuficiente");
                                    menuHabilidades = false;
                                }
                                else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 150);
                                    jogador.setRelampago(true);
                                }
                                break;
                            case 3:
                                if (jogador.getDinheiro() < 200) {
                                    System.out.println("Dinheiro insuficiente");
                                    menuHabilidades = false;
                                }
                                else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 200);
                                    jogador.setCura(true);
                                }
                                break;
                            case 4:
                                menuHabilidades = false;
                                break;
                        }
                    }
                    break;
                case 4:
                    menuCompras = false;
                    break;
            }
        }
    }

    public void turnoVilao(){
        getVilao().aumentarContador();

        // Métodos ofensivos do vilao
        if (vilao.getEnergiaEspecial() >= 60 & vilao.getContadorEspecialForte() > 3){
            getJogador().receberDano(getVilao().especialForte());
            vilao.setEnergiaEspecial(vilao.getEnergiaEspecial() - 60);
        }
        else if (vilao.getEnergiaEspecial() >= 40 & vilao.getContadorEspecialMedio() > 4){
            getJogador().receberDano(getVilao().especialMedio());
            vilao.setEnergiaEspecial(vilao.getEnergiaEspecial() - 30);
        }
        else if (vilao.getEnergiaEspecial() >= 40 & vilao.getContadorEspecialFraco() > 5){
            getJogador().receberDano(getVilao().especialFraco());
            vilao.setEnergiaEspecial(vilao.getEnergiaEspecial() - 30);
        }
        else if (vilao.getEnergiaEspecial()>=0){
            getJogador().receberDano(getVilao().ataqueBasico());
        }

        // Métodos defensivos do vilão
        vilao.realizarInvocacao();
        vilao.regeneracao();
        vilao.utilizarInvocacao();

    }

    public void turnoJogador(){
        boolean pocaoUtilizada = false;
        boolean acaoRealizada = false;
        getJogador().setDefesa(getJogador().getDefesaBase());

        while (!acaoRealizada){
        System.out.println("1 - Ataque físico");
        System.out.println("2 - Ataque especial");
        System.out.println("3 - Utilizar itens");
        System.out.println("4 - Defender");
        System.out.println("5 - Checar minha condição");
        int escolha = leitor.nextInt();

        switch (escolha){
            case 1:
                double vidaAntesDoAtaque = getVilao().getVidaAtual();
                getVilao().receberDano(getJogador().getAtaque());
                double vidaDepoisDoAtaque = getVilao().getVidaAtual();
                double danoCausado = vidaAntesDoAtaque - vidaDepoisDoAtaque;
                System.out.println("Você causou " + danoCausado + " de dano ao vilão");
                if (getJogador().isRouboDeVida() & danoCausado > 0){
                    double vidaCurada = danoCausado * 0.1;
                    getJogador().setVidaAtual(jogador.getVidaAtual() + vidaCurada);
                    System.out.println("Habilidade roubo de vida ativada");
                    System.out.println("Você curou " + vidaCurada + " de vida" );
                }
                acaoRealizada = true;
                break;
            case 2:
                if (jogador.isRelampago() & jogador.getMana() > 20){
                    System.out.println("A habilidade Relâmpago está disponível");
                }
                else if (jogador.isCura() & jogador.getMana() > 20){
                    System.out.println("A habilidade Cura está disponível");
                }
                else if (jogador.isRelampago() | jogador.isCura()){
                    System.out.println("Digite o nome da habilidade que deseja utilizar");
                    String habilidade = leitor.next();
                    if (habilidade.equalsIgnoreCase("Relâmpago") | habilidade.equalsIgnoreCase("relampago")){
                        vilao.receberDano(jogador.utilizarRelampago());
                        acaoRealizada = true;
                        if (vilao.getInvocarAliados() > 0){
                            vilao.setInvocarAliados(0);
                            System.out.println("Os lacaios do " + vilao.getNome() + " foram destruidos");
                        }
                    }
                    else if (habilidade.equalsIgnoreCase("cura")){
                        getJogador().utilizarCura();
                        System.out.println("Você curou " + getJogador().getAtaque() + " pontos de vida, e agora possui " + getJogador().getVidaAtual());
                        acaoRealizada = true;
                    }
                }
                else {
                    System.out.println("Você não possui habilidades disponíves");
                }
                break;
            case 3:
                if (!pocaoUtilizada){
                    System.out.println("Poções disponíveis:");
                    System.out.println("Poções de vida: "+getJogador().getPocaoDeVida());
                    System.out.println("Poções de mana: "+getJogador().getPocaoDeMana());
                    System.out.println("Poções de poder: "+getJogador().getPocaoDePoder());
                    System.out.println("Digite o nome da poção que deseja utilizar: (Vida/Mana/Poder)");
                    System.out.println("Para voltar à escolha de ação, digite 'Sair'");
                    String escolhaPocao = leitor.next();
                    if (escolhaPocao.equalsIgnoreCase("vida")){
                        if (jogador.getPocaoDeVida()>0){
                            double vidaCurada = jogador.getVidaMaxima() * 0.25;
                            System.out.println("Poção de vida utilizada");
                            jogador.setVidaAtual(jogador.getVidaAtual() + vidaCurada);
                            System.out.println("Vida atual: " + jogador.getVidaAtual());
                            getJogador().setPocaoDeVida(jogador.getPocaoDeVida() - 1);
                            pocaoUtilizada = true;
                        }
                        else if (getJogador().getPocaoDeVida() == 0){
                            System.out.println("Você não tem poções de vida suficientes");
                        }
                    }
                    else if (escolhaPocao.equalsIgnoreCase("mana")){
                        if (jogador.getPocaoDeMana()>0){
                            System.out.println("Poção de mana utilizada");
                            jogador.setMana(jogador.getMana()+40);
                            System.out.println("Mana atual: " + getJogador().getMana());
                            getJogador().setPocaoDeVida(jogador.getPocaoDeMana() - 1);
                            pocaoUtilizada = true;
                        }
                        else if (getJogador().getPocaoDeMana() == 0){
                            System.out.println("Você não tem poções de mana suficientes");
                        }
                    }
                    else if (escolhaPocao.equalsIgnoreCase("poder")){
                        if (jogador.getPocaoDePoder() > 0){
                            System.out.println("Poção de poder utilizada");
                            getJogador().setTurnosPocaoPoder(3);
                            pocaoUtilizada = true;
                            }
                        else if (jogador.getPocaoDePoder() == 0){
                            System.out.println("Você não possui poções de poder");
                        }
                        }
                    else{
                        pocaoUtilizada = true;
                    }
                    }
                else if (pocaoUtilizada){
                    System.out.println("Você já utilizou uma poção neste turno");
                }
                break;
            case 4:
                if (getJogador().isDefender()){
                    getJogador().setDefesa(getJogador().getDefesa()+50);
                    System.out.println("Você levanta seu escudo e se prepara para receber o próximo ataque");
                    acaoRealizada = true;
                }
                else if (!getJogador().isDefender()){
                    getJogador().setDefesa(getJogador().getDefesa()+ 20);
                    System.out.println("Você abre mão de atacar para focar na defesa");
                    acaoRealizada = true;
                }
                break;
            case 5:
                System.out.println("Vida\n" +getJogador().getVidaAtual() + "/" + getJogador().getVidaMaxima());
                System.out.println("Mana Atual\n" + getJogador().getMana());
                System.out.println("Poder de ataque\n" + getJogador().getAtaque());
                System.out.println("Defesa\n" + getJogador().getDefesa());
                System.out.println("habilidades disponíveis");
                if (getJogador().isRelampago()){
                    System.out.println("Relâmpago");
                }
                else if (getJogador().isCura()){
                    System.out.println("Cura");
                }
                else if (getJogador().isRouboDeVida()){
                    System.out.println("Roubo de vida");
                }
                else {
                    System.out.println("Não há");
                }
                System.out.println("Buffs ativos");
                if (getJogador().getTurnosPocaoPoder() > 0){
                    System.out.println("Poção de poder, " + getJogador().getTurnosPocaoPoder() + " turno(s) restante(s)");
                }
                else {
                    System.out.println("Não há");
                }
                break;



        }
    }
    }
}
