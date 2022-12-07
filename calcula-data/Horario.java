public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int hora, int minuto, int segundo) {
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void passaTempo() {
        if(this.segundo == 59 && this.minuto == 59 && this.hora == 23) {
            this.segundo = 0;
            this.minuto = 0;
            this.hora = 0;
        }
        else if(this.segundo == 59 && this.minuto == 59 && this.hora < 23) {
            this.segundo = 0;
            this.minuto = 0;
            this.hora++;
        }
        else if (this.segundo == 59 && this.minuto < 59) {
            this.segundo = 0;
            this.minuto++;
        }
        else {
            this.segundo++;
        }
    }

    @Override
    public String toString() {
        return "Horario [hora: " + hora + ", minuto: " + minuto + ", segundo: " + segundo + "]";
    }

}