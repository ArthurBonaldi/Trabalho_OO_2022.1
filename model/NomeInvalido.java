package ufjf.dcc025.trabalhooo.model;

public class NomeInvalido extends Exception{
    public NomeInvalido() {
        super("O Campo contém caracteres Invalidos ou tem tamanho menor que 3 ");
    }
}
