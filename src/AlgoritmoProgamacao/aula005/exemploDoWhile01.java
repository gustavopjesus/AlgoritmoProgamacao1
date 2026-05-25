import java.util.Scanner;

public class exemploDoWhile01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota;

        do {
            System.out.print("Digite uma nota (0 a 10): ");
            nota = entrada.nextDouble();
        } while (nota < 0 || nota > 10); // AQUI entra o ||

        System.out.println("Nota correta!");
    }
}