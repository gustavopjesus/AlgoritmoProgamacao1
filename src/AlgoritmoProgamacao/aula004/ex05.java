//GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      CALCULADORA SIMPLES");
        System.out.println("=================================");
        System.out.println("Este programa realiza operações");
        System.out.println("matemáticas entre dois números.");
        System.out.println("=================================\n");

        int num1, num2, calculo;

        System.out.println("Digite um numero: ");
        num1 = leia.nextInt();
        System.out.println("Digite outro numero: ");
        num2 = leia.nextInt();


        System.out.println("=================================\n");
        System.out.println("  ESCOLHA A OPERAÇÃO DESEJADA:\n");
        System.out.println("M - Média entre os números");
        System.out.println("S - Diferença entre o maior e o menor");
        System.out.println("P - Produto (multiplicação)");
        System.out.println("D - Divisão do primeiro pelo segundo\n");
        System.out.println("=================================\n");

        char opcao = leia.next().charAt(0);

        switch (opcao) {
            case 'M':
            case 'm':
                calculo = (num1 + num2) / 2;
                System.out.println("A média entre " + num1 + " e " + num2 + " é: " + calculo);
                break;
            case 'S':
            case 's':
                if (num1 > num2) {
                    calculo = num1 - num2;
                    System.out.println("A diferença entre os números " + num1 + " e " + num2 + " é: " + calculo);
                } else if (num2 > num1) {
                    calculo = num2 - num1;
                    System.out.println("A diferença entre os números " + num2 + " e " + num1 + " é: " + calculo);
                } else {
                    System.out.println("Números iguais");
                }
                break;
            case 'P':
            case 'p':
                calculo = num1 * num2;
                System.out.println("O produto entre " + num1 + " e " + num2 + " é: " + calculo);
                break;
            case 'D':
            case 'd':
                if (num2 == 0) {
                    System.out.println("Não é possível fazer divisão por 0 (zero)");
                } else {
                    calculo = num1 / num2;
                    System.out.println("A divisão entre " + num1 + " e " + num2 + " é: " + calculo);
                }
                break;
            default:
                System.out.println("Opção invalida.");
        }
        leia.close();
    }
}



//GUSTAVO PAULO DE JESUS