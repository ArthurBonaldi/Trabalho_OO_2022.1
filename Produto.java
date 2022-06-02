/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo;

/**
 *
 * @author salesmiguelz
 */
public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private float valor;
    
    public int getId(){
        return this.id;
    }
    
    /*public void setId{
    } */
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        if(nome.length() > 3){
            this.nome = nome;
        } else{
            System.out.println("O nome do produto precisa ter mais que 3 caracteres.");
        }
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public void setQuantidade(int qntde){
        if(qntde >= 0){
            this.quantidade = qntde;
        } else{
            System.out.println("Quantidade inválida!");
        }
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public void setValor(float valor){
        if(valor >= 0){
            this.valor = valor;
        } else{
            System.out.println("Valor inválido!");
        }
    }
    
}
