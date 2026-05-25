// GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        System.out.println("Digite sua idade ");
        Scanner leitura = new Scanner(System.in);
        int idade;
        idade = leitura.nextInt();

        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
