package classes;

import java.util.Scanner;

public class TamanhoUnico extends Peca {
    
    public TamanhoUnico(String descricao, int quantidadeAtual, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidadeAtual, estoqueMinimo, estoqueMaximo);
    }
    
    // Implementação do método venda
    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade vendida da peça tamanho único: ");
        int quantidadeVendida = scanner.nextInt();
        
        // Ajustar a quantidade usando o método da classe herdada
        setQuantidadeAtual(quantidadeVendida);
    }
}