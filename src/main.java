import java.net.ServerSocket;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int select;
        int balance = 1500;
        int right = 3;

        while (right >= 0) {
            System.out.println("Kullanıcı adınızı giriniz :");
            userName = input.nextLine();

            System.out.println("Parolanızı giriniz :");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                do {
                    System.out.println(" Merhaba, Kodluyoruz Bankasına hoş geldiniz.");
                    System.out.println("1-Bakiye sorgulama \n" +
                            "2-Para Çekme\n" +
                            "3-Para Yatırma\n" +
                            "4- Çıkış Yap");

                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :");
                    select = input.nextInt();

                    if (select != 1 && select != 2 && select != 3 && select != 4) {

                        System.out.println("Yanlış giriş yaptınız.Lütfen tekrar giriş yapınız");
                        System.out.println();
                    }

                    switch (select) {
                        case 1:
                            System.out.println("Bakiyeniz :" + balance);
                            System.out.println();
                            break;

                        case 2:
                            System.out.println("Para miktarı giriniz :");
                            int money = input.nextInt();
                            if (money > balance) {
                                System.out.println("İşleminiz gerçekleştirilemiyor. Bakiye yetersiz!");
                            } else {
                                balance -= money;
                                System.out.println("Yeni bakiyeniz :" + balance);
                                System.out.println();
                            }
                            break;

                        case 3:
                            System.out.println("Para miktarını giriniz :");
                            int money2 = input.nextInt();
                            balance += money2;
                            System.out.println("Yeni bakiyeniz :" + balance);
                            System.out.println();
                            break;

                    }

                } while (select != 4);
                System.out.println("Sistemden çıkış yaptınız. Tekrar görüşmek üzere.");
                break;


            } else {
                right--;
                if (right >= 1) {
                    System.out.println("Yanlış giriş yaptınız. Tekrar deneyiniz.");

                    System.out.println("Kalan hakkınız :" + right);

                    System.out.println();


                } else if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankanız ile iletişime geçiniz.");
                    break;
                }

            }
        }
    }
}
