/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.model;



/**
 *
 * @author salesmiguelz
 */
public class PJ  extends Cliente{

   private String cnpj;
   private String razaoSocial;
   
   public PJ (){
      
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
