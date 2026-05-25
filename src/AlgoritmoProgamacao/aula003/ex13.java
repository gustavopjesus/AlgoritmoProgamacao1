// GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double num1, num2, resuldado;
        char operador;


        System.out.println("Digite um numero: ");
        num1 = leitura.nextDouble();

        System.out.println("Digite o operador: ");
        operador = leitura.next().charAt(0);

        System.out.println("Digite um numero: ");
        num2 = leitura.nextDouble();

        if (operador == '*') {
            double resultado = num1 * num2;
            System.out.println("Resultado " + resultado);
        } else if (operador == '+') {
            double resultado = num1 + num2;
            System.out.println("Resultado " + resultado);
        } else if (operador == '-') {
            double resultado = num1 - num2;
            System.out.println("Resultado " + resultado);
        } else if (operador == '/') {
            if (num2 == 0) {
                System.out.println("impossivel dividir");
            } else {
                double resultado = num1 / num2;
                System.out.println("Resultado "+resultado);
            }
        } else {
            System.out.println("Operador invalido");
        }
        leitura.close();
    }
}
