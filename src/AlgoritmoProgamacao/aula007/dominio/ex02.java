package AlgoritmoProgamacao.aula007.dominio;

import java.util.Random;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner leia = new Scanner(System.in);

        int sorteio = random.nextInt(50);
        int contador = 0;


        System.out.println(sorteio);

        boolean pingpong = true;
        while (pingpong) {
            System.out.println("\nTente adivinhar o numero sorteado: ");
            int resposta = leia.nextInt();


            if (resposta > sorteio) {
                System.out.println("Maior que o numero sorteado");
                contador++;

            } else if (resposta < sorteio) {
                System.out.println("Menor que o número sorteado");
                contador++;
            } else {
                System.out.println("\nVoce acertou!\n");
                contador++;

                pingpong = false;
            }
        }
        System.out.println("O número sorteado foi:"+ sorteio);
        System.out.println("A quantida de tentativas foi: "+contador);
    }
}
