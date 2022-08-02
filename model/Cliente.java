/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.model;



/**
 *
 * @author salesmiguelz
 */
public abstract class Cliente  {
    
    protected String nome;
    protected String email;
    protected String registro;
    
    public Cliente(){
     
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) throws NomeInvalido{
        String aux=nome;
        if (!aux.replaceAll(" ", "").toLowerCase().matches("[a-z]*") || nome.length() < 3) {
            throw new NomeInvalido();
        }
        else
            this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailInvalido{
        if(!email.contains("@") || !email.contains(".com"))
            throw new EmailInvalido();
        else
            this.email = email;
    }
    
    public abstract String getRegistro();

    public abstract void setRegistro (String registro) throws CPFInvalido, CNPJInvalido;
}
