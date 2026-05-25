//GUSTAVO PAULO DE JESUS
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int contador =1;
        int numero;
        int contadorImpar = 0;
        int contadorpar = 0;

        while(contador <= 10){
            System.out.println("digite o numero: ");
            numero = leia.nextInt();

            if(numero % 2 == 0){
                contadorpar++;
            }else {
                contadorImpar++;
            }
            contador++;
        }
        System.out.println("Foram "+contadorpar+" Par");
        System.out.println("Foram: "+contadorImpar+" Impar");
    }
}
