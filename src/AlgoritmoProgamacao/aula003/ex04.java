// GUSTAVO PAULO DE JESUS
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        System.out.println("Digite um numero ");
        Scanner leitura = new Scanner(System.in);
        float num1, num2;
        num1 = leitura.nextFloat();
        System.out.println("Digite outro numero ");
        num2 = leitura.nextFloat();

        if(num1 > num2){
            System.out.println(num1);
            System.out.println(num2);
        }else{
            System.out.println(num2);
            System.out.println(num1);
        }
    }
}
