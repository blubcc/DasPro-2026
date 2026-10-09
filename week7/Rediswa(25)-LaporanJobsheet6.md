# Laporan Praktikum - Jobsheet 6: Studi Kasus Pemilihan dengan Git dan GitHub

Nama: Rediswa Janya Sahastana
NIM: 264107020243
Kelas: TI - 1D

---

## 1. Persiapan Awal & Pengaturan Git

Pada tahap awal ini, dilakukan pengaturan identitas global pada Visual Studio Code agar setiap perubahan (*commit*) tercatat dengan benar atas nama mahasiswa.

```bash
git config --global user.name "blubcc"
git config --global user.email "rediswajanyas@gmail.com"

2. Percobaan 1: Menyiapkan Repository GitHub
2.1 Langkah-Langkah Pembuatan Repository
Membuat repository baru di GitHub dengan nama PraktikumDaspro25 dengan status Public.

Melakukan clone repository tersebut ke komputer lokal melalui Visual Studio Code menggunakan URL HTTPS repository.

Membuat file README.md yang berisi identitas diri (Nama, NIM, Kelas) dan melakukan Commit serta Push pertama ke GitHub.

3. Percobaan 2: Studi Kasus 1 (StudiKasus125.java)
3.1 Kode Program (StudiKasus125.java)

import java.util.Scanner;

public class StudiKasus125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        double totalHarga, diskon = 0, totalBayar, kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 0.10;
        } else {
            diskon = 0;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga : Rp " + (int)totalHarga);
        System.out.println("Diskon      : Rp " + (int)diskon);
        System.out.println("Total bayar : Rp " + (int)totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian   : Rp " + (int)kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + (int)kurang);
        }

        sc.close();
    }
}

3.2 Hasil Output Program

Masukkan jumlah cup: 3
Masukkan uang bayar: 50000
Total harga : Rp 54000
Diskon      : Rp 0
Total bayar : Rp 54000
Uang tidak cukup, kurang Rp 4000

4. Percobaan 3: Studi Kasus 2 (StudiKasus225.java)
4.1 Kode Program (StudiKasus225.java)
Java
import java.util.Scanner;

public class StudiKasus225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenis = sc.nextLine().trim().toUpperCase();

        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            System.out.print("Jumlah dokumen: ");
            int dokumen = sc.nextInt();
            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara): ");
            int juara = sc.nextInt();

            if (juara == 1 || juara == 2 || juara == 3) {
                if (dokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurangDoc = 4 - dokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDoc + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
        } else if (jenis.equals("PKM")) {
            System.out.print("Jumlah dokumen: ");
            int dokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            int pkmStatus = sc.nextInt();

            if (pkmStatus == 1) {
                if (dokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    int kurangDoc = 4 - dokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDoc + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }
        } else {
            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }

        sc.close();
    }
}

4. Percobaan 3: Studi Kasus 2 (StudiKasus225.java)
4.1 Kode Program (StudiKasus225.java)

import java.util.Scanner;

public class StudiKasus225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenis = sc.nextLine().trim().toUpperCase();

        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            System.out.print("Jumlah dokumen: ");
            int dokumen = sc.nextInt();
            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara): ");
            int juara = sc.nextInt();

            if (juara == 1 || juara == 2 || juara == 3) {
                if (dokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurangDoc = 4 - dokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDoc + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
        } else if (jenis.equals("PKM")) {
            System.out.print("Jumlah dokumen: ");
            int dokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            int pkmStatus = sc.nextInt();

            if (pkmStatus == 1) {
                if (dokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    int kurangDoc = 4 - dokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDoc + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }
        } else {
            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }

        sc.close();
    }
}

4.2 Hasil Output Program

Nama mahasiswa : Dori
Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): bakorma
Jumlah dokumen: 3
Peringkat juara: 1
Status: Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan.

5. Percobaan 4: Uji Silang Program Teman
Hasil Uji Studi Kasus 2 oleh Rediswa Janya 25

## Hasil Uji Studi Kasus 2 oleh Rediswa Janya 25

| No | Jenis | Dokumen | Juara/Dana | Output       | Sesuai? |
| -- | ----- | ------- | ---------- | ------------ | ------- |
| 1  | 2     | 4       | 3          | Berhak       | Ya      |
| 2  | 1     | 3       | 2          | Berhak       | Ya      |
| 3  | 3     | 2       | 1          | Berhak       | Ya      |
| 4  | 0     | 0       | 0          | Tidak Berhak | Ya      |

6. Kesimpulan
Praktikum Jobsheet 6 ini memberikan pemahaman mendalam mengenai penerapan struktur pemilihan dasar serta pemilihan bersarang (Nested IF) dalam menyelesaikan studi kasus logika pemrograman berbasis Java menggunakan file StudiKasus125.java dan StudiKasus225.java. Selain itu, mahasiswa dapat mempraktikkan langsung alur kerja kolaborasi Git dan GitHub mulai dari proses clone, add, commit, push, pull, hingga uji silang program antar teman dengan baik.