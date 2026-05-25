import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        System.out.println("==========Menu de Opções==========");
        System.out.println(" 1 - Cadastrar Produto");
        System.out.println(" 2 - Lista Produtos");
        System.out.println(" 3 - Lista Produtos");
        System.out.println("==========Menu de Opções==========");

        Scanner leitura = new Scanner(System.in);

        int menu = leitura.nextInt();

        switch(menu){
            case 1:
                System.out.println("Voce escolheu o menu 1");
                System.out.println("Que eh a opção Cadastrar Produtos");
                break;
            case 2:
                System.out.println("Voce escolheu o menu 2");
                System.out.println("Que eh a opção Listar Produtos");
                break;
            case 3:
                System.out.println("Voce escolheu o menu 3");
                System.out.println("Que eh a opção Sair do Sistema");
                break;
            default:
                System.out.println("Item menu inválido");
        }
        leitura.close();
    }
}
