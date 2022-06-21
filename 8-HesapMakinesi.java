import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selam.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("İşlem uygulamak istediğiniz birinci sayıyı giriniz.");
        int sayi1 = scanner.nextInt();
        System.out.println("İşlem uygulamak istediğiniz ikinci sayıyı giriniz.");
        int sayi2 = scanner.nextInt();

        System.out.println("İşleminizi seçiniz (+ , - , * , /)");
        char islem = scanner.next().charAt(0);

        int sonuc;
        // int sonuc = 0;

        switch (islem) {
            case "+":
                sonuc = sayi1 + sayi2;
                break;
            case "-":
                sonuc = sayi1 - sayi2;
                break;
            case "*":
                sonuc = sayi1 * sayi2;
                break;
            case "/":
                sonuc = sayi1 / sayi2;
                break;
            default:
            System.out.println("Geçersiz işlem.");
                break;
        }
        syste.out.println("İşleminizin sonucu: " + sonuc);
    }

}

/// 21 Haziran 2022
