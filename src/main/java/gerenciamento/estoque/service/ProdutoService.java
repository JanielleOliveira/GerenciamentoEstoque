package gerenciamento.estoque.service;

import gerenciamento.estoque.model.Produto;
import gerenciamento.estoque.repository.ProdutoRepository;
import gerenciamento.estoque.strategy.DescontoStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;
    private final DescontoStrategy descontoStrategy;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository, DescontoStrategy descontoStrategy) {
        this.produtoRepository = produtoRepository;
        this.descontoStrategy = descontoStrategy;
    }

    public Produto adicionarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto atualizarProduto(Long id, Produto produto) {
        produto.setId(id);
        return produtoRepository.save(produto);
    }

    public void removerProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> obterProdutoPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public double aplicarDesconto(String categoria, double preco) {
        // Logica para diferentes estratégias pode ser adicionada aqui
        return descontoStrategy.aplicarDesconto(preco);
    }
}
