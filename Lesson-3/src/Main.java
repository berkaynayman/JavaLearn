public class Main {
    public static void main(String[] args) {
        int gunSayisi = 5;

        switch (gunSayisi){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            default:
                System.out.println("other days");
                break;
        }

    }
}