/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.controller;
import  ufjf.dcc025.trabalhooo.model.PF;
import ufjf.dcc025.trabalhooo.model.*;
/**
 *
 * @author arthu
 */
public class PFController {
    public static PF create(String nome, String email,String CPF,String data ){
        PF pessoaF = new PF();
        try {
            pessoaF.setNome(nome);
            pessoaF.setEmail(email);
            pessoaF.setCPF(CPF);
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
    public static PF update(String nome, String email,String CPF,String data,int id) {
        PF pessoaF = PF.getPessoaF(id);

        try {
            pessoaF.setNome(nome);
            pessoaF.setEmail(email);
            pessoaF.setCPF(CPF);
            pessoaF.setDate(data);
        } catch (NomeInvalido Nm) {
            System.out.println(Nm.getMessage());
        } catch (EmailInvalido Em) {
            System.out.println(Em.getMessage());
        } catch (CPFInvalido cp) {
            System.out.println(cp.getMessage());
        } catch (DataInvalida dt) {
            System.out.println(dt.getMessage());
        }
        return pessoaF;
    }
    
}
