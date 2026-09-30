import java.util.Scanner;
public class NusantaraPay25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah akun dalam daftar hitam? (true/false): ");
        boolean isBlacklist = sc.nextBoolean();

        System.out.print("Masukkan sisa saldo: ");
        double sisaSaldo = sc.nextDouble();

        System.out.print("Masukkan nominal transaksi: ");
        double nominal = sc.nextDouble();

        System.out.print("Apakah dari luar negeri? (true/false): ");
        boolean isBedaNegara = sc.nextBoolean();

        System.out.print("Masukkan jam transaksi (0-23): ");
        int jamTransaksi = sc.nextInt();

        System.out.print("Apakah akun mencurigakan? (true/false): ");
        boolean isSuspicious = sc.nextBoolean();

        String status = "";

        if (isBlacklist) {
            status = "REJECTED_BLACKLIST";
        } else if (nominal > sisaSaldo) {
            status = "REJECTED_SALDO";
        } else if (nominal > 10000) {
            status = "REJECTED_LIMIT";
        } else if (isBedaNegara && nominal > 2000) {
            status = "FLAGGED_FRAUD";
        } else if ((jamTransaksi >= 0 && jamTransaksi <= 4) && nominal > 1000) {
            status = "REQUIRE_OTP_NIGHT";
        } else if (isSuspicious && nominal > 500) {
            status = "REQUIRE_OTP_SUSPICIOUS";
        } else {
            status = "APPROVED";
        }

        System.out.println("Status Akhir Transaksi: " + status);
        sc.close();
    }
}