public class ex07 {
    public static void main(String[]args) {
        // 1) ((120 - 30) == (3 ^ 30))
        boolean exp1 = (120-30) == Math.pow(3, 30);
        System.out.println(exp1);
        // 2) (não ((20 módulo 4) = 1) ou (9 != 9))
        boolean exp2 = !((20 % 4) == 1) || (9 != 9);
        System.out.println(exp2);
        // 3) ((5 módulo 2) > 3)
        boolean exp3 = 5 % 2 > 3;
        System.out.println(exp3);
        // 4) (a = A)
        boolean exp4 = 'a' == 'A';
        System.out.println(exp4);
    }
}