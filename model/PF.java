/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.model;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
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
        LocalDate dataRecebida = date.toInstant().atZone( ZoneId.systemDefault() ).toLocalDate();
        final LocalDate dataAtual = LocalDate.now();
        final Period periodo = Period.between(dataRecebida, dataAtual);

        if (periodo.getYears() > 18)
            this.date = date;
        else
            throw new DataInvalida();
    }
 
    
   
}
