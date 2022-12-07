public class EmpregadoTeste {
    public static void main(String args[]) {
        Empregado empregado1 = new Empregado();
        empregado1.setEmpregado("Roberta", 1100);
        empregado1.imprimir();
        empregado1.aumentarSalario(20);
    }
}