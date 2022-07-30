package ufjf.dcc025.trabalhooo.model;

public class SenhaInvalida extends Exception {
    public SenhaInvalida() {
        super("Senha Invalida,A senha deve conter mais de seis e menos que doze caracteres!");
    }
}
