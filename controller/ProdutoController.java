package ufjf.dcc025.trabalhooo.controller;

import ufjf.dcc025.trabalhooo.model.EmailInvalido;
import ufjf.dcc025.trabalhooo.model.NomeInvalido;
import ufjf.dcc025.trabalhooo.model.Produto;
import ufjf.dcc025.trabalhooo.model.Usuario;

public class ProdutoController {
    public static void create(String nome, int quantidade, double preco){
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);
        Produto.addProduto(produto);
    }

    public static void update(String nome, int quantidade, double preco, int id){
        Produto produto = Produto.getProduto(id);
        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);
    }

    public static void delete(int id){
        Produto.deleteProduto(id);
    }
}