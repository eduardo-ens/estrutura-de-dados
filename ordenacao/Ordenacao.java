import java.util.Scanner;

import java.util.Random;

public class Ordenacao {
    static void geraVetor (int[] v, int n){
        Random random = new Random();
        for (int i=0; i<n; i++) {
            v[i] = random.nextInt(10*n);
        }
    }
    
    static void mostraVetor (String msg, int[] v, int n) {
        System.out.println("\n" + msg);
        for (int i=0; i<n; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();        
    }

        static void bubble (int[] v, int n) {
            int i, j, aux;
            for (i=1; i<n; i++) {
                for(j=0; j<n-1; j++) {
                    if (v[j] > v[j+1]) {
                        aux = v[j];
                        v[j] = v[j+1];
                        v[j+1] = aux;
                    }
                }
            }
        }

        static void insertion (int v[], int n) {
           for (int j = 1; j < n; ++j) {
              int x = v[j];
              int i;
              for (i = j-1; i >= 0 && v[i] > x; --i) 
                 v[i+1] = v[i];
              v[i+1] = x;
           }
        }

        static void quicksort (int v[], int p, int r) {
           if (p < r) {                   // 1
              int j = separa (v, p, r);   // 2
              quicksort (v, p, j-1);      // 3
              quicksort (v, j+1, r);      // 4
           }
        }

        static int separa (int v[], int p, int r) {
        int c = v[r]; // pivô
        int t, j = p;
        for (int k = p; /*A*/ k < r; ++k)
        if (v[k] <= c) {
            t = v[j];
            v[j] = v[k];
            v[k] = t;
            ++j; 
        } 
        t = v[j];
        v[j] = v[r];
        v[r] = t;
        return j; 
        }

    public static void main (String Args[]) {
        int[] v;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        n = scanner.nextInt();
        v = new int[n];
        geraVetor (v, n);
        //mostraVetor ("vetor gerado", v, n);
        long ini = System.currentTimeMillis();
        bubble (v, n);
        insertion(v, n);
        quicksort(v, 0, n-1);
        long fim = System.currentTimeMillis();
        //mostraVetor("vetor ordenado", v, n);
        System.out.println("A execucao demorou " + (fim - ini) + " milisegundos");
        scanner.close();
    }
}