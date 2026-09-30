# Laporan Praktikum - Jobsheet 6: Pemilihan 2

Nama: Rediswa Janya Sahastana
NIM: 264107020243
Kelas: TI - 1D

## 1. Percobaan 1: Nested IF untuk Mengecek Syarat Ujian Skripsi

### 1.1 Kode Program

```java
import java.util.Scanner;

public class nestedUjianSkripsiNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }

        System.out.println(pesan);
        sc.close();
    }
}
```

### 1.2 Hasil Output

```
Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ya
Masukkan jumlah log bimbingan Pembimbing 1: 6
Masukkan jumlah log bimbingan Pembimbing 2: 5
Gagal! Log bimbingan P1 belum mencapai 8 kali
```

### 1.3 Pertanyaan & Jawaban

1. **Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?**

   *Jawab:* Jika menjawab selain "Ya", program akan menjalankan blok `else` dan variabel `pesan` akan bernilai `"Gagal! Mahasiswa masih memiliki tanggungan kompen"`. Mengapa demikian? Karena struktur kode menggunakan `nested if`, pengecekan status `bebasKompen.equalsIgnoreCase("Ya")` bertindak sebagai gerbang utama (level pertama). Jika syarat utama ini bernilai salah (`false`), program langsung menyatakan mahasiswa gagal karena tanggungan kompen tanpa memeriksa log bimbingan.

2. **Jelaskan maksud dari potongan kode berikut: `if (bimbinganP1 >= 8 && bimbinganP2 >= 4)`**

   *Jawab:* Kode tersebut berfungsi untuk memeriksa apakah mahasiswa memenuhi syarat minimum log bimbingan secara bersamaan, yaitu minimal 8 kali dengan Pembimbing 1 **dan** minimal 4 kali dengan Pembimbing 2.

3. **Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!**

   *Jawab:*

   * **Level 1 (Kompen):** Sistem memeriksa apakah mahasiswa sudah bebas kompen. Jika tidak, langsung ditolak. Jika ya, dilanjutkan ke level 2.

   * **Level 2 (Bimbingan):**

     * Jika $P1 \ge 8$ dan $P2 \ge 4$ $\rightarrow$ Semua syarat terpenuhi, boleh mendaftar.

     * Jika $P1 < 8$ dan $P2 < 4$ $\rightarrow$ Gagal karena kedua pembimbing kurang dari syarat.

     * Jika hanya $P1 < 8$ $\rightarrow$ Gagal karena log P1 belum mencapai 8 kali.

     * Jika kondisi lain terpenuhi (artinya P1 $\ge 8$ tetapi P2 $< 4$) $\rightarrow$ Gagal karena log P2 belum mencapai 4 kali.

---

## 2. Percobaan 2: Operator Logika untuk Menentukan Akses WiFi Kampus

### 2.1 Kode Program

```java
import java.util.Scanner;

public class operatorLogikaWifiNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();
        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();
        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }

        sc.close();
    }
}
```

### 2.2 Hasil Output

```
Apakah pengguna mahasiswa? (true/false): true
Apakah pengguna dosen? (true/false): false
Apakah akun sedang diblokir? (true/false): false
Akses WiFi diberikan
```

### 2.3 Pertanyaan & Jawaban

1. **Jelaskan fungsi operator `||`, `&&`, dan `!` pada kondisi program tersebut.**

   *Jawab:*

   * `||` (OR): Menghasilkan nilai benar jika salah satu atau kedua operand bernilai benar (pengguna berupa mahasiswa atau dosen).

   * `&&` (AND): Menghasilkan nilai benar hanya jika kedua kondisi di sisi kiri dan kanan bernilai benar (status profesi terpenuhi **dan** akun tidak diblokir).

   * `!` (NOT): Membalikkan nilai boolean (mengubah `true` menjadi `false`, atau sebaliknya). Pada `!akunDiblokir`, artinya memastikan bahwa status akun tidak sedang diblokir.

