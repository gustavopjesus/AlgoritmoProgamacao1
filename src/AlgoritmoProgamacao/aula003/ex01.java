// GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        System.out.println("Digite um numero ");
        Scanner leitura = new Scanner(System.in);
        int num, calculo;
        num = leitura.nextInt();

        if(num > 20){
            calculo = num/2;
                System.out.println("O numero digita maior que vinte dividido por dois é "+calculo);
        }else{
                System.out.println("Numero digitado "+num);
        }
    }
}
