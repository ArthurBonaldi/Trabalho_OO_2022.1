/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo;

/**
 *
 * @author salesmiguelz
 */
public class Funcionario {
    private String nome;
    private String email;
    private String senha;
    private int idade;
    private boolean  isAdmin = false; 
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        if(nome.length() > 3){
            this.nome = nome;
        } else{
            System.out.println("O nome do funcionário precisa ter mais que 3 caracteres.");
        }
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        if(email.contains("@")){
            this.email = email;
        } else{
            System.out.println("Email inválido!");
        }
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        if(idade >=18 && idade <= 99){
            this.idade = idade;
        } else{
            System.out.println("Idade inválida!");
        }
    }
    
    private void setSenha(String senha){
        if(senha.length() > 3){
            this.senha = senha;
        } else{
            System.out.println("Senha inválida!");
        }
    }
    private void setAsAdmin(){
        this.isAdmin = true;
    }
    
    private void setAsNotAdmin(){
        this.isAdmin = false;
    }
}
