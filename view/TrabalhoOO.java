/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.view;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import ufjf.dcc025.trabalhooo.model.Usuario;
import ufjf.dcc025.trabalhooo.util.Arquivo;
import ufjf.dcc025.trabalhooo.util.JsonUsuario;
/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class TrabalhoOO {

    public static void main(String args[]) throws FileNotFoundException {
        String userJson;
        int size;
        List<Usuario> usuarios = new ArrayList<>();
        userJson = Arquivo.leArquivo("funcionarios.json");
        usuarios = JsonUsuario.toUsuarios(userJson);
        Usuario.setUsuarios(usuarios);
        size = usuarios.size();
        Usuario.setCurrentId(Usuario.getCurrentId()+size);
        
        TelaLogin login = new TelaLogin();
        login.montaTela();
    }
}
