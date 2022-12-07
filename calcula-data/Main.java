public class Main {
    public static void main(String args[]) {
        Horario horario1 = new Horario(5, 50, 46);
        Data data1 = new Data(30, 12, 1995);
        Horario horario2 = new Horario(23, 59, 59);
        Data data2 = new Data(2, 11, 2020);

        Calendario calendario1;

        calendario1 = new Calendario(horario1, data1);
        System.out.println(calendario1);
        horario1.passaTempo();
        System.out.println(calendario1);
        data1.calculaAmanha();
        System.out.println(calendario1);

        Calendario calendario2;

        calendario2 = new Calendario(horario2, data2); 
        System.out.println(calendario2);
        horario2.passaTempo();
        System.out.println(calendario2);
        data2.calculaOntem();
        System.out.println(calendario2);
    }
    
}