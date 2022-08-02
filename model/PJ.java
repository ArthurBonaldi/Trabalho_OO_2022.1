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
public class PJ extends Cliente {

    private static List<PJ> pessoasJ = new ArrayList<>();
    private static int currentId = 1;

    private int pessoaJId;

    public PJ() {
    }

    public static List<PJ> getPJs() {
        return pessoasJ;
    }

    public int getId() {
        return pessoaJId;
    }

    public void setId(int id) {
        this.pessoaJId = id;
    }

    public static void addPessoaJ(PJ pj) {
        pj.setId(currentId);
        pessoasJ.add(pj);
        currentId++;
    }

    public static PJ getPessoaJ(int id) {

        PJ Pessoasj = new PJ();

        for (PJ pj : pessoasJ) {
            if (pj.getId() == id) {
                Pessoasj = pj;
            }
        }

        return Pessoasj;
    }

    @Override
    public String getRegistro() {
        return this.registro;
    }

    @Override
    public void setRegistro(String registro) throws CNPJInvalido {
        if (registro.length() == 14 && registro.matches("[0-9]*")) {
            this.registro = registro;
        } else {
            throw new CNPJInvalido();
        }
    }

    public static PJ getPJ(int id) {
        PJ pf = new PJ();
        for (PJ p : pessoasJ) {
            if (p.getId() == id) {
                pf = p;
            }
        }
        return pf;
    }
        public static void deletePJ(int id) {
        pessoasJ.remove(getPJ(id));
    }
}
