package ufjf.dcc025.trabalhooo.model;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class SenhaInvalida extends Exception {
    public SenhaInvalida() {
        super("Senha Invalida,A senha deve conter mais de seis e menos que doze caracteres!");
    }
}
