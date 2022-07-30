package ufjf.dcc025.trabalhooo.controller;

import java.util.Date;

import ufjf.dcc025.trabalhooo.model.Maquina;

public class MaquinaController {
    public static void create(String nome, double peso, Date dataDeManutencao){
        Maquina maquina = new Maquina();
        maquina.setNome(nome);
        maquina.setPeso(peso);
        maquina.setDataDeManutencao(dataDeManutencao);
        Maquina.addMaquina(maquina);
    }

    public static void update(String nome, double peso, Date dataDeManutencao, int id){
        Maquina maquina = Maquina.getMaquina(id);
        maquina.setNome(nome);
        maquina.setPeso(peso);
        maquina.setDataDeManutencao(dataDeManutencao);
    }

    public static void delete(int id){
        Maquina.deleteMaquina(id);
    }
}