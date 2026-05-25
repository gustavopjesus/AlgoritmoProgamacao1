import java.util.Scanner;
public class jogoAdivinha {
    public static void main(String[] args) {
        int num = 15;

        Scanner leitura = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("Tente adivinha o numero secreto, Digite um numero de 0 a 100: ");
        int palpite = leitura.nextInt();

        if(palpite == num){
            System.out.println("Parabéns! Você acertou.");
        }else if(palpite > num){
            System.out.println("Seu palpite esta acima do valor secreto.");
        }else{
            System.out.println("Seu palpite está abaixo do valor secreto");
        }
        leitura.close();
    }
}
