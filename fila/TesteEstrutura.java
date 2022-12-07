import java.util.Random;

public class TesteEstrutura {
    public static void main (String args[]) {
        Random random = new Random();
        Fila f = new Fila(8);
        int primeiro;
        int ultimo;
        int tamanhoFila;
        
        do {
            if (random.nextInt(2) == 1) {
                if (!f.estaCheia()) {
                    f.insereFila(random.nextInt(10));
                }
            }
            else {
                if (!f.estaVazia()) {
                    int j = f.removeFila();
                }
            }
            f.mostraVetor();
            
            primeiro = f.primeiro();
            ultimo = f.ultimo();
            tamanhoFila = f.tamanhoFila();
            
            if(tamanhoFila == 0){
                System.out.println(" | Primeiro: nao ha | Ultimo: nao ha | Tamanho da Fila: " + tamanhoFila + " | " + f);
            }
            else {
                System.out.println(" | Primeiro: " + primeiro + " | Ultimo: " + ultimo + " | Tamanho da Fila: " + tamanhoFila + " | " + f);
            }

        } while (!f.estaVazia());
    }
}
