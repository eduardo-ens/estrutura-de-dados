public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data (int dia, int mes, int ano) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void calculaOntem() {
        if (this.dia > 1) {
            this.dia--;
        }
        else if(this.mes > 1) {
            this.dia = 30;
            this.mes--;
        }
        else {
            this.dia = 30;
            this.mes = 12;
            this.ano--;
        }
    }

    public void calculaAmanha() {
        if(this.dia == 30 && this.mes < 12) {
            this.dia = 1;
            this.mes++;
        }
        else if(this.dia == 30 && this.mes == 12) {
            this.dia = 1;
            this.mes = 1;
            this.ano++;
        }
        else {
            this.dia++;
        }
    }
    @Override
    public String toString() {
        return "Data [dia: " + dia + ", mes: " + mes + ", ano: " + ano + "]"; 
    }
}