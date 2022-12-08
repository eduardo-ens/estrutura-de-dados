// 3- Ler a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. Considere o ano com 365 dias e o mês com 30. Exemplo: 3 anos, 2 meses e 15 dias = 1170 dias.

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int dia, mes, ano, idade;
        
        System.out.println("Digite a quantidade de anos: ");
        ano = scan.nextInt();
        
        System.out.println("Digite a quantidade de meses: ");
        mes = scan.nextInt();
        
        System.out.println("Digite a quantidade de dias: ");
        dia = scan.nextInt();

        idade = dia;
        idade += (mes * 30);
        idade += (ano * 365);
        
        System.out.println("A idade em dias e': " + idade + "dias");
    }
}