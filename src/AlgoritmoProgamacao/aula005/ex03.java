// Gustavo Paulo De Jesus

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int valor = 1;

        while (valor <= numero) {
            System.out.print(valor + " ");
            valor = valor * 2;
        }
        sc.close();
    }
}

