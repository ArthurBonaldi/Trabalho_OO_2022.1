package ufjf.dcc025.trabalhooo.controller;

import java.util.Date;

import ufjf.dcc025.trabalhooo.model.Maquina;
import ufjf.dcc025.trabalhooo.model.NomeInvalido;
import ufjf.dcc025.trabalhooo.model.NumeroInvalido;

public class MaquinaController {
    public static void create(String nome, String peso, Date dataDeManutencao){
        Maquina maquina = new Maquina();
        try {
            maquina.setNome(nome);
            maquina.setPeso(peso);
            maquina.setDataDeManutencao(dataDeManutencao);
            Maquina.addMaquina(maquina);
        }catch (NomeInvalido Nm){
            System.out.println(Nm.getMessage());
        }catch (NumeroInvalido Num) {
            System.out.println(Num.getMessage());
        }
    }

    public static void update(String nome, String peso, Date dataDeManutencao, int id){
        Maquina maquina = Maquina.getMaquina(id);
        try {
            maquina.setNome(nome);
            maquina.setPeso(peso);
            maquina.setDataDeManutencao(dataDeManutencao);
        }catch (NomeInvalido Nm){
            System.out.println(Nm.getMessage());
        }catch (NumeroInvalido Num) {
            System.out.println(Num.getMessage());
        }
    }

    public static void delete(int id){
        Maquina.deleteMaquina(id);
    }
}