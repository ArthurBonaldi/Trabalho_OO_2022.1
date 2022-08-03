/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhooo.model;



/**
 *
 * @author Arthur Bonaldi Fernandes - 202065567C
 * @author Joel Henrique Nunes de Oliveira Silva - 202076030
 * @author Miguel Sales de Almeida Lopes - 202076024
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
        //verifica se o emial do cliente já foi registrado!
        for(PF pf: PF.getPFs()){
            if(pf.getEmail().equals(email)){
                throw new EmailInvalido();
            }
        }
        for(PJ pj: PJ.getPJs()){
            if(pj.getEmail().equals(email)){
                throw new EmailInvalido();
            }
        }

        if(!email.contains("@") || !email.contains(".com"))
            throw new EmailInvalido();
        else
            this.email = email;
    }
    
    public abstract String getRegistro();

    public abstract void setRegistro (String registro) throws CPFInvalido, CNPJInvalido;
}
