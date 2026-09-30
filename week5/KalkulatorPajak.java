import java.util.Scanner;

public class KalkulatorPajak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai PKP pegawai (Rp): ");
        double pkp = sc.nextDouble();
        double pajak = 0;

        if (pkp <= 0) {
            pajak = 0;
        } else if (pkp <= 60000000) {
            pajak = pkp * 0.05;
        } else if (pkp <= 250000000) {
            pajak = (60000000 * 0.05) + ((pkp - 60000000) * 0.15);
        } else if (pkp <= 500000000) {
            pajak = (60000000 * 0.05) + (190000000 * 0.15) + ((pkp - 250000000) * 0.25);
        } else {
            pajak = (60000000 * 0.05) + (190000000 * 0.15) + (250000000 * 0.25) + ((pkp - 500000000) * 0.30);
        }

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Total PKP: Rp " + (long) pkp);
        System.out.println("Total PPh 21 yang harus dibayar: Rp " + (long) pajak);

        sc.close();
    }
}