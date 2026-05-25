public class ex08 {
    public static void main(String[]args) {
        //o cálculo da média das seguintes notas 8.0, 7.5, 4.5 e 9.
        double num1, num2, num3, num4;
        num1 = 8.0;
        num2 = 7.5;
        num3 = 4.5;
        num4 = 9.0;

        double soma = num1 + num2 + num3 + num4;

        double media = soma/4;

        System.out.printf("Média: %.2f",media);
    }
}