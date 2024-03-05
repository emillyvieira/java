package aula04;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author cg3028569
 */
public class Gerente extends Funcionario {

    private String usuario;
    private String senha;
    
    public Gerente (String nome, String usuario, String senha) {
        super(nome);
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public double calculaBonificacao() {
        return this.getSalario() * 0.6 + 100;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

}
