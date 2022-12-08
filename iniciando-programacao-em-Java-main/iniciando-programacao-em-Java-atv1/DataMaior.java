// 4 - Determinar a data cronologicamente maior entre duas datas fornecidas pelo usuário. Cada data deve ser representada por três valores inteiros; o primeiro representa o dia, o segundo o mês e o terceiro o ano.

import java.util.Scanner;

public class DataMaior {
    
    public static void main(String args[]){
        int[] dia = new int[2];
        int[] mes = new int[2];
        int[] ano = new int[2];

        Scanner scan = new Scanner(System.in);

        for(int i=0; i<2; i++){
            System.out.println("Digite o dia da " + (i+1) + "a data: ");
            dia[i] = scan.nextInt();

            System.out.println("Digite o mes da " + (i+1) + "a data: ");
            mes[i] = scan.nextInt();

            System.out.println("Digite o ano da " + (i+1) + "a data: ");
            ano[i] = scan.nextInt();
        }

        if(ano[0] > ano[1]){
            System.out.println("a data maior e': " + dia[0] + "/" + mes[0] + "/" + ano[0]);
        } else if(ano[0] < ano[1]){
            System.out.println("a data maior e': " + dia[1] + "/" + mes[1] + "/" + ano[1]);
        } else if(mes[0] > mes[1]){
            System.out.println("a data maior e': " + dia[0] + "/" + mes[0] + "/" + ano[0]);
        } else if(mes[0] < mes[1]){
            System.out.println("a data maior e': " + dia[1] + "/" + mes[1] + "/" + ano[1]);
        } else if(dia[0] > dia[1]){
            System.out.println("a data maior e': " + dia[0] + "/" + mes[0] + "/" + ano[0]);
        } else if(dia[0] < dia[1]){
            System.out.println("a data maior e': " + dia[1] + "/" + mes[1] + "/" + ano[1]);
        } else{
            System.out.println("As datas são exatamente iguais");
        }
    }
}