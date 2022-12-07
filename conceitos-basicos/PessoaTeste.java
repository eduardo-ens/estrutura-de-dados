public class PessoaTeste {
    public static void main (String args[]){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setPessoa("João", "da Silva", 75, 'M');
        pessoa1.imprimir();
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setPessoa("Maria", "das Flores", 70, 'F');
        pessoa2.imprimir();
    }
}