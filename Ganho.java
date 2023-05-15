package trab2pooi;

public class Ganho {
    // ATRIBUTOS
    public int tipoGanho;
    public String dataGanho;
    public int valGanho;
    // MÉTODOS
    public Ganho (int tipoGanho, String dataGanho, int valGanho){
        this.tipoGanho = tipoGanho;
        this.dataGanho = dataGanho;
        this.valGanho = valGanho;
    }
    // GETTERS E SETTERS
    public int getTipoGanho(){
        return tipoGanho;
    }
    public void setTipoGanho(int tipoGanho){
        this.tipoGanho = tipoGanho;
    }
    public String getDataGanho(){
        return dataGanho;
    }
    public void setDataGanho(String dataGanho){
        this.dataGanho = dataGanho;
    }
    public int getValGanho(){
        return valGanho;
    }
    public void setValGanho(int valGanho){
        this.valGanho = valGanho;
    }
}

