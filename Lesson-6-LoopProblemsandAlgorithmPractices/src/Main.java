import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //problem1();
        //problem2();
        //problem3();
        //problem4();
        //problem5();
        //problem6();
        //problem7();
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
    static void problem5(){
        Scanner kb = new Scanner(System.in);

        int sum = 0;
        int num;

        /*
        * for(int i = 0; i < 10 ; i++)
        * 1. akış for döngüsüne geldiğinde ilk kez ve bir kez yapılıcak kısımdır.
        *    System.out.println("Start entering numbers: "), System.out.print("num:")
        *
        * 2. kısım for döngüsünün koşul kısmıdır. Boolean türden bir ifade olması gerekir.
        *
        * 3. kısım döngünün bir adımı tamamlandığında bir sonraki adımı geçmek için
        *    yapacağı kontrolden hemen önce çalışır.
        *
        */
        for(System.out.println("Start entering numbers: "), System.out.print("num:");
            (num = Integer.parseInt(kb.nextLine())) != 0;
            sum += num, System.out.print("num:"));

        System.out.printf("Sum: %d%n", sum);
    }
    static void problem6(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number .. :");

        int num;

        while((num = Integer.parseInt(kb.nextLine())) != 0){
            int reverse = getReverse(num);
            System.out.printf("The reverse of %d is %d", num, reverse);
            System.out.print("Enter a number");
        }

    }
        static  int getReverse(int num){
            int reverse = 0;
            while(num != 0){
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }
            return  reverse;
        }

    static void problem7(){
        Scanner kb = new Scanner(System.in);

        for(;;){
            System.out.println("Enter the base number ..: ");
            int baseNumber = Integer.parseInt(kb.nextLine());

            System.out.println("Enter the power of the number ..: ");
            int powerOfNumber = Integer.parseInt(kb.nextLine());

            System.out.printf("pow(%d, %d) = %d%n", baseNumber, powerOfNumber, pow(baseNumber, powerOfNumber));
        }
    }
        static int pow(int baseNumber, int powerOfNumber){
            if (baseNumber <= 0){
                return 1;
            }

            int result = 1;
            for (int i=0; i < powerOfNumber; i++){
                result *= baseNumber;
            }

            return result;
        }





















}