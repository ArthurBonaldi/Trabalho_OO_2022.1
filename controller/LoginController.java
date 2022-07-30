/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.controller;

import java.util.List;

import ufjf.dcc025.trabalhooo.model.Usuario;

/**
 *
 * @author arthu
 */
public class LoginController {

    public static boolean logar(String email, String senha){
        List<Usuario> usuarios = Usuario.getUsuarios();
        for(Usuario u: usuarios){
            if(u.getEmail().equals(email) && u.getSenha().equals(senha)){
                Usuario.setLoggedUser(u);
                return true;
            }
        }
        return false;
    }
}
