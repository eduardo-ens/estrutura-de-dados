// 2- Ler 10 números inteiros, armzená-los num vetor e imprimir na ordem inversa.

import java.util.Scanner;

public class Inversa {
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        int numero[] = new int[10];

        for(int i = 0; i < numero.length; i++){
            System.out.println("Digite o " + (i+1) + "º numero: ");
            numero[i] = scan.nextInt();
        }

        System.out.println("Exibindo em ordem inversa");
        for(int j = (numero.length-1); j >= 0; j--){
            System.out.println("O " + (j+1) + "º numero e': " + numero[j]);
        }
    }
    
}