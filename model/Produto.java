package ufjf.dcc025.trabalhooo.model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    private int id;
    private static int currentId;

    private static List<Produto> produtos = new ArrayList<>();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void addProduto(Produto p){
        p.setId(currentId);
        produtos.add(p);
        currentId++;
    }
    public static Produto getProduto(int id){
        Produto produto = new Produto();
        for(Produto p : produtos){
            if(p.getId() == id){
                produto = p;
            }
        }

        return produto;
    }
    
    public static void deleteProduto(int id){
        produtos.remove(getProduto(id));
    }
}
