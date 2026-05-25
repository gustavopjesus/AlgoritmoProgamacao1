//GUSTAVO PAULO DE JESUS

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("            CARDÁPIO");
        System.out.println("===================================");

        System.out.println("___________________________________");
        System.out.println(" Codigo |     Produto      | Preço ");
        System.out.println("___________________________________");
        System.out.println("  100   | Cachorro quente  | R$1,20");
        System.out.println("  101   | Bauru simples    | R$1,30");
        System.out.println("  102   | Bauru com ovo    | R$1,50");
        System.out.println("  103   | Hambúrger        | R$1,20");
        System.out.println("  104   | CheeseHambúrger  | R$1,30");
        System.out.println("  105   | Refrigerante     | R$1,00");
        System.out.println("==================================\n");


        System.out.println("Escolha o produto desajado e digite seu codigo: ");
        int codigo = leia.nextInt();

        if(codigo == 100){
            System.out.println("Cachorro quente");
        }else if(codigo == 101){
            System.out.println("Bauru simples");
        }else if(codigo == 102){
            System.out.println("Bauru com ovo");
        }else if(codigo == 103){
            System.out.println("Hambúrger");
        }else if(codigo == 104){
            System.out.println("CheeserHambúrger");
        }else if(codigo == 105){
            System.out.println("Refrigerant");
        }else{
            System.out.println("Produto não encontrato");
            return;
        }
        System.out.println("Digite a quantidade desejada: ");
        int quantidade = leia.nextInt();

        switch (codigo) {
            case 100:
                double calculo = 1.20 * quantidade;
                System.out.println(quantidade + " Cachorro quente\nTotal: R$"+calculo);
                break;
            case 101:
                calculo = 1.30 * quantidade;
                System.out.println(quantidade + " Bauru simples\nTotal: R$"+calculo);
                break;
            case 102:
                calculo = 1.50 * quantidade;
                System.out.println(quantidade + " Bauru com ovo\nTotal: R$"+calculo);
                break;
            case 103:
                calculo = 1.20 * quantidade;
                System.out.println(quantidade + " Hambúrger\nTotal: R$"+calculo);
                break;
            case 104:
                calculo = 1.30 * quantidade;
                System.out.println(quantidade + " CheeserHambúrger\nTotal: R$"+calculo);
                break;
            case 105:
                calculo = 1.00 * quantidade;
                System.out.println(quantidade + " Refrigerante\nTotal: R$"+calculo);
                break;
            default:
                System.out.println("Opção invalida");
        }
        leia.close();
    }
}




//GUSTAVO PAULO DE JESUS