/* 6 - Ler três notas de um aluno, calcular e mostrar a média aritmética e uma mensagem de acordo com a tabela a seguir. Para alunos que ficaram para exame, o programa deve calcular e mostrar a nota que deverão tirar para serem aprovados, considerando que a média para aprovação é 6,0.
|     m < 2      | reprovado |
| 2 <= m < 6 |    exame    |
|     m >= 6    |  aprovado |
*/

import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String arg[]){
        double nota1, nota2, nota3, media;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota do aluno: ");
        nota3 = scan.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if(media < 2){
            System.out.println("Reprovado");
        } else if(media >= 2 && media < 6){
            System.out.println("Exame");
            //considerando media final como MF= (Media + Exame) / 2
            System.out.println("O aluno precisara tirar no exame a nota "+ (6*(media/2)) + " para ser aprovado");
        } else if(media >= 6){
            System.out.println("Aprovado");
        }
    }
}