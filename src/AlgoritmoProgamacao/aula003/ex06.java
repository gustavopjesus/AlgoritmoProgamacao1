// GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

//        char sexo;
        double peso, altura, imc;

        System.out.println("Digite seu peso: ");
        peso = leitura.nextDouble();

        System.out.println("Digite sua altura: ");
        altura = leitura.nextDouble();

//        System.out.println("Digite seu sexo: ex:(M/F) ");
//        sexo = leitura.next().charAt(0);

        imc = peso /(altura * altura);

//        if(sexo == 'M'){
            if(imc <= 18.5){
                System.out.println("Seu peso sendo "+peso+ " e sua altura sendo "+altura+" voce esta Abaixo do peso");
            }else if( imc > 18.5 && imc < 29.9){
                System.out.println("Seu peso sendo "+peso+ " e sua altura sendo "+altura+" voce esta no peso ideal");
            }else if(imc >= 30 && imc < 34.9 ){
                System.out.println("Seu peso sendo "+peso+ " e sua altura sendo "+altura+" voce esta com obesidade grau I");
            }else if(imc >= 35 && imc < 39.9){
                System.out.println("Seu peso sendo "+peso+ " e sua altura sendo "+altura+" voce esta com obesidade grau II");
            }else{
                System.out.println("Seu peso sendo "+peso+ " e sua altura sendo "+altura+" voce esta com obesidade grau III");
            }
//        }else if (sexo == 'F'){
//            if(imc <= 19){
//                System.out.println("Seu peso sendo "+peso+ "e sua altura sendo "+altura+" voce esta Abaixo do peso");
//            }else if(imc <= 24){
//                System.out.println("Seu peso sendo "+peso+ "e sua altura sendo "+altura+" voce esta no peso ideal");
//            }else {
//                System.out.println("Seu peso sendo "+peso+ "e sua altura sendo" +altura+ "voce esta com obesidade");
//            }
//        }
        leitura.close();
    }
}