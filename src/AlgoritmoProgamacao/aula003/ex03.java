// GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        System.out.println("Digite um primeiro numero ");
        Scanner leitura = new Scanner(System.in);
        int num1, num2, calculo1, calculo2;
        num1 = leitura.nextInt();
        System.out.println("Digite outro numero");
        num2 = leitura.nextInt();


        if (num1 == num2){
            System.out.println("Numeros iguais");
        }else if(num1 > num2){
            calculo1 = num1 - num2;
            System.out.println("A diferença entra "+num1+" e "+num2+" é "+calculo1);
        }else{
            calculo2 = num2 -num1;
            System.out.println("A diferença entra "+num2+" e "+num1+" é "+calculo2);
        }
    }
}
