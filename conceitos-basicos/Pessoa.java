public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private char sexo;

    public void setPessoa(String nome, String sobrenome, int idade, char sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void imprimir(){
        System.out.println("Nome Completo: " + nome + " " + sobrenome + "\nIdade: " + idade + "\nSexo: " + sexo);
    }
}