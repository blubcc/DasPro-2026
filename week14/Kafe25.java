package week14;
import java.util.Scanner;
public class Kafe25 {

    public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (jamKunjung >= 14 && jamKunjung <= 16) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
    }

    public static int hitungTotalHarga25(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int persenDiskon = 0;

        if (kodePromo.equals("DISKON50")) {
            persenDiskon = 50;
        } else if (kodePromo.equals("DISKON30")) {
            persenDiskon = 30;
        } else {
            System.out.println("Kode promo invalid");
        }

        if (isMember) {
            persenDiskon += 10;
        }

        return total * persenDiskon / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Andi", true, 15);

        int totalBayar = 0;
        boolean isMember = true;

        while (true) {
            System.out.print("\nMasukkan nomor menu (1-6, 0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
                continue;
            }

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            totalBayar += hitungTotalHarga25(pilihanMenu, banyakItem);
        }

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next();

        int diskon = hitungDiskon(totalBayar, kodePromo, isMember);
        int totalAkhir = totalBayar - diskon;

        System.out.println("\nTotal harga: Rp " + totalBayar);
        System.out.println("Besar diskon: Rp " + diskon);
        System.out.println("Total yang harus dibayar: Rp " + totalAkhir);

        sc.close();
    }
}