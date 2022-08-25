import java.util.Scanner;
public class BasamakSayisiToplami {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print(" Sayı giriniz : ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int rakam;

        while(tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while( tempNumber != 0){
            basValue = tempNumber % 10;
            rakam = 0;
            for(int i = 1; i <= basNumber; i++){
                rakam = basValue;
            }
            result += rakam;
            tempNumber /= 10;
        }
        System.out.println("Rakamların Toplami : " + result);
    }

}
