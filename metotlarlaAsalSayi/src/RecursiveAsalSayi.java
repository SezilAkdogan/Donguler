import java.util.Scanner;
public class RecursiveAsalSayi {

    static boolean asal(int n) {
        int count = 0;
        for(int i = 2; i < n; i++){
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print(" Sayı giriniz : ");
        n = input.nextInt();

        if( asal(n) ) {
            System.out.println( " " + n + " ASALDIR! ");
        }else {
            System.out.println( " " + n + " ASAL DEĞİLDİR!");
        }
    }
}
