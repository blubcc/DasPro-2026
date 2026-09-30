import java.util.Scanner;
//Rediswa Janya TI-1D
//264107020243
public class HitungOjolSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input jumlah mitra yg dihitung
        System.out.print("Masukkan jumlah mitra: ");
        int jumlahMitra = input.nextInt();

        double totalKeuntunganSemua = 0;
        int totalTransaksiSemua = 0;

        // (ini looping) memproses setiap mitra 
        for (int i = 1; i <= jumlahMitra; i++) {
            System.out.println("\n--- Data Mitra ke-" + i + " ---");

            // input variabel driver
            System.out.print("Tarif dasar (Rp): ");
            double tarifDasar = input.nextDouble();

            System.out.print("Jarak perjalanan (km): ");
            double jarak = input.nextDouble();

            System.out.print("Biaya bahan bakar per km (Rp): ");
            double bahanBakar = input.nextDouble();

            System.out.print("Komisi perusahaan (%): ");
            double komisi = input.nextDouble();

            System.out.print("Resiko keterlambatan (%): ");
            double keterlambatan = input.nextDouble();

            System.out.print("Jumlah transaksi driver: ");
            int jmlTransDriver = input.nextInt();



            // input variabel merchant
            System.out.print("Harga jual makanan (Rp): ");
            double hargaJual = input.nextDouble();

            System.out.print("Biaya makanan (Rp): ");
            double biayaMakanan = input.nextDouble();

            System.out.print("Resiko kerusakan barang (%): ");
            double kerusakan = input.nextDouble();

            System.out.print("Jumlah transaksi merchant: ");
            int jmlTransMerchant = input.nextInt();



            // menghitung keuntungan driver
            double untungDriver = ((tarifDasar * jarak) - (bahanBakar * jarak)) 
                                  * (1 - komisi / 100) * (1 - keterlambatan / 100) * jmlTransDriver;

            // menghitung keuntungan merchant
            double untungMerchant = (hargaJual - biayaMakanan) 
                                    * (1 - kerusakan / 100) * (1 - komisi / 100) * jmlTransMerchant;

            // keuntungan dri setiap mitra
            double totalMitra = untungDriver + untungMerchant;
            int totalTransMitra = jmlTransDriver + jmlTransMerchant;

            // menampilkan hasil mitra 
            System.out.println("\n[Hasil Mitra ke-" + i + "]");
            System.out.println("Keuntungan Driver   : Rp " + untungDriver);
            System.out.println("Keuntungan Merchant : Rp " + untungMerchant);
            System.out.println("Total Keuntungan    : Rp " + totalMitra);

            // total
            totalKeuntunganSemua += totalMitra;
            totalTransaksiSemua += totalTransMitra;
        }

        // rekap
        System.out.println(" REKAP KESELURUHN ");
        System.out.println("Total keuntungan dari semua mitra : Rp " + totalKeuntunganSemua);

        // menghitung rata2 keuntungan
        if (totalTransaksiSemua > 0) {
            double rataRata = totalKeuntunganSemua / totalTransaksiSemua;
            System.out.println("Rata-rata keuntungan / transaksi  : Rp " + rataRata);
        } else {
            System.out.println("Rata-rata keuntungan / transaksi  : Rp 0");
        }

        input.close();
    }
}