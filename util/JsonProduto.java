/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import ufjf.dcc025.trabalhooo.model.Produto;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class JsonProduto {
    public static String toJSON(Produto produto) {
        Gson gson = new Gson();
        String json = gson.toJson(produto);
        return json;
    }
     public static String toJSON(List<Produto> produtos) {
        Gson gson = new Gson();
        String json = gson.toJson(produtos);
        return json;
    }
     public static Produto toProduto(String conteudo) {
        Gson gson = new Gson();
        Produto produto = gson.fromJson(conteudo, Produto.class);

        return produto;
    }
    public static List<Produto> toProdutos(String conteudo) {
        Gson gson = new Gson();
        Type produto = new TypeToken<ArrayList<Produto>>() {
        }.getType();
        List<Produto> produtos = gson.fromJson(conteudo, produto);

        return produtos;
    }
}
