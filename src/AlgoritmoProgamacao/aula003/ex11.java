// GUSTAVO PAULO DE JESUS

import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        // infantilA  5-7 infantilB 8-10 juvenilA 11- 13 juvenilB 14 -17  Sênior 18
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = leitura.nextInt();

        if(idade <= 4){
            System.out.println("Idade nao permitida");
        }else if(idade >= 5 && idade < 7){
            System.out.println("Categoria infantilA");
        }else if(idade >= 8 && idade < 10){
            System.out.println("Categoria infantilB");
        }else if(idade >= 11 && idade < 13){
            System.out.println("Categoria juvenilA");
        }else if(idade >= 14 && idade < 17){
            System.out.println("Categoria juvenilB");
        }else if (idade >= 18){
            System.out.println("Categoria senior");
        }
        leitura.close();
    }
}
