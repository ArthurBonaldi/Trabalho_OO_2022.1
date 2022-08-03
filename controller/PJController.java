/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.controller;
import ufjf.dcc025.trabalhooo.model.*;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class PJController {
    public static PJ create(String nome, String email, String cnpj){
        PJ pessoaJ = new PJ();
        try {
            pessoaJ.setNome(nome);
            pessoaJ.setEmail(email);
            pessoaJ.setRegistro(cnpj);
            PJ.addPessoaJ(pessoaJ);
        }catch (NomeInvalido Nm){
            System.out.println(Nm.getMessage());
        }catch (EmailInvalido Em){
            System.out.println(Em.getMessage());
        }catch (CNPJInvalido cn){
            System.out.println(cn.getMessage());
        }
        return pessoaJ;
    }
    public static PJ update(String nome, String email, String cnpj,int id ){
        PJ pessoaJ = PJ.getPessoaJ(id);
        try {
            pessoaJ.setNome(nome);
            pessoaJ.setEmail(email);
            pessoaJ.setRegistro(cnpj);
        }catch (NomeInvalido Nm){
            System.out.println(Nm.getMessage());
        }catch (EmailInvalido Em){
            System.out.println(Em.getMessage());
        }catch (CNPJInvalido cn){
            System.out.println(cn.getMessage());
        }
        return pessoaJ;
    }
        public static void delete(int id){
        PJ.deletePJ(id);
    }
    
}
