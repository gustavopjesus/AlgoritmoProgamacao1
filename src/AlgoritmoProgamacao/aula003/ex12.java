// GUSTAVO PAULO DE JESUS


import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor do seu salario bruto para calcular o desconto de INSS");
        double salario = leitura.nextDouble();

        double inss01 = salario-(salario * 0.20);
        double inss001 = (salario * 0.20);
        double inss02 = salario-(salario * 0.20);
        double inss002 = (salario * 0.20);
        double inss03 = salario-(salario * 0.20);
        double inss003 = (salario * 0.20);

        if (salario <= 600){
            System.out.println("Como voce recebe ua salario abaixo de R$600.00 o INSS [e ISENTO");
        }else if (salario > 600 && salario <= 1200){
            System.out.printf("Como eu salario e de R$600,00 entre R$1.200,00 o desconto e de INSS e: %.2f\nSeu salario final passa a ser: R$%.2f",inss001,inss01);
        }else if(salario > 1200 && salario <= 2000){
            System.out.printf("Como eu salario e de R$1200,00 entre R$2.000,00 o desconto e de INSS e: %.2f\nSeu salario final passa a ser: R$%.2f",inss002,inss02);
        }else{
            System.out.printf("Como eu salario e maior que R$2.000,00 o desconto e de INSS e: %.2f\nSeu salario final passa a ser: R$%.2f",inss003,inss03);
        }
        leitura.close();
    }
}
