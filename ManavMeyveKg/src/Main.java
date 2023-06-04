import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double elma=2.14,armut=3.67,muz=0.95,cilek=1.26,elmakg,armutkg,cilekkg,muzkg;

        System.out.println("Kaç Kilo Elma İstediğinizi Yazınız :");elmakg=input.nextDouble();
        System.out.println("Kaç Kilo Armut İstediğinizi Yazınız :");armutkg=input.nextDouble();
        System.out.println("Kaç Kilo Muz İstediğinizi Yazınız :");muzkg=input.nextDouble();
        System.out.println("Kaç Kilo Cilek İstediğinizi Yazınız :");cilekkg=input.nextDouble();

        double sonuc = (elma*elmakg)+(armut*armutkg)+(muz*muzkg)+(cilek*cilekkg);
        System.out.println("Toplam Ödemeniz Gereken Tuar :"+sonuc+"'tl'dir");










    }
}