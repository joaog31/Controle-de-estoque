package classes;

import java.util.Scanner;

public interface ObjetosVenda {
	Scanner ler = new Scanner(System.in);

	void venda();

	void reposicaoEstoque();

	void informacoesEstoque();

	boolean testeVenda(int itensVenda);

	String getDescricao();

}
