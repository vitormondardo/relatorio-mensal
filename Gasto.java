package trab2pooi;

//import java.util.Scanner;

public class Gasto {
    // ATRIBUTOS
    public int tipoGasto;
    public String dataGasto;
    public int formaPagamento;
    public int valGasto;
    public int valSaude, valTransporte, valAlimentacao; // variáveis para o relatório

    //CONSTRUCTOR
    public Gasto(int tipoGasto, String dataGasto, int formaPagamento, int valGasto){
        this.tipoGasto = tipoGasto;
        this.dataGasto = dataGasto;
        this.formaPagamento = formaPagamento;
        this.valGasto = valGasto;
    }
    //MÉTODOS PÚBLICOS

    public void relatorioGasto(){
        System.out.println("Total de gastos com Transporte: " + this.valTransporte);
        System.out.println("Total de gastos com Saúde: " + this.valSaude);
        System.out.println("Total de gastos com Alimentação: " + this.valAlimentacao);
    }
    //GETTERS E SETTERS

    public int getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(int tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public String getDataGasto() {
        return dataGasto;
    }

    public void setDataGasto(String dataGasto) {
        this.dataGasto = dataGasto;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getValGasto() {
        return valGasto;
    }

    public void setValGasto(int valGasto) {
        this.valGasto = valGasto;
    }
    public int getValSaude() {
        return valSaude;
    }
    public void setValSaude(int valSaude) {
        this.valSaude = valSaude;
    }
    public int getValTransporte() {
        return valTransporte;
    }
    public void setValTransporte(int valTransporte) {
        this.valTransporte = valTransporte;
    }
    public int getValAlimentacao() {
        return valAlimentacao;
    }
    public void setValAlimentacao(int valAlimentacao) {
        this.valAlimentacao = valAlimentacao;
    }
    
    
}
