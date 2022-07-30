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
    private static int currentId; 
    private int userId;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String cargo;
    private boolean isLogged;
    private static List<Usuario> usuarios = new ArrayList<>();
   

    public Usuario(){
      
    }
    public int getId() {
        return userId;
    } 

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws SenhaInvalida{
       if(senha.length() >= 6 && senha.length() <= 12 ){
           this.senha = senha;
       }
       else{
           throw new SenhaInvalida();
       }
    }
   
    public void setId(int id){
        this.userId = id;
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


    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) throws CPFInvalido{
        this.cpf = cpf;
    }

    public boolean getIsLogged() {
        return this.isLogged;
    }
    public static void addUser(Usuario u){
        u.setId(currentId);
        usuarios.add(u);
        currentId++;
    }
    
    public static Usuario getUser(int id){
        Usuario usuario = new Usuario();
        for(Usuario u: usuarios){
            if(u.getId() == id){
                usuario = u;
            }
        }

        return usuario;
    }

    public static void deleteUser(int id){
        usuarios.remove(getUser(id));
    }
}
