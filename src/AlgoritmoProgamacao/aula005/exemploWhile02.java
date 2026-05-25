public class exemploWhile02 {
    public static void main(String[] args) {

        int contador = 0;
        int resto = 0;

        while (contador <= 10) {
            resto = contador % 2;

            if (resto == 0) {
                System.out.println("O número " + contador + " eh par");
//            }else{
//                System.out.println("O numero " + contador + " impar");
//            }
            }
            contador++;
        }
    }
}

