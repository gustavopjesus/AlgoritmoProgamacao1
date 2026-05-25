import java.util.Scanner;
public class ex02 {
    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = leitura.nextInt();
        System.out.println("Digite a altura: ");
        double altura = leitura.nextFloat();
        leitura.nextLine();
        System.out.println("Digite o status");
        String status = leitura.nextLine();
        System.out.println("----------------------------------");
        System.out.println("Sua idade: "+idade);
        System.out.println("Sua altura: "+altura);
        System.out.println("Status "+status);
    }
}