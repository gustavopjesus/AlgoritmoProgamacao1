import java.sql.SQLOutput;
import java.util.Scanner;
public class ex11 {
    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimeto");
        int nascimento = leitura.nextInt();
        int anoAtual = 2026;
        int ano2030 = 2030;

        int idade = anoAtual - nascimento;
        int idade2030 = ano2030 - nascimento;

        if(nascimento < 1920){
            System.out.println("Opção invalida\nTente colocar assim por exemplo: 2002, 1990..");
        }else{
            System.out.println("Sua idade é: "+idade);
            System.out.println("Em 2030 você tera: "+idade2030);
        }
    }
}
