import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

            while( right > 0) {
                System.out.print(" Kullanıcı Adınız : ");
                userName = input.nextLine();
                System.out.print(" Parolanız : ");
                password = input.nextLine();

                if (userName.equals("sezil") && password.equals("123")) {
                    System.out.println("Merhaba Java Bankasına Hoşgeldiniz.Lütfen yapacağınız işlemi seçiniz. ");

                    System.out.println(" 1-Para Yatırma\n" + " 2-Para Çekme\n" + " 3-Bakiye Sorgulama\n" + " 4-Çıkış");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.print("Bakiyeniz " + balance);
                            break;
                        case 2:
                            System.out.println("Çekme istediğiniz tutar: ");
                            int tutar = input.nextInt();
                            if (tutar > balance) {
                                System.out.println("Yetersiz bakiye");
                                break;
                            } else {
                                balance -= tutar;
                                System.out.println(" Kalan Bakiyeniz: " + balance);
                            }
                            break;

                        case 3:
                            System.out.println("Mevcut Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println(" Çıkış Yapıldı. Tekrar görüşmek üzere.");
                            break;
                    }

                } else {
                    right--;
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    if (right == 0) {
                        System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                    } else {
                        System.out.println("Kalan Hakkınız :" + right);
                    }
                }
            }

    }
}
