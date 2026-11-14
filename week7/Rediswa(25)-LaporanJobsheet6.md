# JOBSHEET 4 - PEMILIHAN 1

**Identitas Mahasiswa:**
* **Nama:** [Rediswa Janya Sahastana]
* **NIM:** [264107020243]
* **Kelas / No. Presensi:** [1D / 25]

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1.	Mahasiswa mampu menyelesaikan studi kasus menggunakan struktur pemilihan dasar dan pemilihan bersarang. 
2.	Mahasiswa mampu menyimpan dan mengumpulkan pekerjaan menggunakan Git dan GitHub melalui Visual Studio Code. 
3.	Mahasiswa mampu berkolaborasi dengan teman menggunakan GitHub. 

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Pengaturan Git dan Setup Repository GitHub
Pada tahap awal ini, dilakukan konfigurasi identitas global Git di lingkungan lokal serta pembuatan repository publik untuk mengelola riwayat pengerjaan tugas praktikum.

#### 2.1.1 Konfigurasi Git Global
```bash
git config --global user.name "rediswajanyas"
git config --global user.email "rediswajanyas@gmail.com"
```

#### 2.2 Percobaan 2: Studi Kasus 1
Percobaan ini berfokus pada penerapan pemilihan kondisi sederhana untuk menghitung total belanja, potongan diskon, serta validasi ketersediaan uang pembayaran pada kasus kedai kopi.

#### 2.2.1 Kode Program Java
```java
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
```
#### 2.2.2 Hasil Running
Berikut adalah tampilan output saat program dijalankan:

Masukkan jumlah cup: 3
Masukkan uang bayar: 50000
Total harga : Rp 54000
Diskon      : Rp 0
Total bayar : Rp 54000
Uang tidak cukup, kurang Rp 4000

---

### 2.3 Percobaan 3: Studi Kasus 2
Percobaan ini menggunakan struktur pemilihan bersarang (nested-if) untuk memvalidasi kelayakan penerimaan dana penghargaan berdasarkan jenis kegiatan, jumlah dokumen, serta peringkat prestasi atau status pendanaan.

#### 2.3.1 Kode Program Java
```java
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
```
#### 2.3.2 Hasil Running
Berikut adalah tampilan output saat program dijalankan:

Nama mahasiswa : Dori
Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): bakorma
Jumlah dokumen: 3
Peringkat juara: 1
Status: Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan.

---

## 3: TUGAS MANDIRI & UJI SILANG
Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1:** Pembuatan dan implementasi kode program StudiKasus125.java.
- [x] **Tugas 2:** Pembuatan dan implementasi kode program StudiKasus225.java dengan logika *Nested-IF*.
- [x] **Tugas 3:** Melakukan uji silang program antar teman menggunakan version control Git & GitHub.

### 3.1 Tabel Pengujian Parameter Output (Uji Silang Studi Kasus 2)
Berikut adalah hasil pengujian program dengan berbagai kombinasi parameter:
##### Hasil Uji Studi Kasus 2 milik Saefira Bahari (26) oleh Rediswa Janya (25).

| No | Jenis | Dokumen | Juara/Dana | Output       | Sesuai? |
| -- | ----- | ------- | ---------- | ------------ | ------- |
| 1  | 2     | 4       | 3          | Berhak       | Ya      |
| 2  | 1     | 3       | 2          | Berhak       | Ya      |
| 3  | 3     | 2       | 1          | Berhak       | Ya      |
| 4  | 0     | 0       | 0          | Tidak Berhak | Ya      |

---

## 4: KESIMPULAN
Struktur pemilihan majemuk dan bersarang (nested-if) sangat efektif digunakan untuk menangani validasi aturan bisnis yang memiliki banyak tingkatan kondisi dan syarat administratif. Selain itu, integrasi penggunaan Git dan GitHub memudahkan proses pengelolaan versi kode sumber serta kolaborasi pengerjaan tugas secara terstruktur.



