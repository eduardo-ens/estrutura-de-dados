// 5- Ler uma quantidade não determinada de pares de números [m, n] todos inteiros e positivos. Para cada par lido, o programa deve calcular e mostrar a soma de todos os números inteiros entre m e n (inclusive). A digitação terminará quando o usuário digitar valores para m e n tais que m >= n.

import java.util.Scanner;

public class Ex5 {
    public static void main(String args[]) {
        int m;
        int n;
        int soma;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de m: ");
        m = scan.nextInt();
        System.out.println("Digite o valor de n: ");
        n = scan.nextInt();

        while(m < n) {
            soma = m;
            for(m = m + 1; m <= n; m++) {
                soma += m;
            }

            System.out.println("Resultado da soma: " + soma);
            System.out.println("Digite o proximo valor de m: ");
            m = scan.nextInt();
            System.out.println("Digite o proximo valor de n: ");
            n = scan.nextInt();
        }
    }
}
