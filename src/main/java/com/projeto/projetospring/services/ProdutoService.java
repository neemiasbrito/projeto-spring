package com.projeto.projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.projetospring.model.Produto;
import com.projeto.projetospring.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * Metodo para retornar uma lista de produtos
     * 
     * @return Lista de produtos.
     */
    public List<Produto> obterTodos() {
        return produtoRepository.obterTodos();
    }

    /**
     * Metodo que retorna o produto encontrado pelo seu Id.
     * 
     * @param id do produto que será localizado.
     * @return Retorna um produto caso seja encontrado
     */
    public Optional<Produto> obterPorId(Integer id) {
        return produtoRepository.obterPorId(id);
    }

    // #region Metodo para adicionar
    /**
     * Metodo para adicionar produto na lista.
     * 
     * @param produto que será adicionado.
     * @return Retorna o produto que foi adicionado na lista.
     */
    public Produto adicionar(Produto produto) {
        //
        return produtoRepository.adicionar(produto);
    }
    // #endregion

    // #region Metodo para deletar
    /**
     * Metodo para deletar o produto pr id.
     * 
     * @param id do produto a ser deletado
     */
    public void deletar(Integer id) {
        produtoRepository.deletar(id);
    }
    // #endregion

    // #region Metodo para atualizar
    /**
     * Metodo para atualizar o produto na lista
     * 
     * @param produto que será atulizado.
     * @param id      do produto.
     * @return Retorna o produto após atulizar a lista.
     */
    public Produto atualizar(Integer id, Produto produto) {
        // ter alguma validação no Id.
        produto.setId(id);
        return produtoRepository.atualizar(produto);
    }

    // #endregion

}
