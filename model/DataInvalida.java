package ufjf.dcc025.trabalhooo.model;

public class DataInvalida extends Exception{
    public DataInvalida() {
        super("Menor de 18 anos,não possivel fazer o cadastro! ");
    }
}
