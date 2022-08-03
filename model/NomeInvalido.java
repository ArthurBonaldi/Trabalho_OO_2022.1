package ufjf.dcc025.trabalhooo.model;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */
public class NomeInvalido extends Exception{
    public NomeInvalido() {
        super("O Campo contém caracteres Invalidos ou tem tamanho menor que 3 ");
    }
}
