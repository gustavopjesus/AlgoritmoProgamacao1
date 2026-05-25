// GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite o primeiro numero: ");
        num1 = leitura.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = leitura.nextInt();

        System.out.println("Digite o terceiro numero: ");
        num3 = leitura.nextInt();


        if (num1 == num2 && num1 == num3) {
            System.out.println("NUmeros iguais");
        } else if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
            } else if (num3 > num2) {
                System.out.println(num1);
                System.out.println(num3);
                System.out.println(num2);
            } else {
                System.out.println("NUmeros iguais");
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println(num2);
                System.out.println(num1);
                System.out.println(num3);
            } else {
                System.out.println(num2);
                System.out.println(num3);
                System.out.println(num1);
            }
        } else {
            if (num1 > num2) {
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(num2);
            } else {
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);
            }
        }
        leitura.close();
    }
}
