public class Calendario {
    private Horario horario;
    private Data data;

    public Calendario(Horario horario, Data data) {
        this.horario = horario;
        this.data = data;
    }

    public Horario getHorario() {
        return this.horario;
    }

    public Data getData() {
        return this.data;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Calendario [" + data + ", " + horario + "]";
    }
}