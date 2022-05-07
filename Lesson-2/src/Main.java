import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int number1 = 22, number2 = 12;
        System.out.println(" + " + (number1 + number2));
        System.out.println(" - " + (number1 - number2));
        System.out.println(" / " + (number1/number2));
        System.out.println(" * " + (number1 * number2));
        System.out.println(" % " + (number1 % number2));
        //number1++;
        number1 += 5;
        System.out.println(number1);
        //number2--;
        number2 -= 3;
        System.out.println(number2);
        */

        /*
         int a = 5, b = 11, c = 8;
         if(a < b){
             System.out.println("a küçüktür b den");
         }
         if(b > c){
             System.out.println("b büyüktür c den");
         }else if(c > b){
             System.out.println(("c büyüktür beden"));
         }else {
             System.out.println("eşittir");
         }
           */

        Scanner SCANNER = new Scanner((System.in));
        System.out.println("Notunuzu giriniz ..: ");
        int point = SCANNER.nextInt();

        if(point >= 85){
            System.out.println("AA");
        }else if(point >= 60){
            System.out.println("BB");
        }else if(point >= 50){
            System.out.println("CC");
        }else if(point >= 25){
            System.out.println("DD");
        }









    }
}