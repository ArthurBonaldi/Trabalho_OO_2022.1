/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalhooo.model.*;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class PJController {

    public static PJ create(String nome, String email, String cnpj) {
        PJ pessoaJ = new PJ();
        try {
            pessoaJ.setNome(nome);
            pessoaJ.setEmail(email);
            pessoaJ.setRegistro(cnpj);
            PJ.addPessoaJ(pessoaJ);
        } catch (NomeInvalido Nm) {
            JOptionPane.showMessageDialog(null, Nm.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (EmailInvalido Em) {
            JOptionPane.showMessageDialog(null, Em.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (CNPJInvalido cn) {
            JOptionPane.showMessageDialog(null, cn.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return pessoaJ;
    }

    public static PJ update(String nome, String email, String cnpj, int id) {
        PJ pessoaJ = PJ.getPessoaJ(id);
        try {
            pessoaJ.setNome(nome);
            pessoaJ.setEmail(email, id);
            pessoaJ.setRegistro(cnpj, id);
        } catch (NomeInvalido Nm) {
            JOptionPane.showMessageDialog(null, Nm.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (EmailInvalido Em) {
            JOptionPane.showMessageDialog(null, Em.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (CNPJInvalido cn) {
                JOptionPane.showMessageDialog(null, cn.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        return pessoaJ;
    }

    public static void delete(int id) {
        PJ.deletePJ(id);
    }

}
