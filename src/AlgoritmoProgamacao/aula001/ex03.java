import java.util.Scanner;
public class ex03 {
    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);
        int num1, num2, produto;
        System.out.println("Digite um número: ");
        num1 = leitura.nextInt();
        System.out.println("Digite um outro número: ");
        num2 = leitura.nextInt();
        produto = num1 * num2;
        System.out.println("O produto é: "+produto);
    }
}