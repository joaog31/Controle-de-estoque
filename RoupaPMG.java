package classes;

import java.util.Scanner;

public class RoupaPMG implements Item{
  private String descricao;
  private int quantidadeP;
  private int quantidadeM;
  private int quantidadeG;
  private int estoqueMinimo;
  private int estoqueMaximo;

  public RoupaPMG(String descricao ,int quantidadeP, int quantidadeG, int quantidadeM, int estoqueMinimo, int estoqueMaximo) {
      this.descricao= descricao;
      this.quantidadeG = quantidadeG;
      this.quantidadeM = quantidadeM;
      this.quantidadeP = quantidadeP;
      this.estoqueMinimo = estoqueMinimo;
      this.estoqueMaximo = estoqueMaximo;

  }

  public String getDescricao() {
      return descricao;
  }

    @Override
    public void venda() {
      Scanner ler = new Scanner(System.in);
      String tamanho;
      System.out.println("Escolha qual tamanho de roupa você quer comprar,digite P, M ou  G: ");
      tamanho = ler.nextLine();

      if (tamanho.equals("P") || tamanho.equals("p")) {
          this.quantidadeP -1;

      } else if (tamanho.equals("M") || tamanho.equals("m")) {
          this.quantidadeM -1;

      } else if (tamanho.equals("G") || tamanho.equals("g")) {
          this.quantidadeG -1;
      }




    }

    @Override
    public void reposicaoEstoque() {
         if (quantidadeP < estoqueMinimo) {
            quantidadeP = estoqueMaximo;
            System.out.println("Reposição feita para tamanho P.");
        }
        if (quantidadeM < estoqueMinimo) {
            quantidadeM = estoqueMaximo;
            System.out.println("Reposição feita para tamanho M.");
        }
        if (quantidadeG < estoqueMinimo) {
            quantidadeG = estoqueMaximo;
            System.out.println("Reposição feita para tamanho G.");
        }
    }


    @Override
    public void informacoesEstoque() {
         System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade P: " + quantidadeP);
        System.out.println("Quantidade M: " + quantidadeM);
        System.out.println("Quantidade G: " + quantidadeG);
        System.out.println("Estoque mínimo: " + estoqueMinimo);
        System.out.println("Estoque máximo: " + estoqueMaximo);

    }

    @Override
    public boolean testeVenda(int itensVenda) {
        return false;
    }
}
