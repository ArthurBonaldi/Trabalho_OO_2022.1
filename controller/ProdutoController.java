package ufjf.dcc025.trabalhooo.controller;

import ufjf.dcc025.trabalhooo.model.*;

public class ProdutoController {
    public static void create(String nome, String quantidade, String preco){
        Produto produto = new Produto();
        try {
            produto.setNome(nome);
            produto.setQuantidade(quantidade);
            produto.setPreco(preco);
            Produto.addProduto(produto);
        }catch (NomeInvalido Nm){
            System.out.println(Nm.getMessage());
        }catch (NumeroInvalido Num) {
            System.out.println(Num.getMessage());
        }
    }

    public static void update(String nome, String quantidade, String preco, int id){
        Produto produto = Produto.getProduto(id);
        try {
            produto.setNome(nome);
            produto.setQuantidade(quantidade);
            produto.setPreco(preco);
        }catch (NomeInvalido Nm){
            System.out.println(Nm.getMessage());
        }catch (NumeroInvalido Num) {
            System.out.println(Num.getMessage());
        }
    }

    public static void delete(int id){
        Produto.deleteProduto(id);
    }
}