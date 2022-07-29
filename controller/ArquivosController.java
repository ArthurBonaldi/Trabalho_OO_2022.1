/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.controller;
/**
 *
 * @author arthu
 */


import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ufjf.dcc025.trabalhooo.model.Cliente;

public class ArquivosController {

    public static void insere(String arquivo, Cliente c){
        
    }
    public static void busca(String arquivo, int id){

    }

    public static void atualiza(){

    }

    public static void deleta(){

    }
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        p.setId(1);
        p.setNome("Miguel");
        p.setIdade(16);
        System.out.println(new Gson().toJson(p));  


        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // create a writer
            Writer writer = Files.newBufferedWriter(Paths.get("user.json"));
        
            // convert user object to JSON file
            gson.toJson(p, writer);
            gson.toJson(p, writer);
            gson.toJson(p, writer);
        
            // close writer
            writer.close();
            writer.close();
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
   
}
