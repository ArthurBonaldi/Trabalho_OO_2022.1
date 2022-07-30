package ufjf.dcc025.trabalhooo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Maquina {
    public String nome;
    public String peso;
    public Date dataDeManutencao;
    private int id;
    private static int currentId;

    private static List<Maquina> maquinas = new ArrayList<>();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) throws NomeInvalido{
        String aux = nome;
        if (!aux.replaceAll(" ", "").toLowerCase().matches("[a-z]*") || nome.length() < 3) {
            throw new NomeInvalido();
        }
        else
            this.nome = nome;
    }

    public double getPeso() {
        double aDouble = Double.parseDouble(this.peso.replaceAll(",", "."));
        return aDouble;
    }

    public void setPeso(String peso) throws NumeroInvalido{//
        String aux = peso.replaceAll(".",",");
        if (!aux.replaceAll("," , "").toLowerCase().matches("[0-9]*")) {
            throw new NumeroInvalido();
        }
        else
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
