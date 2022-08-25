public class BirYuzArasindakiAsalSayilar {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 2; i <= 100; i++) {

            count = 0;
            for (int n = 2; n <= i; n++) {
                if (i % n == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(i + " , ");

            }

        }


    }
}

