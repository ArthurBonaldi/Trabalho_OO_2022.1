/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.model;



/**
 *
 * @author salesmiguelz
 */
public class PF  extends Cliente{

    private String cpf ;
    private String date;
    
    
    public PF(){
    }
    
    
    public String getCpf() {
        return cpf;
    }

    public void setCPF(String CPF) throws CPFInvalido {
        if (CPF.length() == 11 && CPF.matches("[0-9]*"))
            this.cpf = CPF;
        else
            throw new CPFInvalido();
    }

    public String getDate() {
        return date;
    } //Fazer tratamento!

    public void setDate(String date) {
        this.date = date;
    }
    
 
    
   
}
