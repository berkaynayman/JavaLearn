import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5){
            System.out.println("....");
            i++;
        }

        int toplam = 0;
        Scanner SCANNER = new Scanner(System.in);

        while (true){
            System.out.println("bir sayi gir ..: ");
            int sayi = SCANNER.nextInt();
            if(sayi == 0){
                break;
            }else{
                toplam += sayi;
            }
        }

        String name = "";
        Scanner SCANNER = new Scanner(System.in);

        System.out.println("isim gir");

        do{
            name = SCANNER.next();
        }while (name.isEmpty());
        System.out.println("Name ..: " + name);














    }
}