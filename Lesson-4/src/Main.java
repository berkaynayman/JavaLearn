import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sayHello();
        showPi();
        writeMessage("Bu bir mesajtir");
        System.out.println("Sonuç ..: " + topla(3, 10));
        System.out.println("5 in karesi -> " + square(5));

        System.out.println("cikartma");
        System.out.println(cikarma(10, 5));
        System.out.println(cikarma(10, 5, 1));
        System.out.println(cikarma(10, 5, 1, 1));
        System.out.println(cikarma("10", "5", "1", "1"));

        System.out.println("isUnderAge(19) - " + isUnderAge(19));

        if (checkVaccineorPCR() == true){
            System.out.println("Ucağa binebilrsin :-)");
        }else{
            System.out.println("Ucağa binemezsin :-X ");
        }

        int sayi = -1; // int sayi = +1
        System.out.println(sayi);
    }
    // method overloading - start
    /*
    *   ayni isimde birden fazla fonksiyon tanımlarız
    *   ayni isimde fonksiyonlar parametre sayısından ve
    *   parametredi veri tipinden ayırt edilir
    * */
    static  int cikarma(int n1, int n2){
        return  n1 - n2;
    }
    static int cikarma(int n1, int n2, int n3){
        return  n1 - n2 - n3;
    }
    static int cikarma(int n1, int n2, int n3, int n4){
        return n1 - n2 - n3 - n4;
    }
    static String cikarma(String n1, String n2, String n3, String n4){
        return n1 + n2 + n3 + n4;
    }

    // method overloading - finish

    // int ile return ediceğimiz değerin tipini belirtiyoruz
    static int topla(int sayi1, int sayi2){
        return  sayi1 + sayi2;
    }
    static int square(int sayi){
        return  sayi * sayi;
    }
    // void ile tanimlananlar geriye değer döndürmez
    static  void sayHello(){
        System.out.println("Hello world!");
    }
    static  void showPi(){
        System.out.println(3.14);
    }
    static  void  writeMessage(String message){
        System.out.println(message);
    }
    static  boolean isUnderAge(int age){
        if(age <= 18){
            return true;
        }
        return false;
    }

    static boolean checkVaccineorPCR(){
        Scanner SCANNER = new Scanner(System.in);
        String answer;

        System.out.println("PCR testi yaptırdınmı? [Y] [N]");
        answer = SCANNER.next();

        if (answer.equals("Y")){
            return true;
        }else{
            System.out.println("Asi oldunuzmu? [Y] [N]");
            answer = SCANNER.next();
            if (answer.equals("Y")){
                return true;
            }else{
                return false;
            }
        }

    }












}