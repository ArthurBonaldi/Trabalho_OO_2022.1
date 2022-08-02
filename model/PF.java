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
public class PF extends Cliente {
    private String date;
    private static List<PF> pessoasF = new ArrayList<>();
    private static int currentId = 1;

    private int pessoaFId;

    public PF() {
    }

    public static List<PF> getPFs() {
        return pessoasF;
    }

    public int getId() {
        return pessoaFId;
    }

    public void setId(int id) {
        this.pessoaFId = id;
    }

    public static void addPessoaF(PF pf) {
        pf.setId(currentId);
        pessoasF.add(pf);
        currentId++;
    }

    public static PF getPessoaF(int id) {
        PF pessoasf = new PF();
        for (PF pf : pessoasF) {
            if (pf.getId() == id) {
                pessoasf = pf;
            }
        }
        return pessoasf;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) throws DataInvalida {
        int idade = 0;
        final LocalDate dataAtual = LocalDate.now();

        int anoatual = dataAtual.getYear();
        int mesatual = dataAtual.getMonthValue();
        int diaatual = dataAtual.getDayOfMonth();

        int ano = Integer.parseInt(date.trim().substring(6));
        int mes = Integer.parseInt(date.trim().substring(3, 5));
        int dia = Integer.parseInt(date.trim().substring(0, 2));

        int totalIdade = 365 * anoatual + 30 * mesatual + diaatual - 365 * ano - 30 * mes - dia;

        idade = totalIdade / 365;

        if (idade > 18) {
            this.date = date;
        } else {
            throw new DataInvalida();
        }
    }

    @Override
    public String getRegistro() {
        return this.registro;
    }

    @Override
    public void setRegistro(String registro) throws CPFInvalido {
        if (registro.length() == 11 && registro.matches("[0-9]*")) {
             this.registro = registro;
        } else {
            throw new CPFInvalido();
        }
    }

    public static PF getPF(int id) {
        PF pf = new PF();
        for (PF p : pessoasF) {
            if (p.getId() == id) {
                pf = p;
            }
        }
        return pf;
    }

    public static void deletePF(int id) {
        pessoasF.remove(getPF(id));
    }

}
