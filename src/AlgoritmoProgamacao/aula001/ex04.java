import java.util.Scanner;
public class ex04 {
    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);
        long num1, num2, num3, num4, soma;
        System.out.println("Digite o primiro numero: ");
        num1 = leitura.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = leitura.nextInt();
        System.out.println("Digite o terceiro numero: ");
        num3 = leitura.nextInt();
        System.out.println("Digite o quarto numero: ");
        num4 = leitura.nextInt();
        soma = num1 + num2 + num3 + num4;
        System.out.println("A soma entre: "+num1+", "+num2+", "+num3+" e "+num4+" é "+soma);
    }
}