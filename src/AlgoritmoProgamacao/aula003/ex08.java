// GUSTAVO PAULO DE JESUS

import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner leitura =   new Scanner(System.in);

        System.out.println("Digite seu usuario: ");
            String usuario01 = leitura.nextLine();

        System.out.println("Digite a senha: ");
            String senha = leitura.nextLine();

        if(senha.equals("R10p5")){
            System.out.println(usuario01+"\nAcesso concedido");
                }else{
                    System.out.println(usuario01+"\nnAcesso negado");
        }
    }
}
