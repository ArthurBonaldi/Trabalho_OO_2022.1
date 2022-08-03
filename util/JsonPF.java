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
import ufjf.dcc025.trabalhooo.model.PF;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class JsonPF {
    public static String toJSON(PF pf) {
        Gson gson = new Gson();
        String json = gson.toJson(pf);
        return json;
    }
     public static String toJSON(List<PF> pfs) {
        Gson gson = new Gson();
        String json = gson.toJson(pfs);
        return json;
    }
     public static PF toPF(String conteudo) {
        Gson gson = new Gson();
        PF pf = gson.fromJson(conteudo, PF.class);

        return pf;
    }
    public static List<PF> toPFs(String conteudo) {
        Gson gson = new Gson();
        Type pf = new TypeToken<ArrayList<PF>>() {
        }.getType();
        List<PF> pfs = gson.fromJson(conteudo, pf);

        return pfs;
    }
}
