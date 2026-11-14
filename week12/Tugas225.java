package week12;

import java.util.Scanner;

public class Tugas225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println("========================");

        System.out.print("\nMasukkan nama makanan/minuman yang ingin dicari: ");
        String cariMenu = input.nextLine();
        boolean ditemukan = false;
        int hargaDitemukan = 0;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                ditemukan = true;
                hargaDitemukan = harga[i];
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Menu \"" + cariMenu + "\" tersedia dengan harga: Rp " + hargaDitemukan);
        } else {
            System.out.println("Mohon maaf, menu \"" + cariMenu + "\" tidak tersedia di kafe.");
        }

        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine();

        String[] pesananNama = new String[jumlahPesanan];
        int[] pesananHarga = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            while (true) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + " : ");
                String namaItem = input.nextLine();
                boolean valid = false;
                int hargaItem = 0;

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaItem)) {
                        valid = true;
                        hargaItem = harga[j];
                        namaItem = menu[j];
                        break;
                    }
                }

                if (valid) {
                    pesananNama[i] = namaItem;
                    pesananHarga[i] = hargaItem;
                    totalBiaya += hargaItem;
                    break;
                } else {
                    System.out.println("Menu tidak valid atau tidak ada di daftar! Silakan masukkan ulang.");
                }
            }
        }

        System.out.println("\n==================================");
        System.out.println("         DAFTAR PESANAN ANDA      ");
        System.out.println("==================================");
        for (int i = 0; i < pesananNama.length; i++) {
            System.out.println((i + 1) + ". " + pesananNama[i] + " \t- Rp " + pesananHarga[i]);
        }
        System.out.println("----------------------------------");
        System.out.println("Total Biaya : Rp " + totalBiaya);
        System.out.println("==================================");

        input.close();
    }
}