import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //problem1();
        //problem2();
        //problem3();
        //problem4();
    }

    static void problem1(){
        /*
        * 0 yazıldıktan sonra döngüden çıkan.
        * Sıfır yazılmadan önce girilen tüm
        * sayıları toplayan
        */
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Start Entering Numbers : ");
        int sum = 0;
        int num;
        while((num = Integer.parseInt(SCANNER.nextLine())) != 0){
            sum += num;
            System.out.println("Sum ..: " + sum);
        }
    }
    static void problem2(){
        /*
        * While dögüsü içerisinde pozitif ve negatif
        * sayıların ayrı ayrı toplamı
        */
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Start Entering Numbers : (Exit Button -> 0)");
        int totalNegativeNum = 0, totalPositiveNum = 0, num;
        while ((num = Integer.parseInt(SCANNER.nextLine())) != 0){
            if (num < 0)
                totalNegativeNum += num;
            else
                totalPositiveNum += num;
        }
        System.out.println("Negative Total ..: " + totalNegativeNum);
        System.out.println("Positive Total ..: " + totalPositiveNum);
    }
    static void problem3(){
        /*
        * Sayının kaç basamaklı olduğunun bulunması
        */
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num;

        while ((num = Integer.parseInt(SCANNER.nextLine())) != 0){
            int countOfDigits = getDigitsCount(num);
            System.out.printf("The number of digits %d is %d", num, countOfDigits);
        }
    }
    public static int getDigitsCount(int num){
        if(num == 0)
            return 1;

        int count = 0;
        while (num != 0){
            ++count;
            num /= 10;
        }
        return count;
    }
    static void problem4(){
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Enter a number ..:");

        int num;
        while((num = Integer.parseInt(SCANNER.nextLine())) != 0){
            int sumOfNumbersDigits = getDigitsSum(num);
            System.out.printf("the sum of the digits of %d is : %d .", num, sumOfNumbersDigits);
        }
    }
    static int getDigitsSum(int num){
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}