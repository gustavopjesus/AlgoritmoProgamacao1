//GUSTAVO PAULO DE JESUS
import java.util.Scanner;
public class desafio {
    public static void main(String[] args) {
//        Menor de 16 anos → não pode votar
//        16 ou 17 anos → voto facultativo (opcional)
//        18 até 70 anos → voto obrigatório
//        maior de 70 anos → voto facultativo

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade para verificar a necessidade de votar na eleição.");
        int idade = leia.nextInt();

        if(idade < 16){
            System.out.println("Nao pode votar.");
        }else if(idade >= 16 && idade < 18){
            System.out.println("Vota facultativo (opcional)");
        }else if (idade > 18 && idade < 70){
            System.out.println("Voto obrigatorio");
        }else{
            System.out.println("Voto facultativo");
        }
        leia.close();
    }
}

