/**
 *
 * @autor tathiany.marquesani
 */
public class Agenda {
    private int ano;
    private String mes;
    private int dia;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void cadastrarAno(int ano) {
        setAno(ano);
    }

}
