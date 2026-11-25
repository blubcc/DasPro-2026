package week14;
import java.util.Scanner;
public class HitungBalok25 {
    static int hitungLuas(int p, int l) {
        return p * l;
    }

    static int hitungVolume(int t, int p, int l) {
        return hitungLuas(p, l) * t;
    }

    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        return 2 * (hitungLuas(p, l) + (p * t) + (l * t));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nBalok ke-" + i);

            System.out.print("Masukkan panjang: ");
            int p = input.nextInt();

            System.out.print("Masukkan lebar: ");
            int l = input.nextInt();

            System.out.print("Masukkan tinggi: ");
            int t = input.nextInt();

            int luas = hitungLuas(p, l);
            int volume = hitungVolume(t, p, l);
            int luasPermukaan = hitungLuasPermukaanBalok(p, l, t);

            System.out.println("Luas persegi panjang: " + luas);
            System.out.println("Volume balok: " + volume);
            System.out.println("Luas permukaan balok: " + luasPermukaan);
        }
        input.close();
    }
}