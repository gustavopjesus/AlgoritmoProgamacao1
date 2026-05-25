// Gustavo Paulo De Jesus

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int numero;
        int menor = 0;

        do {
            System.out.print("Digite o " + contador + "º número positivo: ");
            numero = sc.nextInt();

            // Garante que só aceita números positivos
            if (numero > 0) {
                if (contador == 1 || numero < menor) {
                    menor = numero;
                }
                contador++;
            } else {
                System.out.println("Número inválido! Digite apenas valores positivos.");
            }

        } while (contador <= 10);

        System.out.println("O menor número é: " + menor);

        sc.close();
    }
}
