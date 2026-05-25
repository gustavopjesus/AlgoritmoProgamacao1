// GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        System.out.println("Digite um numero ");
        Scanner leitura = new Scanner(System.in);
        int num1 = leitura.nextInt();

        if(num1 >= 50 && num1 <= 100){
            System.out.println("Pertence ao intervalor de 50 e 100");
        }else{
            System.out.println("Nao pertence ao intervalo");
        }
    }
}
