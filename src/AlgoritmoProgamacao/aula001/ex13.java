import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        System.out.println("Digite um número para saber sua tabuada: ");
        Scanner leitura = new Scanner(System.in);
        int numero = leitura.nextInt();

        int num01 = (numero * 1);
        int num02 = (numero * 2);
        int num03 = (numero * 3);
        int num04 = (numero * 4);
        int num05 = (numero * 5);
        int num06 = (numero * 6);
        int num07 = (numero * 7);
        int num08 = (numero * 8);
        int num09 = (numero * 9);
        int num10 = (numero * 10);

        System.out.println(numero+" x 1 = "+num01);
        System.out.println(numero+" x 2 = "+num02);
        System.out.println(numero+" x 3 = "+num03);
        System.out.println(numero+" x 4 = "+num04);
        System.out.println(numero+" x 5 = "+num05);
        System.out.println(numero+" x 6 = "+num06);
        System.out.println(numero+" x 7 = "+num07);
        System.out.println(numero+" x 8 = "+num08);
        System.out.println(numero+" x 9 = "+num09);
        System.out.println(numero+" x 10 = "+num10);

        leitura.close();
    }
}
