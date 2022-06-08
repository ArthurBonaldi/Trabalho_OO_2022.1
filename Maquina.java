/*
 Alunos:
Miguel Sales de Almeida Lopes - 202076024
Arthur Bonaldi Fernandes - 202065567C
Joel Henrique Nunes de Oliveira Silva - 202076030

Link do repositório: https://github.com/ArthurBonaldi/Trabalho_OO_2022.1
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
