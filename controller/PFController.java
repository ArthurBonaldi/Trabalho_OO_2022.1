/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.controller;
import javax.swing.JOptionPane;
import  ufjf.dcc025.trabalhooo.model.PF;
import ufjf.dcc025.trabalhooo.model.*;
/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class PFController {
    public static PF create(String nome, String email, String cpf, String data ){
        PF pessoaF = new PF();
        try {
            pessoaF.setNome(nome);
            pessoaF.setEmail(email);
            pessoaF.setRegistro(cpf);
            pessoaF.setDate(data);
            PF.addPessoaF(pessoaF);
        }catch (NomeInvalido Nm){
            System.out.println(Nm.getMessage());
        }catch (EmailInvalido Em){
            System.out.println(Em.getMessage());
        }catch (CPFInvalido cp){
            System.out.println(cp.getMessage());
        }catch (DataInvalida dt){
            System.out.println(dt.getMessage());
        }
        return pessoaF;
    }
    public static PF update(String nome, String email,String cpf,String data,int id) {
        PF pessoaF = PF.getPessoaF(id);

        try {
            pessoaF.setNome(nome);
            pessoaF.setEmail(email);
            pessoaF.setRegistro(cpf);
            pessoaF.setDate(data);
        } catch (NomeInvalido Nm) {
            System.out.println(Nm.getMessage());
        } catch (EmailInvalido Em) {
            System.out.println(Em.getMessage());
        } catch (CPFInvalido cp) {
            JOptionPane.showMessageDialog(null, cp);
        } catch (DataInvalida dt) {
            System.out.println(dt.getMessage());
        }
        return pessoaF;
    }
        public static void delete(int id){
        PF.deletePF(id);
    }
}
