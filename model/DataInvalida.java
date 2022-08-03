package ufjf.dcc025.trabalhooo.model;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */

public class DataInvalida extends Exception{
    public DataInvalida() {
        super("Menor de 18 anos,não possivel fazer o cadastro! ");
    }
}
