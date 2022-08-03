/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.util;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class Arquivo {

    public static String leArquivo(String caminho) throws FileNotFoundException {
        String local = "\\src\\main\\java\\ufjf\\dcc025\\trabalhooo\\arquivos";
        StringBuilder conteudo = new StringBuilder();
        File diretorio = new File(System.getProperty("user.dir"));
        File arquivo = new File(diretorio + local +"\\" + caminho);
        Scanner leitor = new Scanner(arquivo);

        while (leitor.hasNextLine()) {
            conteudo.append(leitor.nextLine()).append("\n");
        }
        return conteudo.toString();
    }

    public static void escreverArquivo(String caminho, String conteudo) {
        FileWriter fwArquivo;
        BufferedWriter bwArquivo;
        String local = "\\src\\main\\java\\ufjf\\dcc025\\trabalhooo\\arquivos";
        try {
            File diretorio = new File(System.getProperty("user.dir"));
            File arquivo = new File(diretorio + local, caminho);

            //Se o arquivo já existir, então abrir para concatenação, caso contrário criar novo arquivo
            fwArquivo = new FileWriter(arquivo, false);
            bwArquivo = new BufferedWriter(fwArquivo);

            // escrevendo String no arquivo e adicionando caracter para criar nova linha
            bwArquivo.write(conteudo + '\n');

            // fechando o arquivo
            bwArquivo.close();
            fwArquivo.close();

        } catch (IOException e) {
            System.err.println("Erro ao tentar escrever no arquivo: " + e.toString());
        }
    }

}