2. **Mengapa pengguna dosen tetap dapat memperoleh akses ketika nilai `mahasiswa = false`?**

   *Jawab:* Karena di dalam tanda kurung digunakan operator `||` (OR), yang berarti salah satu kondisi bernilai `true` sudah cukup untuk membuat ekspresi `(mahasiswa || dosen)` bernilai `true`. Ketika `dosen = true`, maka `false || true` menghasilkan `true`.

3. **Ubah operator `||` menjadi `&&`. Jalankan kembali program menggunakan data uji 1 dan 2. Apa yang terjadi dan mengapa?**

   *Jawab:* Akses WiFi akan ditolak untuk data 1 (`true, false, false`) dan data 2 (`false, true, false`). Ini terjadi karena operator `&&` (AND) menuntut kedua variabel (`mahasiswa` dan `dosen`) bernilai `true` secara bersamaan, padahal seseorang tidak mungkin berstatus sebagai mahasiswa dan dosen sekaligus dalam satu akun uji.

4. **Pada ekspresi `mahasiswa || dosen`, kapan kondisi `dosen` tidak perlu dievaluasi? Jelaskan berdasarkan short-circuit evaluation.**

   *Jawab:* Kondisi `dosen` tidak perlu dievaluasi jika variabel `mahasiswa` bernilai `true`. Berdasarkan sifat *short-circuit evaluation* pada operator `||`, jika operand pertama sudah bernilai `true`, hasil akhirnya pasti `true` tanpa harus mengecek operand kedua.

5. **Pada ekspresi `(mahasiswa || dosen) && !akunDiblokir`, kapan kondisi `!akunDiblokir` tidak perlu dievaluasi? Jelaskan.**

   *Jawab:* Kondisi `!akunDiblokir` tidak perlu dievaluasi jika hasil evaluasi dari `(mahasiswa || dosen)` bernilai `false`. Berdasarkan sifat *short-circuit evaluation* pada operator `&&`, jika bagian kiri bernilai `false`, maka keseluruhan ekspresi sudah pasti bernilai `false`, sehingga bagian kanan diabaikan oleh sistem.

---

## 3. Percobaan 3: Nested IF dan Operator Logika untuk Menentukan Akses Laboratorium

### 3.1 Kode Program

```java
import java.util.Scanner;

public class nestedAksesLabNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }

        sc.close();
    }
}
```

### 3.2 Hasil Output (Empat Kombinasi Kemungkinan)

1. **Akses Diberikan (Lolos Semua Syarat):**
   ```
   Apakah mahasiswa aktif? (true/false): true
   Apakah sedang disanksi? (true/false): false
   Apakah punya izin dosen? (true/false): true
   Apakah asisten lab? (true/false): false
   Akses laboratorium diberikan
   ```

2. **Ditolak di Level Kedua (Tidak ada izin / bukan asisten):**
   ```
   Apakah mahasiswa aktif? (true/false): true
   Apakah sedang disanksi? (true/false): false
   Apakah punya izin dosen? (true/false): false
   Apakah asisten lab? (true/false): false
   Akses ditolak: membutuhkan izin dosen atau status asisten lab
   ```

3. **Ditolak di Level Pertama (Status Mahasiswa Tidak Aktif):**
   ```
   Apakah mahasiswa aktif? (true/false): false
   Apakah sedang disanksi? (true/false): false
   Apakah punya izin dosen? (true/false): true
   Apakah asisten lab? (true/false): false
   Akses ditolak: status mahasiswa tidak memenuhi syarat
   ```

4. **Ditolak di Level Pertama (Sedang Disanksi):**
   ```
   Apakah mahasiswa aktif? (true/false): true
   Apakah sedang disanksi? (true/false): true
   Apakah punya izin dosen? (true/false): true
   Apakah asisten lab? (true/false): true
   Akses ditolak: status mahasiswa tidak memenuhi syarat
   ```

### 3.3 Pertanyaan & Jawaban

1. **Mengapa pemeriksaan `punyaIzinDosen || asistenLab` ditempatkan di dalam IF pertama?**

   *Jawab:* Karena pemeriksaan izin atau status asisten lab tersebut hanya berlaku bagi mahasiswa yang telah lolos verifikasi utama di level pertama, yaitu berstatus aktif dan tidak sedang mendapatkan sanksi akademik.

