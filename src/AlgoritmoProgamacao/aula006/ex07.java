// GUSTAVO PAULO DE JESUS
// GUSTAVO PAULO DE JESUS
// GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade = 0;
        double altura = 0;
        double peso = 0;
        double soma = 0;
        int maior50 = 0;
        int contadoralt = 0;
        int pesomenor = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i);
            System.out.println("Digite sua idade: ");
            idade = leia.nextInt();
            System.out.println("Digite sua altura: ");
            altura = leia.nextDouble();
            System.out.println("Digite seu peso: ");

            peso = leia.nextDouble();

            if (idade > 50) {
                maior50++;
            }
            if (idade >= 10 && idade <= 20) {
                soma += altura;
                contadoralt++;
            }
            if (peso < 40) {
                pesomenor++;
            }
        }
        double mda = 0;
        if (contadoralt > 0) {
            mda = soma / contadoralt;
        }
        double porc = (pesomenor * 100) / 10;

        System.out.println("Quantidade de pessoas com mais 50 anos " + maior50);
        System.out.println("Quantidade da altura média das pessoas são " + mda);
        System.out.println("Quantidade de pessoas com menos de 40kg são " + porc);
        leia.close();
    }

}

