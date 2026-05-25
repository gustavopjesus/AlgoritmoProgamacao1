import java.util.Scanner;

public class exemploWhile04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        int contador;
        double nota, media, acumuladorNota;
        contador = 0;
        acumuladorNota = 0;

        while(contador < 5){
            contador++;
            System.out.println("Digite uma nota " + contador +": ");
            nota = leia.nextInt();
            acumuladorNota = acumuladorNota + contador;

        }
        media = acumuladorNota/contador;
        System.out.println("Média " + media);
        leia.close();
    }
}
