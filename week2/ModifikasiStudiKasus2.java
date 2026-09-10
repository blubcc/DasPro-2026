import java.util.Scanner;
public class ModifikasiStudiKasus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Panjang Tanah (meter): ");
        double panjangTanah = scanner.nextDouble();

        System.out.print("Masukkan Lebar Tanah (meter): ");
        double lebarTanah = scanner.nextDouble();

        System.out.print("Masukkan Diameter Kolam (meter): ");
        double diameterKolam = scanner.nextDouble();

        System.out.print("Masukkan Panjang Sisi Taman (meter): ");

        double sisiTaman = scanner.nextDouble();
        double luasTanah = panjangTanah * lebarTanah;    
        double r = diameterKolam / 2.0;
        double luasKolam = Math.PI * r * r;
        double luasTaman = sisiTaman * sisiTaman;
        double luasSisa = luasTanah - (luasKolam + luasTaman);

        System.out.println("\nHasil Perhitungan Luas Tanah");
        System.out.println("Luas Tanah Total  : " + luasTanah + " m²");
        System.out.println("Luas Kolam Ikan   : " + luasKolam + " m²");
        System.out.println("Luas Taman Bunga  : " + luasTaman + " m²");
        System.out.println("---------------------------------------");
        System.out.println("Luas Tanah Sisa   : " + luasSisa + " m²");

        scanner.close();
    }
}