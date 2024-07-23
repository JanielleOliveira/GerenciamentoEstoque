package gerenciamento.estoque.strategy;

/**
 * Interface para aplicar estratégias de desconto aos produtos.
 */
public interface DescontoStrategy {
    double aplicarDesconto(double preco);
}
