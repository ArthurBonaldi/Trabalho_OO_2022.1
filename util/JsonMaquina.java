/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import ufjf.dcc025.trabalhooo.model.Maquina;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
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
        Type maquina = new TypeToken<ArrayList<Maquina>>() {
        }.getType();
        List<Maquina> maquinas = gson.fromJson(conteudo, maquina);

        return maquinas;
    }
}
