package ufjf.dcc025.trabalhooo.controller;

import ufjf.dcc025.trabalhooo.model.EmailInvalido;
import ufjf.dcc025.trabalhooo.model.NomeInvalido;
import ufjf.dcc025.trabalhooo.model.Usuario;

public class UsuarioController {
    
    public static void create(String nome, String email, String senha, String cargo) throws NomeInvalido, EmailInvalido, SenhaInvalida{
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setCargo(cargo);
        Usuario.addUser(usuario);
    }

    public static void update(String nome, String email, String senha, String cargo, int id) throws NomeInvalido, EmailInvalido, SenhaInvalida{
        Usuario usuario = Usuario.getUser(id);
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setCargo(cargo);
    }

    public static void delete(int id){
        Usuario.deleteUser(id);
    }
}
