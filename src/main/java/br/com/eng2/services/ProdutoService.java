package br.com.eng2.services;

import br.com.eng2.entities.Produto;

public interface ProdutoService {

    Iterable<Produto> listarProdutos();

    Produto getProdutoById(Integer id);

    Produto salvarProduto(Produto produto);

    void deletarProduto(Integer id);

}
