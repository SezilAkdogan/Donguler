import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;

        Scanner input = new Scanner(System.in);
        System.out.print(" Fibonacci serisinin elemen sayısını giriniz : ");
        int number = input.nextInt();

        int n3 = 0;
        for( int i = 1; i <= number; i++){
            n1=n2;
            n2=n3;
            n3=n1+n2;

            System.out.print(n3 + " ");
        }

    }
}
