package ufjf.dcc025.trabalhooo.controller;

import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;

import ufjf.dcc025.trabalhooo.model.Maquina;
import ufjf.dcc025.trabalhooo.model.NomeInvalido;
import ufjf.dcc025.trabalhooo.model.NumeroInvalido;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class MaquinaController {

    public static Maquina create(String nome, String peso, String dataDeManutencao) {
        Maquina maquina = new Maquina();
        try {
            maquina.setNome(nome);
            maquina.setPeso(peso);
            maquina.setDataDeManutencao(dataDeManutencao);
            Maquina.addMaquina(maquina);
        } catch (NomeInvalido Nm) {
            JOptionPane.showMessageDialog(null, Nm.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumeroInvalido Num) {
            JOptionPane.showMessageDialog(null, Num.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception Dt) {
            JOptionPane.showMessageDialog(null, Dt.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        }
        return maquina;
    }

    public static Maquina update(String nome, String peso, String dataDeManutencao, int id) {
        Maquina maquina = Maquina.getMaquina(id);
        try {
            maquina.setNome(nome);
            maquina.setPeso(peso);
            maquina.setDataDeManutencao(dataDeManutencao);
        } catch (NomeInvalido Nm) {
            JOptionPane.showMessageDialog(null, Nm.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumeroInvalido Num) {
            JOptionPane.showMessageDialog(null, Num.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception Dt) {
            JOptionPane.showMessageDialog(null, Dt.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        }
        return maquina;
    }

    public static void delete(int id) {
        Maquina.deleteMaquina(id);
    }
}
