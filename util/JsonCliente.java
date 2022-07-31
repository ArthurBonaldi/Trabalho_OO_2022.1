/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.util;

/**
 *
 * @author arthu
 */

public class JsonCliente {
    public static String toJSON(Cliente cliente) {
        Gson gson = new Gson();
        String json = gson.toJson(cliente);
        return json;
    }
     public static String toJSON(List<Cliente> clientes) {
        Gson gson = new Gson();
        String json = gson.toJson(clientes);
        return json;
    }
     public static Cliente toCliente(String conteudo) {
        Gson gson = new Gson();
        Cliente cliente = gson.fromJson(conteudo, Cliente.class);

        return cliente;
    }
    public static List<Cliente> toClientes(String conteudo) {
        Gson gson = new Gson();
        Type cliente = new TypeToken<ArrayList<Cliente>>() {
        }.getType();
        List<Cliente> clientes = gson.fromJson(conteudo, clientes);

        return clientes;
    }
}
