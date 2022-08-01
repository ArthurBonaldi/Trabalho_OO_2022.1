/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.model;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salesmiguelz
 */
public class PJ  extends Cliente{

   private String cnpj;
   private String razaoSocial;

    private static List<PJ> PessoasJ = new ArrayList<>();
    private static int currentId =1;

    private int userId;

    public PJ(){
    }
    public int getId() {
        return userId;
    }
    public void setId(int id){
        this.userId = id;
    }

    public static void addPessoaJ(PJ pj){
        pj.setId(currentId);
        PessoasJ.add(pj);
        currentId++;
    }
    public static PJ getPessoaJ(int id){
        PJ Pessoasj = new PJ();

        for(PJ pj: PessoasJ){
            if(pj.getId() == id){
                Pessoasj = pj;
            }
        }

        return Pessoasj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) throws CNPJInvalido { //tem que ter tam 14 e só pode conter numeros
        if (cnpj.length() == 14 && cnpj.matches("[0-9]*"))
            this.cnpj = cnpj;
        else
            throw new CNPJInvalido();
    }

    public String getRazaoSocial() {return razaoSocial;}

    public void setRazaoSocial(String razaoSocial)throws NomeInvalido { // não pode conter numero
        String aux = razaoSocial;
        if (!aux.replaceAll(" ", "").toLowerCase().matches("[a-z]*")) {
            throw new NomeInvalido();
        } else
            this.razaoSocial = razaoSocial;
    }
}
