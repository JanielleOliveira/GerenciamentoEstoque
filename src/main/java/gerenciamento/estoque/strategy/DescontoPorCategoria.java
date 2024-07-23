package gerenciamento.estoque.strategy;

import org.springframework.stereotype.Component;

/**
 * Implementação da estratégia de desconto por categoria.
 */

@Component
public class DescontoPorCategoria implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double preco) {
        return preco * 0.9; // 10% de desconto
    }
}