2. **Jelaskan fungsi operator `&&`, `||`, dan `!` pada program tersebut.**

   *Jawab:*
   * `&&`: Memastikan kedua syarat level pertama terpenuhi secara bersamaan (aktif **dan** tidak disanksi).
   * `||`: Memberikan alternatif pilihan di level kedua (punya izin dosen **atau** asisten lab).
   * `!`: Membalikkan nilai boolean pada `sedangDisanksi` agar syarat bernilai benar jika mahasiswa **tidak** disanksi.

3. **Apakah syarat akses dapat ditulis menjadi satu kondisi: `mahasiswaAktif && !sedangDisanksi && (punyaIzinDosen || asistenLab)`? Jelaskan apakah keputusan akses akhirnya sama.**

   *Jawab:* Ya, keputusan akses akhirnya akan sama persis. Namun kekurangannya adalah program kehilangan kemampuan untuk memberikan pesan penolakan yang spesifik di tiap tingkat kesalahan pengguna.

4. **Apa keuntungan menggunakan Nested IF pada kasus ini dibandingkan hanya satu IF jika sistem perlu menampilkan alasan penolakan yang berbeda?**

   *Jawab:* Keuntungannya adalah program mampu mendeteksi dan memberikan umpan balik (*feedback*) berupa alasan penolakan yang spesifik sesuai dengan tahapan syarat mana yang dilanggar pengguna.

5. **Buat satu kombinasi masukan yang menyebabkan akses ditolak pada level pertama dan satu kombinasi yang menyebabkan akses ditolak pada level kedua.**

   *Jawab:*
   * Ditolak di level pertama: `mahasiswaAktif = true`, `sedangDisanksi = true`, `punyaIzinDosen = true`, `asistenLab = false`.
   * Ditolak di level kedua: `mahasiswaAktif = true`, `sedangDisanksi = false`, `punyaIzinDosen = false`, `asistenLab = false`.

---

## 4. Tugas

### 4.1 Tugas 1: Implementasi Sistem Diskon Toko Buku (`Tugas1DiskonTokoBukuNoPresensi.java`)

```java
import java.util.Scanner;

public class Tugas1DiskonTokoBukuNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = sc.nextLine().trim().toLowerCase();

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = sc.nextInt();

        double diskon = 0;

        if (jenisBuku.equals("kamus")) {
            diskon = 10;
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5;
            } else {
                diskon = 0;
            }
        }

        System.out.println("Jenis Buku: " + jenisBuku);
        System.out.println("Jumlah Buku: " + jumlahBuku);
        System.out.println("Besar diskon yang didapatkan: " + diskon + "%");

        sc.close();
    }
}
```

### 4.2 Tugas 2: Seleksi Calon Asisten Praktikum (`tugas2SeleksiAsistenNoPresensi.java`)

```java
import java.util.Scanner;

public class tugas2SeleksiAsistenNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        boolean statusAktif = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang mendapatkan sanksi akademik? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();

        if (statusAktif && !sedangDisanksi) {
            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            int nilaiDP = sc.nextInt();
            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
            boolean punyaSertifikat = sc.nextBoolean();

            if (nilaiDP >= 80 || punyaSertifikat) {
                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = sc.nextInt();

                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat! Mahasiswa diterima sebagai asisten praktikum.");
                } else {
                    System.out.println("Gagal! Nilai wawancara kurang dari 75.");
                }
            } else {
                System.out.println("Gagal! Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi.");
            }
        } else {
            System.out.println("Gagal! Mahasiswa tidak memenuhi syarat (tidak aktif atau sedang mendapatkan sanksi akademik).");
        }

        sc.close();
    }
}
```

### 4.3 Hasil Output Tugas 2

```
Apakah mahasiswa berstatus aktif? (true/false): true
Apakah mahasiswa sedang mendapatkan sanksi akademik? (true/false): false
Masukkan nilai Dasar Pemrograman: 85
Apakah memiliki sertifikat kompetensi pemrograman? (true/false): false
Masukkan nilai wawancara: 80
Selamat! Mahasiswa diterima sebagai asisten praktikum.
```