import java.util.Scanner;
public class MenghitungLuasPersegiPanjang25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;

        System.out.print("Masukkan panjang: ");
        panjang = sc.nextInt();

        System.out.print("Masukkan lebar: ");
        lebar = sc.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas persegi adalah " + luas);

        sc.close();
    }
}