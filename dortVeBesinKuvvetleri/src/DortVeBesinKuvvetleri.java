import java.util.Scanner;
public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int n, i;

        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz :");
        n = input.nextInt();

        for (i = 1; i <= n; i*=4){
            System.out.println("4'ün kuvvetleri");
            System.out.println(i);
        }
        for (i = 1; i <= n; i*=5){
            System.out.println("5'in kuvvetleri");
            System.out.println(i);
        }
    }
}
