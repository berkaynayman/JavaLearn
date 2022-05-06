import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        /*
        System.out.println("Berkay Naymrfrrrrrran");
        System.out.println(3+22);
        System.out.println("5 x 4 = "  + 5*4 );
        //println kullandığımız için çıktıdan sonra bir satır aşağı geçer
        System.out.println("I am " + 21 + " years old.sdsad");

        System.out.print("AAA");
        System.out.print("bbbb");

        System.out.println("Byte: " +  Byte.MAX_VALUE);
        System.out.println("Sort: " +  Short.MAX_VALUE);
        System.out.println("Integer: " +  Integer.MAX_VALUE);
        System.out.println("Long: " +  Long.MAX_VALUE);
        */

        /*
        byte b = 20;
        short s = 101;
        int x = 200;
        // long tipini kullandığımız zaman değerin sonuna L koymalıyız
        long uzunSayi = 4545431154556L;

        // float tipini kullandığımız zaman değerin sonuna f koymalıyız
        float pi = 3.14522f;

        double piExtended = 3.145565885243;

        // char tipinde atama yaptığımız zaman ' '(tek tırnak) kullanırız
        char toplam = '+';

        int A = 1, B = 2, C = 3;


        System.out.println(A + toplam + B); //46 -> 1 + 43(+ nın ASCII değeri) + 2

        String name = "Berkay", lastName = "Nayman";

        System.out.println(name + ' ' + lastName);

        // camelCase
        String kullaniciAdi = "berkay.nayman";

        // PascalCase
        float PiSayisi = 3.14f;

        // SNAKE_CASE
        double KDV_ORANI = 0.18;

        */

        Scanner SCANNER = new Scanner(System.in);
        String username = SCANNER.next();

        System.out.println("Merhaba " + username);

        int yas = SCANNER.nextInt();
        System.out.println("Yaşınız " + yas);

    }
}