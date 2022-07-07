import java.util.Scanner;

public class hesaplama {
    public static void main(String[] args) {
        int r,aci;

        double pi = 3.14;



        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz :");
         r = input.nextInt();
        System.out.print("Merkez açı ölçüsünü  giriniz :");
        aci = input.nextInt();


        double alan = pi * r *r ;
        double cevre = 2 * pi * r;
        double sonuc = (pi*(r*r)*aci) / 360 ;


        System.out.println("Daire alanı : " + alan);
        System.out.println("Daire çevre : " + cevre);
        System.out.println("Çözüm : " + sonuc);

    }
}
