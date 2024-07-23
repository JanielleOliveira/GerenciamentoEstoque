package gerenciamento.estoque.strategy;

import org.springframework.stereotype.Component;

@Component
public class DescontoPorCategoria implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double preco) {
        return preco * 0.9; // 10% de desconto
    }
}
