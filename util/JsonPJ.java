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
import ufjf.dcc025.trabalhooo.model.PJ;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class JsonPJ {
    public static String toJSON(PJ pj) {
        Gson gson = new Gson();
        String json = gson.toJson(pj);
        return json;
    }
     public static String toJSON(List<PJ> pjs) {
        Gson gson = new Gson();
        String json = gson.toJson(pjs);
        return json;
    }
     public static PJ toPJ(String conteudo) {
        Gson gson = new Gson();
        PJ pj = gson.fromJson(conteudo, PJ.class);

        return pj;
    }
    public static List<PJ> toPJs(String conteudo) {
        Gson gson = new Gson();
        Type pj = new TypeToken<ArrayList<PJ>>() {
        }.getType();
        List<PJ> pjs = gson.fromJson(conteudo, pj);

        return pjs;
    }
}
