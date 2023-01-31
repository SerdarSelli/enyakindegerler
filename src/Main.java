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

        /* for döngüsü ile liste elemanları girilen sayıdan küçük ve büyük olmak üzere if ler ile ayrıldı ve farkmax ve fark min değerleri hangi
        liste elemanında daha küçük olursa o liste elemanı en yakın  büyük ve küçük değer olarak atanıyor
       */
        
        for (int i : list){
            //eğer girilen sayı liste elemanından küçükse kontrole giriyor
            if (i < inp){
                // eğer girilen sayıdan liste elemanı çıkarıldığında önceki değerden küçükse yeni liste elemanı en küçük yakın değer olarak atanıyor
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
