import java.util.Scanner;
public class CicilanLaptop25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y, z;
        double sisaHarga, cicilanPokok, bungaBulanan, cicilanPerBulan;

        System.out.print("Masukkan harga laptop (x): Rp ");
        x = sc.nextDouble();

        System.out.print("Masukkan uang muka (y): Rp ");
        y = sc.nextDouble();

        System.out.print("Masukkan lama cicilan/bulan (z): ");
        z = sc.nextDouble();

        sisaHarga = x - y;
        cicilanPokok = sisaHarga / z;
        bungaBulanan = 0.02 * sisaHarga;
        cicilanPerBulan = cicilanPokok + bungaBulanan;

        System.out.println("Sisa harga setelah DP: Rp " + sisaHarga);
        System.out.println("Jumlah cicilan yang harus dibayar per bulan: Rp " + cicilanPerBulan);

        sc.close();
    }
}