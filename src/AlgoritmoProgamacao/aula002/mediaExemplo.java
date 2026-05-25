import java.util.Scanner;
public class mediaExemplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digte o nome do(a) estudante: ");
        String nome = entrada.nextLine();

        System.out.println("Digite a nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digte a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Digte a terceira nota: ");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;
        System.out.println("A média do(a) estudante " + nome);
        System.out.printf("é: ",media);

        if(media >= 8){
            System.out.println("\nEstudante: "+nome+" Aprovado(a). Prabéns!");
        }else if(media >=5){
            System.out.println("Estudante: "+nome+" Recuperação.");
        }else{
            System.out.println("\nEstudante: "+nome+" Reprovado. ");
        }

        entrada.close();
    }
}




