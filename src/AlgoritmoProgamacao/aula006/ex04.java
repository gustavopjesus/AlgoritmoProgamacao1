// GUSTAVO PAULO DE JESUS
// GUSTAVO PAULO DE JESUS
// GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade = 0;
        double altura = 0;
        double soma = 0;
        int contador = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i);
            System.out.println("Digite sua altura " + i);
            altura = leia.nextDouble();
            System.out.println("Digite seu idade " + i);
            idade = leia.nextInt();

            if (idade > 50) {
                soma += altura;
                contador++;
            }
        }

        if (contador > 0) {
            double m = soma / contador;
            System.out.printf("Média das alturas %.2f ", m);
        } else {
            System.out.println("Não há pessoas maiores de 50 anos");
        }
        leia.close();
    }
}

