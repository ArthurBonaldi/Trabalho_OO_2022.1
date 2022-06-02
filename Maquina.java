/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo;

/**
 *
 * @author salesmiguelz
 */
public class Maquina {
    private String nome;
    private int quantidade;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        if(nome.length() > 3){
            this.nome = nome;
        } else{
            System.out.println("O nome da máquina precisa ter mais que 3 caracteres.");
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
}
