public class Fila {
    private int dados[];
    private int primeiro=0;
    private int ultimo=0;
    private int cont=0;

    public Fila () {
        this.dados = new int[10];
    }

    public Fila (int capacidade) {
        this.dados = new int[capacidade];
    }

    public boolean estaVazia() {
        return this.cont == 0;
    }
    public boolean estaCheia() {
        return this.cont == this.dados.length;
    }
    int proxima (int pos) {
        return (pos + 1) % this.dados.length;
    }
    public void insereFila (int i) {
        this.dados[this.ultimo] = i;
        this.ultimo = proxima(this.ultimo);
        this.cont++;
    }
    public int removeFila () {
        int i = this.dados[this.primeiro];
        this.primeiro = proxima(this.primeiro);
        this.cont--;
        return i;
    }

    public int tamanhoFila () {
        return this.cont;
    }

    public int primeiro () {
        return this.dados[this.primeiro];
    }
    
    public int ultimo () {
        int i = this.ultimo;
        if(i > 0){
            return this.dados[i - 1];
        }
        else {
            return this.dados[i];
        }
    }

    @Override
    public String toString () {
        String aux = "Fila: [";
        if (this.estaVazia()) {
            aux = aux + "vazia";
        }
        else {
            int i=this.primeiro;
            do{
                aux = aux + this.dados[i] + " ";
                i=proxima(i);
            } while (i!=this.ultimo);
        }
        aux = aux + "]";
        return aux;
    }
    public void mostraVetor() {
        int i;
        if (this.estaVazia()) {
            for (i=0; i<this.dados.length; i++) {
                System.out.print("_ ");
            }
        }
        else if (this.estaCheia()) {
            for (i=0; i<this.dados.length; i++) {
                System.out.print(this.dados[i] + " ");
            }
        }
        else if (this.primeiro < this.ultimo) {
            for (i=0; i<this.primeiro; i++) {
                System.out.print("_ ");
            }
            for (i=this.primeiro; i<this.ultimo; i++) {
                System.out.print(this.dados[i] + " ");
            }
            for (i=this.ultimo; i<this.dados.length; i++) {
                System.out.print("_ ");
            }
        }
        else {
            for (i=0; i<this.ultimo; i++) {
                System.out.print(this.dados[i] + " ");
            }
            for (i=this.ultimo; i<this.primeiro; i++) {
                System.out.print("_ ");
            }
            for (i=this.primeiro; i<this.dados.length; i++) {
                System.out.print(this.dados[i] + " ");
            }
        }
    }
}