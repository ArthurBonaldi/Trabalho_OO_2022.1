package ufjf.dcc025.trabalhooo.model;

public class EmailInvalido extends Exception {
    public EmailInvalido() {
        super("Email não contem @ ou .com !");
    }
}
