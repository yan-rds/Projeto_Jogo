package br.com.zup;

import java.util.Scanner;

public class Sistema {
    Scanner leitor = new Scanner(System.in);
    private int preco;
    private Inimigo vilao;
    private PersonagemDoJogador jogador;

    public Sistema(int preco, Inimigo vilao, PersonagemDoJogador jogador) {
        this.preco = preco;
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
                        switch (escolhaEquipamento) {
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
                                } else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 150);
                                    jogador.setRouboDeVida(true);
                                }
                                break;
                            case 2:
                                if (jogador.getDinheiro() < 150) {
                                    System.out.println("Dinheiro insuficiente");
                                } else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 150);
                                    jogador.setRelampago(true);
                                }
                                break;
                            case 3:
                                if (jogador.getDinheiro() < 200) {
                                    System.out.println("Dinheiro insuficiente");
                                } else {
                                    jogador.setDinheiro(jogador.getDinheiro() - 200);
                                    jogador.setCura(true);
                                }
                                break;
                            case 4:
                                menuHabilidades = false;
                                break;
                        }
                    }
                case 4:
                    menuCompras = false;
                    break;
            }
        }
    }
}
