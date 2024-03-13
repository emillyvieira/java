/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03ex;

/**
 *
 * @author emilly
 */
import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    // Construtor que inicializa os atributos e verifica a validade da data
    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida.");
        }
    }

    // Construtor que inicializa com a data atual
    public Data() {
        LocalDate dataAtual = LocalDate.now();
        this.dia = dataAtual.getDayOfMonth();
        this.mes = dataAtual.getMonthValue();
        this.ano = dataAtual.getYear();
    }

    // Método para avançar a data para o dia seguinte
    public void proximoDia() {
        dia++;
        if (!validaData(dia, mes, ano)) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                ano++;
            }
        }
    }

    // Método para verificar se um ano é bissexto
    public boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Método para comparar duas datas
    public int compararData(Data outraData) {
        if (this.ano == outraData.ano && this.mes == outraData.mes && this.dia == outraData.dia) {
            return 0;
        } else if (this.ano > outraData.ano || (this.ano == outraData.ano && this.mes > outraData.mes)
                || (this.ano == outraData.ano && this.mes == outraData.mes && this.dia > outraData.dia)) {
            return 1;
        } else {
            return -1;
        }
    }

    // Getters e setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido para este mês/ano.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (validaData(dia, mes, ano)) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (validaData(dia, mes, ano)) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido.");
        }
    }

    // Método para formatar a data como string
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    // Método para validar uma data
    private boolean validaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > diasNoMes(mes, ano)) {
            return false;
        }
        return true;
    }

    // Método para obter o número de dias em um mês
    private int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return ehBissexto(ano) ? 29 : 28;
            default:
                return 31;
        }
    }

}
