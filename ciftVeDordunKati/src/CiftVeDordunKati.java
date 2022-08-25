import java.util.Scanner;
public class CiftVeDordunKati {
    public static void main(String[] args) {

        int i, n, count, sum;
        double average;

        count = 0;
        sum = 0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz : ");
            n = input.nextInt();

            if(n % 4 == 0) {
                sum += n;
                count++;
            }
        }while (n % 2 == 0);

        System.out.println("Çift ve 4'ün katı olan sayıların adedi : " + count );
        System.out.println("Çift ve 4'ün katı olan sayıların toplamı : " + sum);
    }
}
