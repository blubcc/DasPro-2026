package week12;

import java.util.Scanner;

public class Tugas125 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int n = input.nextInt();

        int[] nilaiMhs = new int[n];
        int total = 0;
        int tertinggi, terendah;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }

        double rata2 = (double) total / nilaiMhs.length;

        tertinggi = nilaiMhs[0];
        terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        System.out.println("\n--- HASIL REKAP NILAI MAHASISWA ---");
        System.out.println("Nilai rata-rata : " + rata2);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);

        System.out.println("\nDaftar Nilai dan Status Kelulusan:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i] + " (" + status + ")");
        }

        input.close();
    }
}