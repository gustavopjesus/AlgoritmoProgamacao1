import java.util.Scanner;
public class ex01 {
    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = leitura.nextLine();
        System.out.println("Digite seu Registro Acadêmico RA:");
        long ra = leitura.nextLong();
        leitura.nextLine();
        System.out.println("Digite o nome do seu curso: ");
        String curso = leitura.nextLine();
        System.out.println(nome);
        System.out.println(ra);
        System.out.println(curso);
    }
}
