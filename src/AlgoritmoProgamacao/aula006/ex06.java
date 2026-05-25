// GUSTAVO PAULO DE JESUS
// GUSTAVO PAULO DE JESUS
// GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;
        int votobranco = 0;
        int votonulo = 0;
        int vt = 10;

        System.out.println("============");

        System.out.println("1 - VOTO para Leo");
        System.out.println("2 - VOTO para Leandro");
        System.out.println("3 - VOTO para Marcos");
        System.out.println("4 - VOTO para Nicolas");
        System.out.println("5 - VOTO NULO");
        System.out.println("6 - VOTO BRANCO");
        System.out.println("============");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i);
            System.out.println("Escolha uma opção: ");
            int op = leia.nextInt();

            switch (op) {
                case 1:
                    voto1++;
                    break;
                case 2:
                    voto2++;
                    break;
                case 3:
                    voto3++;
                    break;
                case 4:
                    voto4++;
                    break;
                case 5:
                    votobranco++;
                    break;
                case 6:
                    votonulo++;
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }

        double perc = (votobranco + votonulo) * 100.0 / vt;

        System.out.println("O total de votos para Leo foi " + voto1);
        System.out.println("O total de votos para Leandro foi " + voto2);
        System.out.println("O total de votos para Marcos foi " + voto3);
        System.out.println("O total de votos para Nicolas foi " + voto4);
        System.out.println("O total de votos Nulos foi " + votobranco);
        System.out.println("O total de votos Brancos foi " + votonulo);
        System.out.printf("O percentual dos votos brancos e nulos foram %.2f%%", perc);
    }
}
