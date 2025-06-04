package classes;

import java.util.Scanner;

public class Acessorio extends Peca {
    
    public Acessorio(String descricao, int quantidadeAtual, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidadeAtual, estoqueMinimo, estoqueMaximo);
    }
    
    // Implementação do método venda()
    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade vendida do acessório: ");
        int quantidadeVendida = scanner.nextInt();
        
        // Ajusta a quantidade usando o método da classe herdada
        setQuantidadeAtual(quantidadeVendida);
    }
}