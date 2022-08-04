/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalhooo.model.PF;
import ufjf.dcc025.trabalhooo.model.*;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class PFController {

    public static PF create(String nome, String email, String cpf, String data) {
        PF pessoaF = new PF();
        try {
            pessoaF.setNome(nome);
            pessoaF.setEmail(email);
            pessoaF.setRegistro(cpf);
            pessoaF.setDate(data);
            PF.addPessoaF(pessoaF);
            return pessoaF;
        } catch (NomeInvalido Nm) {
            JOptionPane.showMessageDialog(null, Nm.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (EmailInvalido Em) {
            JOptionPane.showMessageDialog(null, Em.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (CPFInvalido cp) {
            JOptionPane.showMessageDialog(null, cp.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (DataInvalida dt) {
            JOptionPane.showMessageDialog(null, dt.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static PF update(String nome, String email, String cpf, String data, int id) {
        PF pessoaF = PF.getPessoaF(id);

        try {
            pessoaF.setNome(nome);
            pessoaF.setEmail(email, id);
            pessoaF.setRegistro(cpf, id);
            pessoaF.setDate(data);
        }catch (NomeInvalido Nm) {
            JOptionPane.showMessageDialog(null, Nm.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (EmailInvalido Em) {
            JOptionPane.showMessageDialog(null, Em.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (CPFInvalido cp) {
            JOptionPane.showMessageDialog(null, cp.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (DataInvalida dt) {
            JOptionPane.showMessageDialog(null, dt.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return pessoaF;
    }

    public static void delete(int id) {
        PF.deletePF(id);
    }
}
