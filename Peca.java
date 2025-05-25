package classes;

public abstract class Peca implements ObjetosVenda{
	private String descricao;
	private int quantidade;
	private int estoqueMinimo;
	private int estoqueMaximo;

	public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}

	public abstract void Venda();

	public void reposicaoEstoque() {
		if (this.quantidade < this.estoqueMinimo) {
			this.quantidade = this.estoqueMaximo;
		}
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

}
