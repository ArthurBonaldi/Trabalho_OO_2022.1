package ufjf.dcc025.trabalhooo.controller;

import java.text.ParseException;
import java.util.Date;

import ufjf.dcc025.trabalhooo.model.Maquina;
import ufjf.dcc025.trabalhooo.model.NomeInvalido;
import ufjf.dcc025.trabalhooo.model.NumeroInvalido;

public class MaquinaController {
    public static Maquina create(String nome, String peso, String dataDeManutencao){
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
        }catch (Exception Dt){
            System.out.println("Data Invalida!");
        }
        return maquina;
    }

    public static Maquina update(String nome, String peso, String dataDeManutencao, int id){
        Maquina maquina = Maquina.getMaquina(id);
        try {
            maquina.setNome(nome);
            maquina.setPeso(peso);
            maquina.setDataDeManutencao(dataDeManutencao);
        }catch (NomeInvalido Nm){
            System.out.println(Nm.getMessage());
        }catch (NumeroInvalido Num) {
            System.out.println(Num.getMessage());
        }catch (Exception Dt){
            System.out.println("Data Invalida!");
        }
        return maquina;
    }

    public static void delete(int id){
        Maquina.deleteMaquina(id);
    }
}