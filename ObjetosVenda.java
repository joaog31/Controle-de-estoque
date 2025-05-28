package classes;

import java.util.Scanner;

public interface ObjetosVenda {// Essa é a classe base para o projeto. a partir dela é possível implementar um vetor e fazer polimosfismo 
	Scanner ler = new Scanner(System.in);

	void venda(); // função venda que é implementada em todas as subclasses, dessa forma, o comando venda chamará a venda do objeto instanciado.

	void reposicaoEstoque(); //função reposicaoEstoque também terá mesma simplicidades da venda.

	void informacoesEstoque(); //função informacoesEstoque também terá mesma simplicidades da venda.

	boolean testeVenda(int itensVenda); //função testeVenda trabalha junto com venda, e faz o teste para determinar se a venda é possível diante do estoque.
	
	String getDescricao(); //Função é usada para criar o "menu de vendas", por isso deve ser implementado em todas as classes.
}
