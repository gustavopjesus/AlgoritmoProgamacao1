// GUSTAVO PAULO DE JESUS

import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu salario: R$");
            double salario = leitura.nextDouble();

            System.out.println("Digite o valor da prestacao: R$");
            double prestacao = leitura.nextDouble();

            double calculo = salario * 0.30;


            if(calculo <= prestacao){
                System.out.println("o valor máximo da prestação não poderá ultrapassar 30% do salário bruto.\n30 porcento do seu salario: R$"+calculo +"\n-----------------------------------\nEMPRESTIMO NAO APROVADO.");
            }else{
                System.out.println("o valor máximo da prestação não poderá ultrapassar 30% do salário bruto.\n30 porcento do seu salario: R$"+calculo +"\n-----------------------------------\nEMPRESTIMO APROVADO!");
            }
        leitura.close();
    }
}
