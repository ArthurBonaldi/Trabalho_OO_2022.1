package ufjf.dcc025.trabalhooo.model;

import java.util.ArrayList;
import java.util.List;

public class Maquina {
    public String nome;
    public String peso;
    public String dataDeManutencao;
    private int id;
    private static int currentId = 1;

    private static List<Maquina> maquinas = new ArrayList<>();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) throws NomeInvalido{
        //verifica se nome das maquinas são iguais
        for (Maquina mq: maquinas){
            if(mq.getNome().equals(nome)){
                throw new NomeInvalido();
            }
        }
        String aux = nome;
        if (!aux.replaceAll(" ", "").toLowerCase().matches("[a-z]*") || aux.length() < 3) {
            throw new NomeInvalido();
        }
        else
            this.nome = nome;
    }

    public static List<Maquina> getMaquinas() {
        return maquinas;
    }

    public double getPeso() {
        double aDouble = Double.parseDouble(this.peso.replaceAll(",", "."));
        return aDouble;
    }

    public void setPeso(String peso) throws NumeroInvalido{
        String aux = peso.replaceAll(".",",");
        if (!aux.replaceAll("," , "").matches("[0-9]*")) {
            throw new NumeroInvalido();
        }
        else
            this.peso = peso;
    }

    public String  getDataDeManutencao() {
        return this.dataDeManutencao;
    }

    public void setDataDeManutencao(String dataDeManutencao){

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
