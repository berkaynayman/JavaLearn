public class Main {
    public static void main(String[] args) {
        /*
        * Primitive Type -> Object olmayan. int, double, char, byte, short
        */

        /*
        * 1. Primitive to Primitive
        *       1.1 Widening(no cast)
        *       //byte->short->int->long->float->double
        */
        int i0=5;   // 0000 0000 0000 0000 0000 0000 0000 0101
        double d0=i0; // 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0101
        System.out.println(d0);

        //      1.2 Narrowing (necessary cast)
                //byte<-short<-int<-long<-float<-double

        double d1=5.2;
        int i1= (int) d1;
        System.out.println(i1);

        char ch2='A';
        int i2=ch2;
        System.out.println(i2);

        float f3 = 65f;
        char c3 = (char) f3;
        System.out.println(c3);

        float f4 = 10.65f;
        long l4 = (long)f4;
        System.out.println(l4);

        int fahrenheit = 100;
        int celcius = (int) ((fahrenheit-32)*5.0/9.0);
        System.out.println(celcius);

        short s5 = 5;       // 0000 0000 0000 0101
        byte b5 = (byte) s5;          // 0000 0101
        System.out.println(b5);

        short s6 = 127;    // 0000 0000 0111 1111
        byte b6 = (byte) s6;         // 0111 1111
        System.out.println(b6);

        short s7 = 128;    // 0000 0000 1000 0000
        byte b7 = (byte) s7;         // 1000 0000
        System.out.println(b7); //-128

    }
}