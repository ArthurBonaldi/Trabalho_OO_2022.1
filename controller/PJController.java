/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.controller;
import ufjf.dcc025.trabalhooo.model.*;

/**
 *
 * @author arthu
 */
public class PJController {
    public static PJ create(String nome, String email, String CNPJ, String Razão ){
        PJ pessoaJ = new PJ();
        try {
            pessoaJ.setNome(nome);
            pessoaJ.setEmail(email);
            pessoaJ.setCnpj(CNPJ);
            pessoaJ.setRazaoSocial(Razão);
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
    public static PJ update(String nome, String email, String CNPJ, String Razão,int id ){
        PJ pessoaJ = PJ.getPessoaJ(id);
        try {
            pessoaJ.setNome(nome);
            pessoaJ.setEmail(email);
            pessoaJ.setCnpj(CNPJ);
            pessoaJ.setRazaoSocial(Razão);
        }catch (NomeInvalido Nm){
            System.out.println(Nm.getMessage());
        }catch (EmailInvalido Em){
            System.out.println(Em.getMessage());
        }catch (CNPJInvalido cn){
            System.out.println(cn.getMessage());
        }
        return pessoaJ;
    }
    
}
