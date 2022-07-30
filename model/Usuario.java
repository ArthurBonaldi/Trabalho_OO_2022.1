/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.model;

import java.util.ArrayList;
import java.util.List;

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
    private static List<Usuario> usuarios = new ArrayList<>();
   

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
           throw new Exception("Senha Invalida!");
       }
    }
   
    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) throws NomeInvalido{ //não pode conter numeros e tem q ser maior q 2
        String aux=nome;
        if (!aux.replaceAll(" ", "").toLowerCase().matches("[a-z]*")  || nome.length() < 3) {
            throw new NomeInvalido();
        }
        else
            this.nome = nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email) throws EmailInvalido{ //email deve conter @ e .com
        if(email.contains("@") && email.contains(".com")){
            this.email = email;
        } else{
            throw new EmailInvalido();
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
    } //pra arrumar

    public boolean isIsLogged() {
        return isLogged;
    }

    public void setIsLogged(boolean isLogged) {
        this.isLogged = isLogged;
    }

    public static List<Usuario> getUsuarios(){
        return usuarios;
    }
}
