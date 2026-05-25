// GUSTAVO PAULO DE JESUS

import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite quanto tempo voce tem de trabalho na empresa XSoftware: ");
            double tempo = leitura.nextDouble();

        System.out.print("Digite seu salario para saber o bonus: R$");
            double salario = leitura.nextDouble();

            double porcentagem01 = salario+(salario * 0.20);
            double porcentagem001 = (salario * 0.20);
            double porcentagem02 = salario+(salario * 0.10);
            double porcentagem002 = (salario * 0.10);

            if(tempo >= 5 ){
                System.out.printf("Como voce tem mais de 05 cinco anos de empresa.. \nVoce recebera de bonus de 20 porcento no salario: R$%.2f\nValor final do seu salario: R$%.2f",porcentagem001,porcentagem01);
            }else {
                System.out.printf("Como voce tem manos de 05 cinco anos de empresa.. \nVoce recebera de bonus de 10 porcento no salario: R$%.2f\nValor final do seu salario: R$%.2f",porcentagem002,porcentagem02);
            }
    }
}
