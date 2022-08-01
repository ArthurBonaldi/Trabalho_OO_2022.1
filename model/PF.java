/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.model;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author salesmiguelz
 */
public class PF  extends Cliente{

    private String cpf ;
    private String date;
    private static List<PF> PessoasF = new ArrayList<>();
    private static int currentId =1;

    private int userId;
    
    public PF(){
    }
    public int getId() {
        return userId;
    }
    public void setId(int id){
        this.userId = id;
    }
    public static void addPessoaF(PF pf){
        pf.setId(currentId);
        PessoasF.add(pf);
        currentId++;
    }
    public static PF getPessoaF(int id){
        PF Pessoasf = new PF();

        for(PF pf: PessoasF){
            if(pf.getId() == id){
                Pessoasf = pf;
            }
        }

        return Pessoasf;
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
    }

    public void setDate (String date) throws DataInvalida {
        int idade=0;
        final LocalDate dataAtual = LocalDate.now();

        int anoatual = dataAtual.getYear();
        int mesatual = dataAtual.getMonthValue();
        int diaatual = dataAtual.getDayOfMonth();

        int ano = Integer.parseInt(date.trim().substring(6));
        int mes = Integer.parseInt(date.trim().substring(3,5));
        int dia = Integer.parseInt(date.trim().substring(0,2));

        int totalIdade = 365 * anoatual + 30 * mesatual + diaatual - 365 * ano - 30 * mes - dia;

        idade = totalIdade / 365;

        if(idade > 18)
            this.date = date;
        else
            throw new DataInvalida();
    }

 
    
   
}
