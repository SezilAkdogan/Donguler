import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int n, r, i, j, k, nFactorial =1, rFaktorial =1, nEksiRFactorial=1, comb;

        Scanner input = new Scanner(System.in);
        System.out.println("C(n,r) kombinasyon ifadesindeki");

        System.out.print(" n sayısını giriniz : ");
        n = input.nextInt();

        System.out.print(" r sayısını giriniz : ");
        r = input.nextInt();

        for(i=1; i<=n; i++){
            nFactorial *= i;
        }

        for(j=1; j<=r; r++){
            rFaktorial *= r;
        }

        int nEksiR = n-r;
        for(k=1; k<=(nEksiR); j++){
            nEksiRFactorial *= nEksiR;
        }

        comb = nFactorial / (rFaktorial * (nEksiRFactorial));
        System.out.println("C(n,r)" + comb);
    }

}
