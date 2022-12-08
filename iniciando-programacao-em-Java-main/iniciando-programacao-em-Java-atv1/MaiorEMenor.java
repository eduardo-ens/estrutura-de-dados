// 1- Ler 3 números inteiros da entrada, imprimir o menor e o maior.

import java.util.Scanner;

public class MaiorEMenor {
    public static void main (String args[]) {
        
        Scanner scan = new Scanner (System.in);
		int numero[] = new int[3];
		int maior = 0;
		int menor = Integer.MAX_VALUE;
		
		for(int i = 0; i < numero.length; i++){
			System.out.print("Digite o " +(i+1)+"º numero: ");
			numero[i] = scan.nextInt();
			if(numero[i] > maior){
				maior = numero[i];
			}
			if(numero[i] < menor){
				menor = numero[i];
			}
		}
		System.out.println("Maior valor = "+ maior);
		System.out.println("Menor valor = "+ menor);
	
	}	
}