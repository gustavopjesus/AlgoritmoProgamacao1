package AlgoritmoProgamacao.aula007.dominio;

import java.util.Random;

public class ex01 {
    public static void main(String[] args) {
        Random random = new Random();

        int sorteiro = 1 + random.nextInt(100 + 1);
        System.out.println("Numero sortiado:" + sorteiro);

    }
}
