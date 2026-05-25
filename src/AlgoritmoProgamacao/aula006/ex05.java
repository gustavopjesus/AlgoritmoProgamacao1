// GUSTAVO PAULO DE JESUS
// GUSTAVO PAULO DE JESUS
// GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1 = 0;
        double n2 = 0;
        double media = 0;
        int reprovados = 0;
        int aprovados = 0;
        int exame = 0;
        double somamedia = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Aluno " + i);
            System.out.println("Digite primeira nota " + i);
            n1 = leia.nextDouble();
            System.out.println("Digite segunda nota " + i);
            n2 = leia.nextDouble();
            media = (n1 + n2) / 2;
            somamedia += media;
            System.out.printf("Média: %.2f - ", media);

            if (media <= 3) {
                System.out.println("REPROVADO");
                reprovados++;
            } else if (media > 3 && media < 7) {
                System.out.println("EXAME");
                exame++;
            } else if (media >= 7) {
                System.out.println("APROVADO");
                aprovados++;
            }
        }
        double mc = somamedia / 6;

        System.out.println("O total de aprovados foi " + aprovados);
        System.out.println("O total de exame foi " + exame);
        System.out.println("O total de reprovados foi " + reprovados);
        System.out.printf("A média da sala foi %.2f", mc);
    }
}

