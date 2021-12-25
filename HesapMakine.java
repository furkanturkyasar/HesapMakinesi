import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;

        System.out.print("Ilk sayiyi giriniz: ");
        n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Yapmak istediginiz islemi seciniz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplama sonucu: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Cikarma sonucu: " + (n1 - n2));
                break;
            case 3:
                System.out.print("Carpma sonucu: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print("Bolme Sonucu: " + (n1 / n2));
                } else {
                    System.out.print("Bir sayi 0 a bolunemez!");
                }

                break;
            default:
                System.out.print("Yanlis bir sayi girdiniz tekrar deneyiniz!");
                break;
        }


    }
}
