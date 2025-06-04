package classes;

import java.util.Scanner;

public class Acessorio extends Peca implements Item {


    public Acessorio(String descricao, int quantidadeAtual, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidadeAtual, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade vendida do acessório: ");
        int quantidadeVendida = scanner.nextInt();

        // Ajusta a quantidade usando o método da classe herdada
        setQuantidadeAtual(quantidadeVendida);
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