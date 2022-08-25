import java.util.Scanner;
public class EbobEkokWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print(" n2 sayısını giriniz : ");
        int n2 = input.nextInt();

        int ebob = 1;
        int k = n1;
        while( k >= 1 ){
            if(n1 % k == 0 && n2 % k == 0){
                ebob = k;
                break;
            }
        k--;
        }
        System.out.println(" ebob " + ebob);

        //matematik formülü ekok=(n1*n2)/ebob

        System.out.println(" ekok " + (n1*n2)/ebob);

    }
}
