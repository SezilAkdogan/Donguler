import java.util.Scanner;
public class MinMaxSayi {
    public static void main(String[] args) {
        int count, sayi, min = 1, max = 1;

        Scanner input = new Scanner(System.in);
        System.out.print(" Kaç tane sayı gireceksiniz : ");
        count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ".sayiyi giriniz: ");
            sayi = input.nextInt();

            if (i == 1){
                max = sayi;
                min = sayi;
            }

            if (sayi > max){
                max = sayi ;
            }

            if (sayi < min){
                min = sayi;
            }

        }

        System.out.println(" En büyük sayı : " + max);
        System.out.println(" En küçük sayı : " + min);
    }
}
