package AlgoritmoProgamacao.aula007.dominio;

import java.util.Random;

public class ex03 {
    public static void main(String[] args) {
        Random random = new Random();
        int soma = 0;
        int pares = 0;

        for(int i =1; i < 11; i++){
            int sorteado = 1 + random.nextInt(20 + 1);
            System.out.println(i + " numero sorteado: " + sorteado);
            soma += sorteado;
            if(sorteado % 2 == 0){
                pares++;
            }
        }
        System.out.println("\nSoma do valores: "+soma);
        int media = soma / 10;
        System.out.println("A média é " + media);
        System.out.println("Foram sorteados "+ pares + " númes pares");
        if(soma % 2 == 0){
            System.out.println("Numero final " + soma + " é par");
        }else{
            System.out.println("Numero final " + soma + " é par");
        }
    }
}
