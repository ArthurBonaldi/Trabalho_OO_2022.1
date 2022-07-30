package ufjf.dcc025.trabalhooo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Maquina {
    public String nome;
    public double peso;
    public Date dataDeManutencao;
    private int id;
    private static int currentId;

    private static List<Maquina> maquinas = new ArrayList<>();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getDataDeManutencao() {
        return this.dataDeManutencao;
    }

    public void setDataDeManutencao(Date dataDeManutencao) {
        this.dataDeManutencao = dataDeManutencao;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void addMaquina(Maquina m){
        m.setId(currentId);
        maquinas.add(m);
        currentId++;
    }
    public static Maquina getMaquina(int id){
        Maquina maquina = new Maquina();
        for(Maquina m : maquinas){
            if(m.getId() == id){
                maquina = m;
            }
        }

        return maquina;
    }
    
    public static void deleteMaquina(int id){
        maquinas.remove(getMaquina(id));
    }
}
