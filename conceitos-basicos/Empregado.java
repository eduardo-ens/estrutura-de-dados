public class Empregado {
    private String nome;
    private double salario;

    public void setEmpregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void imprimir(){
        System.out.println("Nome do(a) Empregado(a): " + nome + "\nSalario: " + String.format("%.2f", salario));
    }

    public void aumentarSalario(double percentual) {
        this.salario = this.salario + (this.salario * percentual/100);
        System.out.println("----------------");
        System.out.println("SALÁRIO ALTERADO");
        imprimir();
        System.out.println("Aumento salarial foi de " + percentual + "%");
    }
}