import java.util.Scanner;

public class Ornek_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double boy, kg;
        System.out.println("Boyunuzu giriniz : ");
        kg = scanner.nextDouble();
        System.out.println("Kilonuzu giriniz : ");
        boy = scanner.nextDouble();
        System.out.println("Vucüt Kitle İndeksiniz : " + (kg / (Math.pow(boy, 2))));
    }
}
