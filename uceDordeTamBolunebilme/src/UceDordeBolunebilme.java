import java.util.Scanner;
public class UceDordeBolunebilme {
    public static void main(String[] args) {

        int i, n, count, sum;
        double average;

        count = 0;
        sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print(" Sayı giriniz:");
        n = input.nextInt();

        for (i = 0; i <= n; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                sum += i;
                count++;
            }
        }
        average = sum/(count-1);
        System.out.println("ortalama :" + average);
    }
}
