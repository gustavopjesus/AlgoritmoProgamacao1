import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double totalCompra = 0;
        char continuar;

        // Mostra o cardápio
        System.out.println("===== CARDÁPIO =====");
        System.out.println("100 - Cachorro Quente - R$ 1,20");
        System.out.println("101 - Bauru Simples   - R$ 1,30");
        System.out.println("102 - Bauru com Ovo   - R$ 1,50");
        System.out.println("103 - Hambúrguer      - R$ 1,20");
        System.out.println("104 - Cheeseburguer   - R$ 1,30");
        System.out.println("105 - Refrigerante    - R$ 1,00");
        System.out.println("====================");

        do {
            System.out.print("\nDigite o código do produto: ");
            codigo = sc.nextInt();

            System.out.print("Digite a quantidade: ");
            quantidade = sc.nextInt();

            double preco = 0;
            String produto = "";

            switch (codigo) {
                case 100:
                    produto = "Cachorro Quente";
                    preco = 1.20;
                    break;
                case 101:
                    produto = "Bauru Simples";
                    preco = 1.30;
                    break;
                case 102:
                    produto = "Bauru com Ovo";
                    preco = 1.50;
                    break;
                case 103:
                    produto = "Hambúrguer";
                    preco = 1.20;
                    break;
                case 104:
                    produto = "Cheeseburguer";
                    preco = 1.30;
                    break;
                case 105:
                    produto = "Refrigerante";
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido!");
            }

            if (preco != 0) {
                double totalProduto = preco * quantidade;
                System.out.println(produto + " - Total: R$ " + totalProduto);
                totalCompra += totalProduto;
            }

            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("\nTotal da compra: R$ " + totalCompra);

        sc.close();
    }
}
