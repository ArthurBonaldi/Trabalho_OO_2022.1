/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.model;



/**
 *
 * @author salesmiguelz
 */
public class Usuario  {
    private static int numUsers; 
    private int idUser;
    private String nome;
    private String email;
    private String senha;
    private String cargo;
    private boolean isLogged;

   

    public Usuario(){
      
    }
    public int getId() {
        return idUser;
    } 
 

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception{
       if(senha.length() >= 6 && senha.length() <= 12 ){
           this.senha = senha;
       }
       else{
           throw new Exception("Senha Invalida");
       }
    }
   
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        if(nome.length() > 3){
            this.nome = nome;
        } else{
            System.out.println("O nome do cliente precisa ter mais que 3 caracteres.");
        }
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        if(email.contains("@") && email.contains(".com")){
            this.email = email;
        } else{
            System.out.println("Email inválido!");
        }
    }
    
    public void setIdUser(String idUser) {
        this.idUser = hashCode();
    }
     public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isIsLogged() {
        return isLogged;
    }

    public void setIsLogged(boolean isLogged) {
        this.isLogged = isLogged;
    }
   
}
