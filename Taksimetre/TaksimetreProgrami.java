import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int acilis = 10;
        int min = 20;

        System.out.println("Açılış Ücreti:" + acilis);
        System.out.println("Minimum Tutar:" +min);

        System.out.print("Km Giriniz:");
        double km = input.nextDouble();
        //System.out.println(km);

        double taksimetre;
        taksimetre = acilis + km * 2.20;
        taksimetre = (taksimetre < 20) ? 20 : taksimetre;
        //üsttekinin anlamı: taksimetre 20den küçükse 20 yazdır.
        //değilse taksimetrenin kendisini yazdır.
        System.out.println("Toplam:" +taksimetre);



    }
}
