/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03ex;

/**
 *
 * @author emilly
 */
public class Funcionario {

    String nome;
    String rg;
    String departamento;
    double salario;
    String dataEntrada;

    public Funcionario() {
    }

    public Funcionario(String nome, String rg, String departamento, double salario, String dataEntrada) {
        this.nome = nome;
        this.rg = rg;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public double recebeAumento(double aumento) {
        this.salario += aumento;
        return salario;
    }

    public double calculaGanhoAnual() {
        return salario * 12;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", dataEntrada='" + dataEntrada + '\'' +
                '}';
    }
}
