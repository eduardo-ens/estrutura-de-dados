public class TesteFila {
    public static void main (String args[]) {
        Fila f = new Fila(6);
        System.out.println(f);
        int i = 1;
        while (!f.estaCheia()) {
            f.insereFila(i++);
            System.out.println(f); 
        }
        while (!f.estaVazia()) {
            System.out.println(f.removeFila() + " foi atendido");
            System.out.println(f);
        }
    }
}
