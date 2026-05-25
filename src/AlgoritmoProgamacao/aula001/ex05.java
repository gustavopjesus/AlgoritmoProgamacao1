import java.util.Scanner;
public class ex05 {
    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);
        double num1, num2, num3, media, soma;
        System.out.println("Vamos calcular a média aritmética");
        System.out.println("Digite a primera nota do aluno: ");
        num1 = leitura.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        num2 = leitura.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        num3 = leitura.nextDouble();
        soma = num1 + num2 + num3;
        media = soma/3;
        System.out.printf("A média aritmética entra as notas %.2f, %.2f e %.2f\nÉ %.2f",
                num1, num2, num3, media);
    }
}
