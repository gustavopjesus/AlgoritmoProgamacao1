//GUSTAVO PAULO DE JESUS


import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Em qual período você estuda?");
        System.out.println("M = Mantutino");
        System.out.println("V = Vespertino");
        System.out.println("N = Noturno");
        System.out.println("-----------------------------");
        System.out.printf("Digite: ");

        char periodo = leia.next().charAt(0);

        switch(periodo){
            case 'M':
            case 'm':
                System.out.println("Bom dia!");
                break;
            case 'V':
            case 'v':
                System.out.println("Boa tarde!");
                break;
            case 'N':
            case 'n':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        leia.close();
    }
}






//GUSTAVO PAULO DE JESUS