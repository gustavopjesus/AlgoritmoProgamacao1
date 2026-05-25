import java.sql.SQLOutput;
import java.util.Scanner;
public class ex12 {
    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num1 = leitura.nextDouble();
        double numeroAoQuadrado = Math.pow(num1, 2);
        double numeroAoCubo = Math.pow(num1, 3);
        double raizQuadrada = Math.sqrt(num1);
        double elevadoA10 = Math.pow(num1, 10);
        System.out.printf("\n%.2f Elevado ao quadrado é: %.2f", num1, numeroAoQuadrado);
        System.out.printf("\n%.2f Elevado ao cubo é: %.2f",num1, numeroAoCubo);
        System.out.printf("\nA raiz quadrada de %.2f é %.2f",num1,raizQuadrada);
        System.out.printf("\n%.2f Elevado a decima pontencia é %.2f", num1, elevadoA10);

    }
}
