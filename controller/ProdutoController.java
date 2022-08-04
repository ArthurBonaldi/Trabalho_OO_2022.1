package ufjf.dcc025.trabalhooo.controller;

import javax.swing.JOptionPane;
import ufjf.dcc025.trabalhooo.model.*;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class ProdutoController {

    public static Produto create(String nome, String quantidade, String preco) {
        Produto produto = new Produto();
        try {
            produto.setNome(nome);
            produto.setQuantidade(quantidade);
            produto.setPreco(preco);
            Produto.addProduto(produto);
        } catch (NomeInvalido Nm) {
            JOptionPane.showMessageDialog(null, Nm.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumeroInvalido Num) {
            JOptionPane.showMessageDialog(null, Num.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return produto;
    }

    public static Produto update(String nome, String quantidade, String preco, int id) {
        Produto produto = Produto.getProduto(id);
        try {
            produto.setNome(nome);
            produto.setQuantidade(quantidade);
            produto.setPreco(preco);
        } catch (NomeInvalido Nm) {
            JOptionPane.showMessageDialog(null, Nm.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumeroInvalido Num) {
            JOptionPane.showMessageDialog(null, Num.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return produto;
    }

    public static void delete(int id) {
        Produto.deleteProduto(id);
    }
}
