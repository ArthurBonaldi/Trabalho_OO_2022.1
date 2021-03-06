package ufjf.dcc025.trabalhooo.controller;

import javax.swing.JOptionPane;
import ufjf.dcc025.trabalhooo.model.*;

public class ProdutoController {
    public static Produto create(String nome, String quantidade, String preco){
        Produto produto = new Produto();
        try {
            produto.setNome(nome);
            produto.setQuantidade(quantidade);
            produto.setPreco(preco);
            Produto.addProduto(produto);
        }catch (NomeInvalido Nm){
            JOptionPane.showMessageDialog(null, Nm);
        }catch (NumeroInvalido Num) {
            JOptionPane.showMessageDialog(null, Num);
        }
        return produto;
    }

    public static Produto update(String nome, String quantidade, String preco, int id){
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
        return produto;
    }

    public static void delete(int id){
        Produto.deleteProduto(id);
    }
}