//GUSTAVO PAULO DE JESUS
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

            System.out.println("Digite um numero de 1 a 7 para saber a qual dia da semana ele corresponde: ");
            int dia = leia.nextInt();

            switch (dia) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-Feira");
                    break;
                case 3:
                    System.out.println("Terça-Feira");
                    break;
                case 4:
                    System.out.println("Quarta-Feira");
                    break;
                case 5:
                    System.out.println("Quinta-Feira");
                    break;
                case 6:
                    System.out.println("Sexta-Feira");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
            leia.close();
        }
    }








//GUSTAVO PAULO DE JESUS