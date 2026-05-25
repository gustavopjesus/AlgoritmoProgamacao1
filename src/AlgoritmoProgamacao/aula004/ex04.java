//GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.printf("Digite seu salario: ");
        double salario = leia.nextDouble();

        System.out.println("_______________________________");
        System.out.println("Digite seu plano de trabalho:");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("_______________________________");

        double a = 0.10;
        double b = 0.15;
        double c = 0.20;
        double calculo;
        double salarioNovo;

        char plano = leia.next().charAt(0);

        switch (plano) {

            case 'A':
            case 'a':
                calculo = salario * a;
                salarioNovo = calculo+salario;
                System.out.printf("Você pertence ao plano A e recebeu um aumento de 10 porcento no seu salário R$%.2f", calculo);
                System.out.printf("\nSalario reajustado: R$%.2f",salarioNovo);
                break;
            case 'B':
            case 'b':
                calculo = salario * b;
                salarioNovo = calculo+salario;
                System.out.printf("Você pertence ao plano B e recebeu um aumento de 15 porcento no seu salário R$%.2f", calculo);
                System.out.printf("\nSalario reajustado: R$%.2f",salarioNovo);
                break;
            case 'c':
            case 'C':
                calculo = salario * c;
                salarioNovo = calculo+salario;
                System.out.printf("Você pertence ao plano C e recebeu um aumento de 20 porcento no seu salário R$%.2f", calculo);
                System.out.printf("\nSalario reajustado: R$%.2f",salarioNovo);
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        leia.close();
    }
}



//GUSTAVO PAULO DE JESUS