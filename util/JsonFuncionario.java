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
 * @author arthu
 */
public class JsonFuncionario {
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
        Usuario contato = gson.fromJson(conteudo, Usuario.class);

        return contato;
    }
    public static List<Usuario> toUsuarios(String conteudo) {
        Gson gson = new Gson();
        Type pessoasTipo = new TypeToken<ArrayList<Usuario>>() {
        }.getType();
        List<Usuario> contatos = gson.fromJson(conteudo, pessoasTipo);

        return contatos;
    }
}
