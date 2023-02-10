package com.projeto.projetospring.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.projeto.projetospring.model.Produto;

@Repository
public class ProdutoRepository {

    // Simulando o banco de dados
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

    // #region Metodo para obterTodos
    /**
     * Metodo para retornar uma lista de produtos
     * 
     * @return Lista de produtos.
     */
    public List<Produto> obterTodos() {
        return produtos;
    }
    // #endregion

    // #region Metodo para obterPorId
    /**
     * Metodo que retorna o produto encontrado pelo seu Id.
     * 
     * @param id do produto que será localizado.
     * @return Retorna um produto caso seja encontrado
     */
    public Optional<Produto> obterPorId(Integer id) {
        return produtos
                .stream()
                .filter(produto -> produto.getId() == id)
                .findFirst();
    }
    // #endregion

    // #region Metodo para adicionar
    /**
     * Metodo para adicionar produto na lista.
     * 
     * @param produto que será adicionado.
     * @return Retorna o produto que foi adicionado na lista.
     */
    public Produto adicionar(Produto produto) {
        ultimoId++;

        produto.setId(ultimoId);
        produtos.add(produto);
        return produto;
    }
    // #endregion

    // #region Metodo para deletar
    /**
     * Metodo para deletar o produto pr id.
     * 
     * @param id do produto a ser deletado
     */
    public void deletar(Integer id) {
        produtos.removeIf(produto -> produto.getId() == id);
    }
    // #endregion

    // #region Metodo para atualizar
    /**
     * Metodo para atualizar o produto na lista
     * 
     * @param produto que será atulizado.
     * @return Retorna o produto após atulizar a lista.
     */
    public Produto atualizar(Produto produto) {
        // encontra no produto na lista
        Optional<Produto> produtoEncontrado = obterPorId(produto.getId());

        if (produtoEncontrado.isEmpty()) {
            throw new InputMismatchException("Produto não encontrado");
        }

        // Eu tenho que remover o produto antigo da lista
        deletar(produto.getId());

        // Depois adicionar o produto atualizado na lista.

        produtos.add(produto);

        return produto;

    }

    // #endregion

}
