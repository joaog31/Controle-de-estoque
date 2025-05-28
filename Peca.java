package classes;

public abstract class Peca implements ObjetosVenda {// A implementação de ObjetosVenda normaliza a classe com base na interface.
	private String descricao;
	private int quantidadeAtual;
	private int estoqueMinimo;
	private int estoqueMaximo;

	public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidadeAtual = quantidade;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}

	public void reposicaoEstoque() {//teste se a quantidade atual em estoque é menor que o estoque mínimo
		if (this.quantidadeAtual < this.estoqueMinimo) {
			this.quantidadeAtual = this.estoqueMaximo;
		}
	}

	public abstract void venda();

	public void setQuantidadeAtual(int itensVendidos) {// Atualiza a quantidade de itens em estoque atual.
		this.quantidadeAtual -= itensVendidos;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public int getQuantidadeAtual() {
		return quantidadeAtual;
	}

	public String getDescricao() {
		return descricao;
	}

}
