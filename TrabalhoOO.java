/*
 Alunos:
Miguel Sales de Almeida Lopes - 202076024
Arthur Bonaldi Fernandes - 202065567C
Joel Henrique Nunes de Oliveira Silva - 202076030

Link do repositório: https://github.com/ArthurBonaldi/Trabalho_OO_2022.1
 */
package ufjf.dcc025.trabalhooo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author salesmiguelz
 */
public class TrabalhoOO {
    public static String BASE_PATH = "src/main/java/ufjf/dcc025/trabalhooo/";
    
    public static boolean escrever(String path, String conteudo) {
         try {
            FileWriter arq = new FileWriter(path);
            PrintWriter escrita = new PrintWriter(arq);
            escrita.println(conteudo);
            escrita.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public static String ler(String path){
        String conteudo = "";
        try {
            FileReader arq = new FileReader(path);
            BufferedReader leitura = new BufferedReader(arq);
            String linha="";
            try {
                linha = leitura.readLine();
                while(linha!=null){
                    conteudo += linha+"\n";
                    linha = leitura.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                System.out.println("Houve um erro na leitura do arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("O arquivo não foi encontrado!");
            return "";
        }
    }

    public static void main(String[] args) {
        int opcao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma opção: ");
        System.out.println("1 - Listar Clientes \r\n"
                + "2 - Listar Funcionários   \r\n"
                + "3 - Listar Máquinas   \r\n"
                + "4 - Listar Produtos   \r\n"
                + "0 - SAIR   \r\n");
        opcao = teclado.nextInt();
        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    escrever(BASE_PATH + "clientes.txt", "Isso eh um teste de escrita");
                    System.out.println(ler(BASE_PATH + "clientes.txt"));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            
         System.out.println("Digite uma opção: ");
         System.out.println("1 - Listar Clientes \r\n"
                + "2 - Listar Funcionários   \r\n"
                + "3 - Listar Máquinas   \r\n"
                + "4 - Listar Produtos   \r\n"
                + "0 - SAIR   \r\n");
          opcao = teclado.nextInt();
        }
    }
}
