import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {3,4,7,6,4,67,88,23,7};
        Scanner scan = new Scanner(System.in);

        System.out.println("sayı gir");
        int inp = scan.nextInt();

        // başlangıç deperlere en yüksek değerleri verdimki algoritma daha kısa sürsün

        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;

        int farkmin = Integer.MAX_VALUE;
        int farkmax = Integer.MAX_VALUE;

        for (int i : list){
            if (i < inp){
                if ((inp - i) < farkmin ){
                    min = i;
                    farkmin = (inp - i);
                }
            }
            if (i > inp ){
                if ((i - inp) < farkmax ){
                    max = i;
                    farkmax = (i - inp);
                }
            }
        }
        System.out.println("min = "+min);
        System.out.println("max = "+max);

    }
}