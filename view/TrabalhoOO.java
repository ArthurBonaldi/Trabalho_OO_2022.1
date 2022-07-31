/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.view;

import com.google.gson.Gson;
import ufjf.dcc025.trabalhooo.controller.UsuarioController;
import ufjf.dcc025.trabalhooo.model.Usuario;

/**
 *
 * @author arthu
 */
public class TrabalhoOO {

    public static void main(String args[]) {
        UsuarioController add = new UsuarioController();
        Usuario user = new Usuario();
        user = add.create("Arthur", "arthur.bonaldi@codejr.com.br", "123456789", "Gerente");       
        
        
        TelaLogin login = new TelaLogin();
        login.montaTela();
    }
}
