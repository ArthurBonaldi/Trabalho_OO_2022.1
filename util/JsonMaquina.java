/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.util;

/**
 *
 * @author arthu
 */
public class JsonMaquina {
    public static String toJSON(Maquina maquina) {
        Gson gson = new Gson();
        String json = gson.toJson(maquina);
        return json;
    }
     public static String toJSON(List<Maquina> maquinas) {
        Gson gson = new Gson();
        String json = gson.toJson(maquinas);
        return json;
    }
     public static Maquina toMaquina(String conteudo) {
        Gson gson = new Gson();
        Maquina maquina = gson.fromJson(conteudo, Maquina.class);

        return maquina;
    }
    public static List<Maquina> toMaquinas(String conteudo) {
        Gson gson = new Gson();
        Type maquinas = new TypeToken<ArrayList<Maquina>>() {
        }.getType();
        List<Maquina> contatos = gson.fromJson(conteudo, maquinas);

        return contatos;
    }
}
