package classes;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Item[] itens = new Item[5];
        itens[0] = new RoupaPMG("camisa de linho", 10,10,15,5,20);
        itens[1] = new RoupaPMG("vestido",10,21,12,5,29);
        itens[2] = new Acessorio("cinto de couro", 10, 5, 20);
        itens[3] = new RoupaTamanhoUnico("saia de praia", 10, 5, 30);
        itens[4] = new Acessorio("pulseira", 20, 5, 25);
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("=================");
            System.out.println("   BEM VINDO");
            System.out.println("=================");

            System.out.println("O QUE DESEJA?");

            System.out.println("0 - CAMISA\n1 - VESTIDO\n2 - CINTO\n3 - SAIA DE PRAIA\n4 PULSEIRA\n5 - PARA SAIR");
            int opcao = sc.nextInt();

            if (opcao >= 0 && opcao <= 4){
                itens[opcao].venda();
                itens[opcao].reposicaoEstoque();
                itens[opcao].informacoesEstoque();
            } else if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            }else System.out.println("opcao invalida");
        }
    }
}