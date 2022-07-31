package ufjf.dcc025.trabalhooo.controller;

import ufjf.dcc025.trabalhooo.model.EmailInvalido;
import ufjf.dcc025.trabalhooo.model.NomeInvalido;
import ufjf.dcc025.trabalhooo.model.SenhaInvalida;
import ufjf.dcc025.trabalhooo.model.Usuario;

public class UsuarioController {
    
    public static Usuario create(String nome, String email, String senha, String cargo){
        Usuario usuario = new Usuario();
        try {
            usuario.setNome(nome);
            usuario.setEmail(email);
            usuario.setSenha(senha);
            usuario.setCargo(cargo);
            Usuario.addUser(usuario);
        }catch (NomeInvalido Nm){
            System.out.println(Nm.getMessage());
        }catch (EmailInvalido Em){
            System.out.println(Em.getMessage());
        }catch (SenhaInvalida Sn){
            System.out.println(Sn.getMessage());
        }
        return usuario;  
    }

    public static Usuario update(String nome, String email, String senha, String cargo, int id){
        Usuario usuario = Usuario.getUser(id);
        try {
            usuario.setNome(nome);
            usuario.setEmail(email);
            usuario.setSenha(senha);
            usuario.setCargo(cargo);
        }catch (NomeInvalido Nm){
            System.out.println(Nm.getMessage());
        }catch (EmailInvalido Em){
            System.out.println(Em.getMessage());
        }catch (SenhaInvalida Sn){
            System.out.println(Sn.getMessage());
        }
        return usuario;
    }

    public static void delete(int id){
        Usuario.deleteUser(id);
    }
}
