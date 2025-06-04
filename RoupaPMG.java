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
      this.descricao = descricao;
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
		System.out.println("Esse tipo de item é vendido uma peça por vez: ");
		System.out.println();
		int quantidadeVender = 1;
		if (testeVenda(quantidadeVender)) {
			String tamanho;
			System.out.println("Escolha qual tamanho de roupa você quer comprar,digite P, M ou  G: ");
			System.out.println();	
			tamanho = ler.nextLine();
			tamanho = tamanho.toUpperCase();
			if (tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G")) {
				if (tamanho.equals("P")) {
					if (this.quantidadeP>0) {
						this.quantidadeP -= 1;
					}else {
						System.out.println("Estoque insuficiente");
					}
				} else if (tamanho.equals("M")) {
					if (this.quantidadeM>0) {
						this.quantidadeM -= 1;
					}else {
						System.out.println("Estoque insuficiente");
					}

				} else if (tamanho.equals("G")) {
					if (this.quantidadeG>0) {
						this.quantidadeG -= 1;
					}else {
						System.out.println("Estoque insuficiente");
					}
				}
			}else {
				System.out.println("Escolha de tamanho inválida");
				System.out.println();
			}

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
        if (itensVenda > 0) {
			return true;
		}
		return false;
    }
}
