package classes;


public class RoupaTamanhoUnico extends Peca implements Item {
    public RoupaTamanhoUnico(String descricao, int quantidadeAtual, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidadeAtual, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        System.out.println("venda de um item realizada de "+ getDescricao());
        setQuantidadeAtual(1);
    }

    @Override
    public void informacoesEstoque() {
        System.out.println("descrição: " + getDescricao() + "\nQuantidade atual: "
                + getQuantidadeAtual() + "\nEstoque mínimo: "
                + getEstoqueMinimo() + "\nEstoque máximo: "
                + getEstoqueMaximo());
    }

    @Override
    public boolean testeVenda(int itensVenda) {
        return false;
    }
}
