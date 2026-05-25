// Gustavo Paulo De Jesus

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aluno = 1;

        do {
            System.out.println("\nAluno " + aluno);

            double nota1, nota2;

            do {
                System.out.print("Digite a primeira nota (0 a 10): ");
                nota1 = sc.nextDouble();

                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! Digite novamente.");
                }

            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.print("Digite a segunda nota (0 a 10): ");
                nota2 = sc.nextDouble();

                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! Digite novamente.");
                }

            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2;

            System.out.println("Média do aluno " + aluno + " = " + media);

            aluno++;

        } while (aluno <= 5);

        sc.close();
    }
}
