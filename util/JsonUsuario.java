/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import ufjf.dcc025.trabalhooo.model.Usuario;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class JsonUsuario {
    public static String toJSON(Usuario usuario) {
        Gson gson = new Gson();
        String json = gson.toJson(usuario);
        return json;
    }
     public static String toJSON(List<Usuario> usuarios) {
        Gson gson = new Gson();
        String json = gson.toJson(usuarios);
        return json;
    }
     public static Usuario toUsuario(String conteudo) {
        Gson gson = new Gson();
        Usuario usuario = gson.fromJson(conteudo, Usuario.class);

        return usuario;
    }
    public static List<Usuario> toUsuarios(String conteudo) {
        Gson gson = new Gson();
        Type usuario = new TypeToken<ArrayList<Usuario>>() {
        }.getType();
        List<Usuario> usuarios = gson.fromJson(conteudo, usuario);

        return usuarios;
    }
}
