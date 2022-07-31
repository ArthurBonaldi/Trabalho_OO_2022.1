package ufjf.dcc025.trabalhooo.model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private String quantidade;
    private String preco;
    private int id;
    private static int currentId;
    private static List<Produto> produtos = new ArrayList<>();
    
    
    public static List<Produto> getProdutos() {
        return produtos;
    }

    

    public String getNome() {return this.nome;}

    public void setNome(String nome) throws NomeInvalido{
        String aux=nome;
        if (!aux.replaceAll(" ", "").toLowerCase().matches("[a-z]*") || nome.length() < 3) {
            throw new NomeInvalido();
        }
        else
            this.nome = nome;
    }

    public int getQuantidade() {
        int number = Integer.parseInt(this.quantidade);
        return number;
    }

    public void setQuantidade(String quantidade) throws NumeroInvalido{
        if(quantidade.matches("[0-9]*"))
            this.quantidade = quantidade;
        else
            throw new NumeroInvalido();
    }

    public double getPreco() {
        double aDouble = Double.parseDouble(this.preco.replaceAll(",", "."));
        return aDouble;
    }

    public void setPreco(String preco) throws NumeroInvalido{
        String aux = preco.replaceAll(".",",");
        if (!aux.replaceAll("," , "").matches("[0-9]*")) {
            throw new NumeroInvalido();
        }
        else
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
