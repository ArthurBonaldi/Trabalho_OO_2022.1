/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.model;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author salesmiguelz
 */
public class PF  extends Cliente{

    private String cpf ;
    private Date date;
    
    
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

    public Date getDate() {
        return date;
    }

    public void setDate (Date date) throws DataInvalida {
        int idade;

        Date dataAtual = new Date(System.currentTimeMillis());

        LocalDate dataRecebida = LocalDate.parse((CharSequence) date);
        LocalDate dataAtualizada = LocalDate.parse((CharSequence) dataAtual);

        int ano = dataRecebida.getYear();
        int mes = dataRecebida.getMonthValue();
        int dia = dataRecebida.getDayOfMonth();

        int anoatual = dataAtualizada.getYear();
        int mesatual = dataAtualizada.getMonthValue();
        int diaatual = dataAtualizada.getDayOfMonth();

        int totalIdade = 365 * anoatual + 30 * mesatual + diaatual - 365 * ano - 30 * mes - dia;

        idade = totalIdade / 365;

        if(idade > 18)
            this.date = date;
        else
            throw new DataInvalida();
    }
    
 
    
   
}
