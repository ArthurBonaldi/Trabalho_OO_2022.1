package ufjf.dcc025.trabalhooo.controller;

import javax.swing.JOptionPane;

import ufjf.dcc025.trabalhooo.model.EmailInvalido;
import ufjf.dcc025.trabalhooo.model.NomeInvalido;
import ufjf.dcc025.trabalhooo.model.SenhaInvalida;
import ufjf.dcc025.trabalhooo.model.Usuario;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class UsuarioController {

    public static Usuario create(String nome, String email, String senha, String cargo) {
        Usuario usuario = new Usuario();
        try {
            usuario.setNome(nome);
            usuario.setEmail(email);
            usuario.setSenha(senha);
            usuario.setCargo(cargo);
            Usuario.addUser(usuario);
        }catch (NomeInvalido Nm) {
            JOptionPane.showMessageDialog(null, Nm.getMessage());
        } catch (EmailInvalido Em) {
            JOptionPane.showMessageDialog(null, Em.getMessage());
        } catch (SenhaInvalida Sn) {
            JOptionPane.showMessageDialog(null, Sn.getMessage());
        }
        return null;
    }

    public static Usuario update(String nome, String email, String senha, String cargo, int id) {
        Usuario usuario = Usuario.getUser(id);
        try {
            usuario.setNome(nome);
            usuario.setEmail(email, id);
            usuario.setSenha(senha);
            usuario.setCargo(cargo);
        }catch (NomeInvalido Nm) {
            JOptionPane.showMessageDialog(null, Nm.getMessage());
        } catch (EmailInvalido Em) {
            JOptionPane.showMessageDialog(null, Em.getMessage());
        } catch (SenhaInvalida Sn) {
            JOptionPane.showMessageDialog(null, Sn.getMessage());
        }
        return usuario;
    }

    public static void delete(int id) {
        Usuario.deleteUser(id);
    }
}
