import java.util.Scanner;
public class RecursiveUsAlma {
    static int pow(int base,int exponent){
        if (base == 1 || exponent == 0) {
            return 1;
        }
        return pow(base,exponent-1)*base;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print(" Taban değerini giriniz : ");
        x = input.nextInt();
        System.out.print(" Üs değerini giriniz : ");
        y = input.nextInt();
        System.out.println(" Sonuç : "+ pow(x, y));

    }




}
