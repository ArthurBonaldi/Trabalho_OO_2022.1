package ufjf.dcc025.trabalhooo.model;

/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
 */

public class EmailInvalido extends Exception {
    public EmailInvalido() {
        super("Email não contem @ ou .com !");
    }
}
